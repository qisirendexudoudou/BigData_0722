package com.atguigu.mr.index;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;

/*
 * (atguigu-b.txt\t2)
 * 
 * 1. 指定使用KeyValueTextInputFormat,指定分隔符-
 */
public class IndexMapper2 extends Mapper<Text, Text, Text, Text>{
	
	
	

}
