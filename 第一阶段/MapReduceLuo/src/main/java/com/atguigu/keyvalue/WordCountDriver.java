package com.atguigu.keyvalue;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.KeyValueTextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import com.atguigu.keyvalue.WordCountMapper;
import com.atguigu.keyvalue.WordCountReducer;


public class WordCountDriver {

	public static void main(String[] args) throws Exception {
		
		//定义输入和输出路径
		Path input=new Path("G:\\0722\\练习题\\第三阶段\\mrinput\\keyvalue");
		Path output=new Path("G:\\0722\\练习题\\第三阶段\\mroutput\\keyvalue");
		
		Configuration conf = new Configuration();
		
		conf.set("mapreduce.job.inputformat.class", "org.apache.hadoop.mapreduce.lib.input.KeyValueTextInputFormat");
		
		conf.set("mapreduce.input.keyvaluelinerecordreader.key.value.separator", "*");
		
		//获取job对象
		Job job = Job.getInstance(conf);
		
		//获取当前job的配置对象
		//Configuration conf = job.getConfiguration();
		
		//基于配置构建当前job的文件系统
		FileSystem fs = FileSystem.get(conf);
		
		//检查输出路径，存在删掉
		if (fs.exists(output)) {
			fs.delete(output, true);
		}
		
		//指定输入路径和输出路径
		FileInputFormat.setInputPaths(job, input);	
		FileOutputFormat.setOutputPath(job, output);
		
		//设置job名称
		job.setJobName("job1");
		
		//当前指定类所在的jar包 就是运行需要jar包
		job.setJarByClass(WordCountDriver.class );
		
		
		//配置job
		job.setMapperClass(WordCountMapper.class);
		job.setReducerClass(WordCountReducer.class);
		
		//Mapper和Reducer输出的数据类型，job需要根据数据类型准备序列化器 
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		// 使用代码设置输入格式
		job.setInputFormatClass(KeyValueTextInputFormat.class);

		
		//提交job并运行
		 if (job.waitForCompletion(true)) {
			System.out.println("job运行完毕！");
		}
		
		
		
	}
}
