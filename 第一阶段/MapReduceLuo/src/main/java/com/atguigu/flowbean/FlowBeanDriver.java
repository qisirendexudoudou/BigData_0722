package com.atguigu.flowbean;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import com.atguigu.wordcount.WordCountDriver;
import com.atguigu.wordcount.WordCountMapper;
import com.atguigu.wordcount.WordCountReducer;

public class FlowBeanDriver {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		
		//定义输入和输出路径
		Path input=new Path("G:\\0722\\练习题\\第三阶段\\mrinput\\flowbean");
		Path output=new Path("G:\\0722\\练习题\\第三阶段\\mroutput\\flowbean");
				
		//获取job对象
		Job job = Job.getInstance();
		
		//获取当前job的配置对象
		Configuration conf = job.getConfiguration();
		
		//基于配置构建当前job的文件系统
				FileSystem fs = FileSystem.get(conf);
				
				//检查输出路径，存在删掉
				if (fs.exists(output)) {
					fs.delete(output, true);
				}
				
				//指定输入路径和输出路径
				FileInputFormat.setInputPaths(job, input);	
				FileOutputFormat.setOutputPath(job, output);
				
				//配置job
				job.setMapperClass(FlowBeanMapper.class);
				job.setReducerClass(FlowBeanReducer.class);
				
				//Mapper和Reducer输出的数据类型，job需要根据数据类型准备序列化器 
				job.setMapOutputKeyClass(Text.class);
				job.setMapOutputValueClass(FlowBean.class);
				
				job.setOutputKeyClass(Text.class);
				job.setOutputValueClass(FlowBean.class);
				
				//设置job名称
				job.setJobName("flowbeanjob");
				
				//job打包后jar包位置
				//job.setJar("MapReduce-0.0.1-SNAPSHOT.jar");
				
				//当前指定类所在的jar包 就是运行需要jar包
				job.setJarByClass(FlowBeanDriver.class );
				
				
				//提交job并运行
				 if (job.waitForCompletion(true)) {
					System.out.println("job运行完毕！");
				}
				
				
				
				
				
	}
}
