package com.atguigu.mr.flowbean;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

//  输出：    手机号---FlowBean(上行，下行，总流量)

// key-value的选择：  在Hadoop中，Mapper输出的key，会默认对key进行排序和分组！

// 只要有reduce阶段，map输出的key-value都必须是序列化类型
public class FlowBeanMapper extends Mapper<LongWritable, Text, Text, FlowBean>{
	
	private Text out_key=new Text();
	private FlowBean out_value=new FlowBean();
	
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, FlowBean>.Context context)
			throws IOException, InterruptedException {
		
		String[] words = value.toString().split("\t");
		
		out_key.set(words[1]);
		
		long upFlow=Long.parseLong(words[words.length-3]);
		long downFlow=Long.parseLong(words[words.length-2]);
		
		out_value.setUpFlow(upFlow);
		out_value.setDownFlow(downFlow);
		
		//写出
		context.write(out_key, out_value);
	}

}
