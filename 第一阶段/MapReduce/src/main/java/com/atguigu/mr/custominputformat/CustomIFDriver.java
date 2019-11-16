package com.atguigu.mr.custominputformat;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import com.atguigu.mr.keyvaluetextinputformat.WordCountMapper;
import com.atguigu.mr.keyvaluetextinputformat.WordCountReducer;

// 负责定义Job,配置Job,提交运行Job
public class CustomIFDriver {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		
		// 定义输入路径
	Path input=new Path("E:\\mrinput\\custom");
		Path output=new Path("E:\\mroutput\\custom");
		
		Configuration conf = new Configuration();
		
		// 使用自定义的输入格式
		conf.set("mapreduce.job.inputformat.class", "com.atguigu.mr.custominputformat.MyInputFormat");
		
		// 设置输出格式为SequeceFileOutPutFormat
		conf.set("mapreduce.job.outputformat.class", "org.apache.hadoop.mapreduce.lib.output.SequenceFileOutputFormat");
		
		
		// 定义Job
		Job job = Job.getInstance(conf);
		
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
		job.setJarByClass(CustomIFDriver.class);
		//job.setJar("MapReduce-0.0.1-SNAPSHOT.jar");
		
		// 配置Job
		job.setMapperClass(CustomIFMapper.class);
		job.setReducerClass(CustomIFReducer.class);
		
		// Mapper和Reducer输出的数据类型，Job需要根据类型准备序列化器
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(BytesWritable.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(BytesWritable.class);
		
		/*job.setInputFormatClass(cls);
		job.setOutputFormatClass(cls);*/
		
		// 提交运行
		if (job.waitForCompletion(true)) {
			
			System.out.println("Job运行结束！");
			
		};
		
	}

}
