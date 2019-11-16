package com.atguigu.keyvalue;

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
public class WordCountMapper extends Mapper<Text, Text, Text, IntWritable> {
	
	//定义输出的kv对象
	private IntWritable out_value=new IntWritable(1) ;

	@Override
	protected void map(Text key, Text value, Context context)
			throws IOException, InterruptedException {

			//输出key-value
			context.write(key, out_value);
		}
	} 
