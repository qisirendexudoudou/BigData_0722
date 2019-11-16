package com.atguigu.mr.reducejoin;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import com.atguigu.mr.reducejoin.JoinBean;
import com.atguigu.mr.reducejoin.ReduceJoinMapper;
import com.atguigu.mr.reducejoin.ReduceJoinReducer;


public class ReduceJoinDriver {
	
	
		
		public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
			
			// 定义输入路径
			Path input=new Path("E:\\mrinput\\reducejoin");
			Path output=new Path("E:\\mroutput\\reducejoin");
			
			
			Configuration conf = new Configuration();
			
			
			
			// 定义Job
			Job job = Job.getInstance(conf);
			
		
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
			job.setJarByClass(ReduceJoinDriver.class);
			//job.setJar("MapReduce-0.0.1-SNAPSHOT.jar");
			
			// 配置Job
			job.setMapperClass(ReduceJoinMapper.class);
			job.setReducerClass(ReduceJoinReducer.class);
			
			// Mapper和Reducer输出的数据类型，Job需要根据类型准备序列化器
			job.setMapOutputKeyClass(NullWritable.class);
			job.setMapOutputValueClass(JoinBean.class);
			
			job.setOutputKeyClass(JoinBean.class);
			job.setOutputValueClass(NullWritable.class);
		
		
			// 提交运行
			if (job.waitForCompletion(true)) {
				
				System.out.println("Job运行结束！");
				
			};
			
		}
		
		
	

}
