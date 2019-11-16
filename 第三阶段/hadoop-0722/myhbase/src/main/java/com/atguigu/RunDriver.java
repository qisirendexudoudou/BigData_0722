package com.atguigu;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.mapreduce.TableMapReduceUtil;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Job;

import java.io.IOException;

public class RunDriver {
    public static void main(String[] args) {
        Configuration conf = HBaseConfiguration.create();
        conf.set("hbase.zookeeper.quorum","hadoop101,hadoop102,hadoop103");

        try {
            Job job = Job.getInstance(conf,"hbase_mr1");
            job.setJarByClass(RunDriver.class);

            Connection conn = ConnectionFactory.createConnection(conf);
            HBaseAdmin admin = (HBaseAdmin) conn.getAdmin();
            if (!admin.tableExists("t_sink")) {
                // 创建
                HTableDescriptor tableDescriptor = new HTableDescriptor(TableName.valueOf("t_sink"));
                HColumnDescriptor family1 = new HColumnDescriptor("info".getBytes());
                family1.setMaxVersions(1);
                tableDescriptor.addFamily(family1);
                admin.createTable(tableDescriptor);
            }


            //是否把hbase作为MR的数据源
            TableMapReduceUtil.initTableMapperJob("fruit2",initScan(),ReadHbaseMapper.class,NullWritable.class,Put.class,job,true);
            //是否把hbase作为MR的数据目标
            TableMapReduceUtil.initTableReducerJob("t_sink",null,job,null,null,null,null,true);

            //说明没有reduce
            job.setNumReduceTasks(0);

            boolean f = job.waitForCompletion(true);
            if (f) {
                System.out.println("执行成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private static Scan initScan() {
        Scan scan = new Scan();
        scan.setCaching(100);
        return scan;
    }
}
