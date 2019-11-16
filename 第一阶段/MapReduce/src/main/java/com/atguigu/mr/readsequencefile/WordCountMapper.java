package com.atguigu.mr.readsequencefile;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.JobContext;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;


public class WordCountMapper extends Mapper<Text, BytesWritable, Text, Text>{
	
	//定义输出的Key-value
	private Text out_value=new Text();
	
	@Override
	protected void map(Text key, BytesWritable value, Mapper<Text, BytesWritable, Text, Text>.Context context)
			throws IOException, InterruptedException {
		
		// 从SequnceFile中，使用copyBytes()，不要用getBytes()
		byte[] content1 = value.getBytes();
		
		byte[] content2 = value.copyBytes();
		
		
		
		out_value.set(new String(content1));
		
		context.write(key, out_value);
		
		out_value.set(new String(content2));
		
		context.write(key, out_value);
		
		
	}
	

}
