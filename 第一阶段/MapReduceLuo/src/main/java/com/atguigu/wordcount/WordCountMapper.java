package com.atguigu.wordcount;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/*
 * LongWritable, 输入key的类型  偏移量作为key 
 * Text, 输入value的类型，每一行的内容作为value
 * Text, 输出key的类型，  比如单词
 * IntWritable 输出value的类型，比如 单词个数
 */
public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	
	//定义输出的kv对象
	private Text out_key=new Text();
	private IntWritable out_value=new IntWritable(1) ;

	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		
		//每一行的内容按"空格"切分，每个单词计1 
		String[] words = value.toString().split(" ");
		
		for (String word : words) {
			//封装数据到key中
			out_key.set(word);
			//输出key-value
			context.write(out_key, out_value);
		}
		 
		
		
	} 
} 
