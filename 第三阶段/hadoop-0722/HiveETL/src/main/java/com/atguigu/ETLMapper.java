package com.atguigu;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Counter;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class ETLMapper extends Mapper<LongWritable,Text,Text,NullWritable> {

    private StringBuilder sb = new StringBuilder();
    private Text v = new Text();
    private Counter pass;
    private Counter fail;

    @Override
    protected void setup(Context context) throws IOException, InterruptedException {
        pass = context.getCounter("etl", "pass");
        fail = context.getCounter("etl", "fail");
    }

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        //切分日志
        String[] fields = value.toString().split("\t");

        if (fields.length >= 9) {


            // 处理第四段
            fields[3] = fields[3].replace(" ", "");

            //拼接字符串
            sb.setLength(0);

            for (int i = 0; i < fields.length; i++) {
                if (i == fields.length - 1) {
                    sb.append(fields[i]);
                } else if (i <= 8) {
                    sb.append(fields[i]).append("\t");
                } else {
                    sb.append(fields[i]).append("&");
                }
            }

            v.set(sb.toString());

            context.write(v, NullWritable.get());
            pass.increment(1);
        } else {
            fail.increment(1) ;
        }

    }
}
