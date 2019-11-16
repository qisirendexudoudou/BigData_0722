package com.atguigu.mr.index;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;

public class IndexMapper1 extends Mapper<LongWritable, Text, Text, IntWritable>{
	
	private String fileName;
	
	private Text out_key=new Text();
	
	private IntWritable out_value=new IntWritable(1);
	
	@Override
	protected void setup(Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		
	FileSplit split=(FileSplit) context.getInputSplit();
	
	fileName=split.getPath().getName();
		
	}
	
	//atguigu pingping
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		
		String[] words = value.toString().split(" ");
		
		for (String word : words) {
			
			out_key.set(word+"-"+fileName);
			
			context.write(out_key, out_value);
			
		}
		
		
	}

}
