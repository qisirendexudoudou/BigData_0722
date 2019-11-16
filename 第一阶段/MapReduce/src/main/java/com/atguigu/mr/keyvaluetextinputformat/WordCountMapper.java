package com.atguigu.mr.keyvaluetextinputformat;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.JobContext;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;

public class WordCountMapper extends Mapper<Text, Text, Text, IntWritable>{
	

	private IntWritable out_value=new IntWritable(1);
	
	//读取每一行的内容，将当前行，使用空格切分，切分后的每个单词，记1
	@Override
	protected void map(Text key, Text value, Context context)
			throws IOException, InterruptedException {
	
			// 输出Key-value
			context.write(key, out_value);
		
	}
	

}
