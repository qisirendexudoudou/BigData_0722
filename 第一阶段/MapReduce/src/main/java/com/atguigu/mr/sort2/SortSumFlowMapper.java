package com.atguigu.mr.sort2;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
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
public class SortSumFlowMapper extends Mapper<LongWritable, Text, FlowBean2, NullWritable>{
	
	private FlowBean2 out_key=new FlowBean2();
	
	
	@Override
	protected void map(LongWritable key, Text value,Context context)
			throws IOException, InterruptedException {
		
		String[] words = value.toString().split("\t");
		
		out_key.setPhoneNum(words[0]);
		out_key.setUpFlow(Long.parseLong(words[1]));
		out_key.setDownFlow(Long.parseLong(words[2]));
		
		out_key.setSumFlow(Long.parseLong(words[3]));
		
		context.write(out_key, NullWritable.get());
		
	}

}
