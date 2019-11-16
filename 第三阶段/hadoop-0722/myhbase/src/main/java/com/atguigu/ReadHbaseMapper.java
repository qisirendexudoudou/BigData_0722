package com.atguigu;


import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.io.ImmutableBytesWritable;
import org.apache.hadoop.hbase.mapreduce.TableMapper;
import org.apache.hadoop.io.NullWritable;

import java.io.IOException;

/**
 * 读取hbase的表数据 插入到另一张表中去
 */
public class ReadHbaseMapper extends TableMapper<NullWritable,Put> {
    @Override
    protected void map(ImmutableBytesWritable key, Result value, Context context) throws IOException, InterruptedException {
        Put put = new Put(key.get());
        for (Cell cell : value.rawCells()) {
            put.add(cell);
        }
        context.write(NullWritable.get(), put);
    }

    @Override
    protected void setup(Context context) throws IOException, InterruptedException {

    }
}