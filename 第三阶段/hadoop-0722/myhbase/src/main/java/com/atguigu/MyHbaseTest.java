package com.atguigu;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;


public class MyHbaseTest {
    //客户端的连接对象,单例
    public Connection connection = null;
    public Configuration conf=null;

    TableName tn = TableName.valueOf("t_stu2");
    byte[] cf1 = Bytes.toBytes("cf1");
    byte[] cf2 = Bytes.toBytes("cf2");
    byte[] cf3 = Bytes.toBytes("cf3");

    @Before
    public void before(){
        conf=HBaseConfiguration.create();
        conf.set("hbase.zookeeper.quorum","hadoop101,hadoop102,hadoop103");
        try {
            //连接池对象
            connection = ConnectionFactory.createConnection(conf);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @After
    public  void after(){
        //一个项目结束后关闭conn
    }

    /**
     * DDL操作
     *  1.表的ddl,主要使用Admin对象
     *  2.namespase的ddl
     */
    @Test
    public  void tabletestDDL(){

        try {
            HBaseAdmin admin = (HBaseAdmin) connection.getAdmin();
            //判断表是否存在
            if (admin.tableExists(tn)) {
                //如果表存在，删除表
                admin.disableTable(tn);
                admin.deleteTable(tn);
            }
            //创建表
            HTableDescriptor tableDescriptor = new HTableDescriptor(tn);
            //创建列族
            HColumnDescriptor family1 = new HColumnDescriptor(cf1);
            HColumnDescriptor family2 = new HColumnDescriptor(cf2);
            HColumnDescriptor family3 = new HColumnDescriptor(cf3);
            //设置属性
            family1.setMaxVersions(1);
            family2.setMaxVersions(2);
            //将列族添加至表
            tableDescriptor.addFamily(family1).addFamily(family2);
            //最后一步创建表
            admin.createTable(tableDescriptor);

            //修改表结构 1.添加列族 2.删除列族
//            family3.setMaxVersions(3);
//            admin.addColumn(tn,family3);

//             admin.deleteColumn(tn,Bytes.toBytes("cf2"));

            //每一步结束后 关闭admin
            admin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void namespacetestDDL(){
        try {
            HBaseAdmin hBaseAdmin = (HBaseAdmin) connection.getAdmin();
            //创建命名空间
//            NamespaceDescriptor dn = NamespaceDescriptor.create("test_ns").build();
//            hBaseAdmin.createNamespace(dn);

            //删除命名空间
            hBaseAdmin.deleteNamespace("test_ns");

            //关闭admin
            hBaseAdmin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * DML操作:使用table对象
     * 1.插入数据
     * 2.修改数据
     * 3.删除数据
     */
    @Test
    public  void testDML(){
        try {
            //插入数据
            HTable hTable = (HTable) connection.getTable(tn);
            //添加单元格
            byte[] rk = Bytes.toBytes("1002");
            Put put = new Put(rk);
            put.addColumn(cf2, "name".getBytes(), "lisi".getBytes());
            put.addColumn(cf2, "city".getBytes(), "baoji".getBytes());
            hTable.put(put);

            //删除数据
            //删除指定单元格的数据
//            Delete delete = new Delete(rk);
//            delete.addColumn(cf1, "city".getBytes());
//            hTable.delete(delete);

            //删除整个列族
//            Delete delete = new Delete(rk);
//            delete.addFamily("cf1".getBytes());
//            hTable.delete(delete);

            //删除整行
//            Delete delete = new Delete(rk);
//            hTable.delete(delete);
            //关闭htable
            hTable.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * DML中的查询
     * 1.get
     * 2.scan
     */
    @Test
    public  void testDML2(){
        try {
            HTable hTable = (HTable) connection.getTable(tn);

            //查询
            byte[] rk = Bytes.toBytes("1002");
            Get get =new Get(rk);
            get.addColumn(cf2, "name".getBytes());
            Result result = hTable.get(get);
//            System.out.println(Bytes.toString(result.getValue(cf2, "city".getBytes())));
//            System.out.println(Bytes.toString(result.getValue(cf2, "name".getBytes())));
//            System.out.println(Bytes.toString(result.getValue(cf2, "sex".getBytes())));
//            System.out.println(Bytes.toString(result.getValue(cf2, "phone".getBytes())));

            //返回该行所有列的版本数据
            for (Cell cell:result.rawCells()) {
                System.out.println("rk: " +Bytes.toString(CellUtil.cloneRow(cell)) +""+
                                    "family: " +Bytes.toString(CellUtil.cloneFamily(cell))+""+
                                    "cloumn: " + Bytes.toString(CellUtil.cloneQualifier(cell))+""+
                                    "value: " + Bytes.toString(CellUtil.cloneValue(cell))+""+
                                    "version: "+ cell.getTimestamp());
            }
//            for(Cell cell:result.rawCells()){
//
//                System.out.println("rowkey: "+Bytes.toString(CellUtil.cloneRow(cell))+"" +
//                        "family:"+Bytes.toString(CellUtil.cloneFamily(cell))+"" +
//                        "column: "+Bytes.toString(CellUtil.cloneQualifier(cell))+"" +
//                        "version: "+cell.getTimestamp()+" " +
//                        "value :"+Bytes.toString(CellUtil.cloneValue(cell)));
//            }


            //关闭htable
            hTable.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * scan
     */
    @Test
    public  void testDML3(){
        try {
            HTable hTable = (HTable) connection.getTable(tn);
//            byte[] sr = Bytes.toBytes();
            Scan scan =new Scan();
            ResultScanner rss = null;
            try {
                rss = hTable.getScanner(scan);
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (Result result : rss) {
                for (Cell cell : result.rawCells()) {

                    System.out.println("rowkey: " + Bytes.toString(CellUtil.cloneRow(cell)) + "" +
                            "family:" + Bytes.toString(CellUtil.cloneFamily(cell)) + "" +
                            "column: " + Bytes.toString(CellUtil.cloneQualifier(cell)) + "" +
                            "version: " + cell.getTimestamp() + " " +
                            "value :" + Bytes.toString(CellUtil.cloneValue(cell)));
                }
            }
                hTable.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
