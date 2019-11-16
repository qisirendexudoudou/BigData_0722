package com.atguigu.mr.sort;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/*
 * 1. 按照总流量对手机号排序
 * 			排序器系统已经提供，排序也是自动排序！
 * 			提供比较器，key的比较器，默认只对key排序。
 * 
 * 		总流量作为key:
 * 		手机号作为value:
 */
public class SortSumFlowMapper extends Mapper<LongWritable, Text, LongWritable, Text>{
	
	private LongWritable out_key=new LongWritable();
	
	private Text out_value=new Text();
	//13470253144	180	180	360
	
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, LongWritable, Text>.Context context)
			throws IOException, InterruptedException {
		
		String[] words = value.toString().split("\t");
		
		out_value.set(words[0]);
		
		out_key.set(Long.parseLong(words[3]));
		
		context.write(out_key, out_value);
		
	}

}
