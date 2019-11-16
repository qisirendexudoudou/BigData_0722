package com.atguigu.hbase.test;

import javafx.scene.control.Cell;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class TestHbase {
    TableName tn =TableName.valueOf("t_stu2");
    byte[] cf1= Bytes.toBytes("cf1");
    byte[] cf2= Bytes.toBytes("cf2");
    public Connection conn=null; //客户端的连接对象,单例
    public Configuration conf=null;

    @Before
    public void before(){
        conf = HBaseConfiguration.create();
        conf.set("hbase.zookeeper.quorum","hadoop101,hadoop102,hadoop103");
        try {
            conn =ConnectionFactory.createConnection(conf);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void after(){
        //一个项目结束才关闭conn
    }

    /**
     * ddl操作：
     * 1、表的ddl，主要用到admin对象。
     * 2、namespace的ddl
     */
    @Test
    public void testDDL(){

        try {
            HBaseAdmin admin = (HBaseAdmin) conn.getAdmin(); //hbaseadmin对象方法多一些

            //查询
            if(admin.tableExists(tn)){ //如果表存在则删除
                //删除
                admin.disableTable(tn);
                admin.deleteTable(tn);
            }
            // 创建
            HTableDescriptor tableDescriptor =new HTableDescriptor(tn);
            HColumnDescriptor family1=new HColumnDescriptor(cf1);
            family1.setMaxVersions(1);
            HColumnDescriptor family2=new HColumnDescriptor(cf2);
            family2.setMaxVersions(2);
            tableDescriptor.addFamily(family1).addFamily(family2);
            admin.createTable(tableDescriptor);

            //修改表结构：2、添加一个新列族 ，1、删除列族
//            admin.deleteColumn();
//            admin.addColumn();




            //每一步操作结束关闭admin
            admin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNameSpaceDDL(){
        //命名空间的DDL

        try {
            HBaseAdmin admin = (HBaseAdmin) conn.getAdmin(); //hbaseadmin对象方法多一些
            NamespaceDescriptor nd =NamespaceDescriptor.create("test_ns").build();
            admin.createNamespace(nd);

            //每一步操作结束关闭admin
            admin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * DML操作使用Htable对象
     * 1、插入数据
     * 2、修改数据
     * 3、删除数据
     */
    @Test
    public void testDML1(){
        try {
            HTable table = (HTable) conn.getTable(tn);
            byte[] rowkey =Bytes.toBytes("1001");
            //新增
//            Put put =new Put(rowkey);
//            put.addColumn(cf1,"sex".getBytes(),"女".getBytes()) ;//添加单元格
//            put.addColumn(cf2,"city".getBytes(),"beijing".getBytes()) ;//添加单元格
//            table.put(put);

            //删除,api的删除功能比较强大
            Delete delete =new Delete(rowkey);
            //删除指定列，和版本的数据(包的低于当前版本的所有cell)
//            delete.addColumns(cf2,"city".getBytes(),1572848501831L);
            //删除city列：删除列里面的所有cell，(包的低于当前版本的所有cell)
//            delete.addColumns(cf2,"city".getBytes());
            //删除cf1整个列族的(包的低于当前版本的所有cell)
//            delete.addFamily(cf1);
            //删除一行数据(包的低于当前版本的所有cell)

            table.delete(delete);
            /**
             * 1、删除本质上都是put。
             * 2、删除的type可以加在column和column family。并且可以删除指定版本，或者小于等于当前指定版本的单元格.如果不指定版本则删除最近版本的cell
             * 3、删除一行数据，本质上，就是删除当前行所有的列族，包括这些列族中小于等于当前服务器时间的所有cell
             */

            //关闭
            table.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * DML中简单查询：
     * 1、get
     * 2、scan
     */
    @Test
    public void testDML2(){
        try {
            HTable table = (HTable) conn.getTable(tn);
            byte[] rowkey =Bytes.toBytes("1001");
            //查询一行数据,默认是最后一个版本
            Get get =new Get(rowkey);
            get.setMaxVersions(5);
            //查询某一行的其中一列
            get.addColumn(cf2,"city".getBytes()); //在生产环境下经常使用

            Result result = table.get(get); //result代表hbase中的一行数据
            //该行中所有的列只返回最后一个版本
//            String name = Bytes.toString(result.getValue(cf1, "name".getBytes()));
//            String city = Bytes.toString(result.getValue(cf2, "city".getBytes()));
//            System.out.println("name："+name+",city: "+city);

            //返回该行所有列的所有版本
            for(Cell cell:result.rawCells()){

                System.out.println("rowkey: "+Bytes.toString(CellUtil.cloneRow(cell))+"" +
                        "family:"+Bytes.toString(CellUtil.cloneFamily(cell))+"" +
                        "column: "+Bytes.toString(CellUtil.cloneQualifier(cell))+"" +
                        "version: "+cell.getTimestamp()+" " +
                        "value :"+Bytes.toString(CellUtil.cloneValue(cell)));
            }


            table.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }


    /**
     * DML中简单查询：
     *
     * 2、scan
     */
    @Test
    public void testDML3() {
        try {
            HTable table = (HTable) conn.getTable(tn);

            Scan scan = new Scan();//1、空参数就是全表扫描。2、startrow或者stoprow范围扫描
            scan.setMaxVersions(2);
            ResultScanner rss = table.getScanner(scan);
            for (Result result : rss) {
                for (Cell cell : result.rawCells()) {

                    System.out.println("rowkey: " + Bytes.toString(CellUtil.cloneRow(cell)) + "" +
                            "family:" + Bytes.toString(CellUtil.cloneFamily(cell)) + "" +
                            "column: " + Bytes.toString(CellUtil.cloneQualifier(cell)) + "" +
                            "version: " + cell.getTimestamp() + " " +
                            "value :" + Bytes.toString(CellUtil.cloneValue(cell)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
