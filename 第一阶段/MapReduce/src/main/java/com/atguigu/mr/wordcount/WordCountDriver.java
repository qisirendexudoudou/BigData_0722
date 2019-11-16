package com.atguigu.mr.wordcount;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import com.atguigu.mr.wordcount.WordCountMapper;
import com.atguigu.mr.wordcount.WordCountReducer;

// 负责定义Job,配置Job,提交运行Job
public class WordCountDriver {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		
		// 定义输入路径
	Path input=new Path("E:\\mrinput\\wordcount");
		Path output=new Path("E:\\mroutput\\wordcount");
		
		/*Path input=new Path("/mrinput/wordcount");
		Path output=new Path("/mroutput/wordcount");*/
		
		Configuration conf = new Configuration();
		
		conf.set("mapreduce.task.io.sort.mb", "50");
		
		// 设置reduce使用压缩
		conf.set("mapreduce.output.fileoutputformat.compress", "true");
		conf.set("mapreduce.output.fileoutputformat.compress.codec", "org.apache.hadoop.io.compress.GzipCodec");
		
		// 在Map输出使用压缩   520000---》163153
		conf.set("mapreduce.map.output.compress", "true");
		
		// 在Map输入指定压缩格式,如果Map输入文件不是Hadoop自带的三种压缩格式，需要设置
		//conf.set("", value);
		
		
		// 定义Job
		Job job = Job.getInstance(conf);
		
		//获取当前Job的配置对象
		
		//conf.set("fs.defaultFS", "hdfs://hadoop101:9000");
		
		/*
		
		conf.set("mapreduce.framework.name", "yarn");
		
		conf.set("yarn.resourcemanager.hostname", "hadoop102");
		
		conf.set("yarn.nodemanager.aux-services", "mapreduce_shuffle");*/
	
		// 基于配置构建当前Job的文件系统
		FileSystem fs=FileSystem.get(conf);
		
		// 检查输出目录是否已经存在
		if (fs.exists(output)) {
			
			fs.delete(output, true);
			
		}
		
		// 指定输入文件和输出路径
		FileInputFormat.setInputPaths(job, input);
		// 输出格式，负责将reducer输出的key-value写入到指定目录
		FileOutputFormat.setOutputPath(job, output);
		
		// 设置一个名称
		job.setJobName("mywc");
		
		// 设置Job打包后，Jar包所在的位置
		
		// 当前指定类所在的jar包，就是要运行的目标jar包
		job.setJarByClass(WordCountDriver.class);
		//job.setJar("MapReduce-0.0.1-SNAPSHOT.jar");
		
		// 配置Job
		job.setMapperClass(WordCountMapper.class);
		job.setReducerClass(WordCountReducer.class);
		
		// Mapper和Reducer输出的数据类型，Job需要根据类型准备序列化器
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		// 设置Combiner
		job.setCombinerClass(WordCountReducer.class);
		
		
		
		// 提交运行
		if (job.waitForCompletion(true)) {
			
			System.out.println("Job运行结束！");
			
		};
		
	}

}
