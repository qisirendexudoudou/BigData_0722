package com.atguigu.mr.nlineinputformat;

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

import com.atguigu.mr.nlineinputformat.WordCountMapper;
import com.atguigu.mr.nlineinputformat.WordCountReducer;

// 负责定义Job,配置Job,提交运行Job
public class WordCountDriver {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		
		// 定义输入路径
	Path input=new Path("E:\\mrinput\\nline");
		Path output=new Path("E:\\mroutput\\nline");
		
		/*Path input=new Path("/mrinput/wordcount");
		Path output=new Path("/mroutput/wordcount");*/
		
		Configuration conf= new Configuration();
		
		//设置使用NlineInputFormat
		conf.set("mapreduce.job.inputformat.class", "org.apache.hadoop.mapreduce.lib.input.NLineInputFormat");
		
		// 每多少行切一个片
		conf.set("mapreduce.input.lineinputformat.linespermap", "2");
		
		// 在Job构建之前，配置各种设置才会在Job中生效定义Job
		Job job = Job.getInstance(conf);
		
		//获取当前Job的配置对象
		
	
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
		
		
		// 提交运行
		if (job.waitForCompletion(true)) {
			
			System.out.println("Job运行结束！");
			
		};
		
	}

}
