package com.atguigu.mr.reducejoin;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;

public class ReduceJoinMapper extends Mapper<LongWritable, Text, NullWritable, JoinBean>{

	private JoinBean out_value=new JoinBean();
	
	private String fileName;
	
	@Override
	protected void setup(Mapper<LongWritable, Text, NullWritable, JoinBean>.Context context)
			throws IOException, InterruptedException {
		
		FileSplit inputSplit = (FileSplit) context.getInputSplit();
		
		fileName=inputSplit.getPath().getName();
		
	}
	
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, NullWritable, JoinBean>.Context context)
			throws IOException, InterruptedException {
		
		String[] words = value.toString().split("\t");
		
		out_value.setSource(fileName);
		
		if (fileName.equals("order.txt")) {
			
			out_value.setOrderId(words[0]);
			out_value.setPid(words[1]);
			out_value.setAmount(words[2]);
			// 每个属性都要赋予非null值
			out_value.setPname("nodata");
		}else {
			
			out_value.setOrderId("nodata");
			out_value.setAmount("nodata");
			out_value.setPid(words[0]);
			out_value.setPname(words[1]);
			
			
		}
		
		context.write(NullWritable.get(), out_value);
		
		
	}
	
	
	
}
