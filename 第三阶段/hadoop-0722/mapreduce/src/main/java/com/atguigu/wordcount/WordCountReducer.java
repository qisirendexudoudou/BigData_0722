package com.atguigu.wordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;


public class WordCountReducer extends Reducer<Text,IntWritable,Text,IntWritable> {

    private IntWritable out_value=new IntWritable();
    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
        int sum=0;
        Iterator<IntWritable> iterator = values.iterator();
        while(iterator.hasNext()){
            IntWritable intWritable = iterator.next();
            sum+=intWritable.get();
        }
        out_value.set(sum);
        context.write(key,out_value);
    }
}
