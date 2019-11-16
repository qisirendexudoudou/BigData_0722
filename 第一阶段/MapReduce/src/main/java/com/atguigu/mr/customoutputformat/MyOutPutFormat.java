package com.atguigu.mr.customoutputformat;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.RecordWriter;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class MyOutPutFormat extends FileOutputFormat<Text, Text>{

	// 记录写出器
	@Override
	public RecordWriter<Text, Text> getRecordWriter(TaskAttemptContext job) throws IOException, InterruptedException {
		return new MyRecordWriter(job);
	}

}
