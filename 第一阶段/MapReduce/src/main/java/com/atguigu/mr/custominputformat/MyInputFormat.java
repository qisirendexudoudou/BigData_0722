package com.atguigu.mr.custominputformat;

import java.io.IOException;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.JobContext;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;

/*
 * FileInputFormat<K, V>: key-value指RR所读取的k-v类型
 */
public class MyInputFormat extends FileInputFormat<Text, BytesWritable>{
	
	// 控制每个文件只切1片
	@Override
	protected boolean isSplitable(JobContext context, Path filename) {
		return false;
	}

	// 提供RecordReader
	@Override
	public RecordReader<Text, BytesWritable> createRecordReader(InputSplit split, TaskAttemptContext context)
			throws IOException, InterruptedException {
		return new MyRecordReader(split,context);
	}

}
