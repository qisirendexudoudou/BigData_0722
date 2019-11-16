package com.atguigu.mr.groupingcomparator;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class OrderBeanMapper extends Mapper<LongWritable, Text, OrderBean, NullWritable>{
	
	private OrderBean out_key=new OrderBean();
	
	@Override
	protected void map(LongWritable key, Text value,
			Mapper<LongWritable, Text, OrderBean, NullWritable>.Context context)
			throws IOException, InterruptedException {
		
		String[] words = value.toString().split("\t");
		
		out_key.setOrderId(words[0]);
		out_key.setProductId(words[1]);
		out_key.setAmount(Double.parseDouble(words[2]));
		
		context.write(out_key, NullWritable.get());
		
	}

}
