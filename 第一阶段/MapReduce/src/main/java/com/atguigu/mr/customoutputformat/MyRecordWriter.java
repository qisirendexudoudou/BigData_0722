package com.atguigu.mr.customoutputformat;

import java.io.IOException;
import java.io.OutputStream;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.RecordWriter;
import org.apache.hadoop.mapreduce.TaskAttemptContext;

/*
 * 1. 在write中对 要写出的key-value，进行判断
 * 		如果key中包含atguigu,写到e:/atguigu.log
 *      否则，写出到e:/other.log
 */
public class MyRecordWriter extends RecordWriter<Text, Text> {
	
	private FileSystem fs;
	private Path atguiguPath=new Path("e:/atguigu.log");
	private Path otherPath=new Path("e:/other.log");
	
	private OutputStream atguiguOS;
	private OutputStream otherOs;
	
	private TaskAttemptContext job;
	
	public MyRecordWriter(TaskAttemptContext job) throws IOException {
		
		this.job=job;
		
		Configuration conf = job.getConfiguration();
		
		fs=FileSystem.get(conf);
		
		 atguiguOS = fs.create(atguiguPath, true);
		 otherOs = fs.create(otherPath, true);
		
	}

	// 将key-value写出
	@Override
	public void write(Text key, Text value) throws IOException, InterruptedException {
		
		
		
		if (key.toString().contains("atguigu")) {
			
			atguiguOS.write((key.toString()+"\r\n").getBytes());
			
			
			job.getCounter("OutCounter", "atguigu").increment(1);
			
		}else {
			
			otherOs.write((key.toString()+"\r\n").getBytes());
			
			job.getCounter("OutCounter", "other").increment(1);
			
		}
		
		
	}

	// 关闭操作
	@Override
	public void close(TaskAttemptContext context) throws IOException, InterruptedException {
	
		if (atguiguOS != null) {
			IOUtils.closeStream(atguiguOS);
		}
		
		if (otherOs != null) {
			IOUtils.closeStream(otherOs);
		}
		
		if (fs != null) {
			fs.close();
		}
	
	
	}

}
