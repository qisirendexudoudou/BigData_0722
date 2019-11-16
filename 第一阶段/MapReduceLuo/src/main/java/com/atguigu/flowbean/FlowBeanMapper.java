 package com.atguigu.flowbean;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class FlowBeanMapper extends Mapper<LongWritable, Text, Text, FlowBean>{

	private Text out_key=new Text();
	private FlowBean out_value=new FlowBean();
	
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, FlowBean>.Context context)
			throws IOException, InterruptedException {
		
		//设置分隔符 切片
		String[] words = value.toString().split("\t");
		
		//封装key
		out_key.set(words[1]);
		
		//封装value
		long upFlow = Long.parseLong(words[words.length-3]);
		long downFlow = Long.parseLong(words[words.length-2]);
		
		out_value.setUpFlow(upFlow);
		out_value.setDownFlow(downFlow);
		
		//写出
		context.write(out_key, out_value);
	
	}
}
