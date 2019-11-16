package com.atguigu.mr.index;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.KeyValueTextInputFormat;
import org.apache.hadoop.mapreduce.lib.jobcontrol.ControlledJob;
import org.apache.hadoop.mapreduce.lib.jobcontrol.JobControl;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


/*
 * 1.指定多个Job串行运行
 * 			使用JobControl对象，来指定一组Job，指定其依赖关系。
 * 
 * 		JobControl.addJob(ControledJob): 向一个JobControl对象中添加需要运行的Job
 * 
 * 			ControldJob: 可以调用 new ControldJob(Configuration)来基于配置创建一个ControldJob对象！
 * 				ControldJob. addDependingJob(ControlledJob dependingJob): 指定依赖关系！
 */
public class IndexDriver {
	
	public static void main(String[] args) throws IOException {
		
		//指定路径
		Path inputPath=new Path("e:/mrinput/index");
		Path outputPath=new Path("e:/mroutput/index");
		Path finaloutputPath=new Path("e:/mroutput/finalindex");
		
		Configuration conf1= new Configuration();
		Configuration conf2= new Configuration();
		
		// 设置分隔符
		conf2.set("mapreduce.input.keyvaluelinerecordreader.key.value.separator", "-");
		
		FileSystem fs=FileSystem.get(conf1);
		
		if (fs.exists(outputPath)) {
			
			fs.delete(outputPath, true);
			
		}
		
		if (fs.exists(finaloutputPath)) {
			
			fs.delete(finaloutputPath, true);
			
		}
		
		// ①创建Job1
		Job job1 = Job.getInstance(conf1);
		
		job1.setMapperClass(IndexMapper1.class);
		job1.setReducerClass(IndexReducer1.class);
		
		job1.setMapOutputKeyClass(Text.class);
		job1.setMapOutputValueClass(IntWritable.class);
		
		job1.setOutputKeyClass(Text.class);
		job1.setOutputValueClass(IntWritable.class);
		
		FileInputFormat.setInputPaths(job1, inputPath);
		// 输出格式，负责将reducer输出的key-value写入到指定目录
		FileOutputFormat.setOutputPath(job1, outputPath);
		
		job1.setJobName("index1");
		
		job1.setJarByClass(IndexDriver.class);
		
		// ②构建Job2
		Job job2 = Job.getInstance(conf2);
		
		
		job2.setMapperClass(IndexMapper2.class);
		job2.setReducerClass(IndexReducer2.class);
		
		job2.setMapOutputKeyClass(Text.class);
		job2.setMapOutputValueClass(Text.class);
		
		job2.setOutputKeyClass(Text.class);
		job2.setOutputValueClass(Text.class);
		
		job2.setInputFormatClass(KeyValueTextInputFormat.class);
		
		FileInputFormat.setInputPaths(job2, outputPath);
		// 输出格式，负责将reducer输出的key-value写入到指定目录
		FileOutputFormat.setOutputPath(job2, finaloutputPath);
		
		job2.setJobName("index2");
		
		job2.setJarByClass(IndexDriver.class);
		
		// ③基于Job1,Job2的配置，再构建其ControldJob，并指定依赖关系
		ControlledJob controlledJob1 = new ControlledJob(job1.getConfiguration());
		ControlledJob controlledJob2 = new ControlledJob(job2.getConfiguration());
		
		controlledJob2.addDependingJob(controlledJob1);
		
		// ④创建JobControl，添加要运行的ControldJob，运行JobControl
		JobControl jobControl = new JobControl("index");
		
		jobControl.addJob(controlledJob1);
		jobControl.addJob(controlledJob2);
		
		// 运行
		new Thread(jobControl).start();
		
		while(true) {
			
			if (jobControl.allFinished()) {
				
				System.out.println(jobControl.getSuccessfulJobList());
				
				break;
				
			}
		}
		
	}

}
