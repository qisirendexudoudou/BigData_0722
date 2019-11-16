package com.atguigu.mr.index;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class IndexReducer1 extends Reducer<Text, IntWritable, Text, IntWritable>{

	private IntWritable out_value=new IntWritable();
	
	@Override
	protected void reduce(Text key, Iterable<IntWritable> values,
			Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
		
		int sum=0;
		
		for (IntWritable intWritable : values) {
			
			sum+=intWritable.get();
			
		}
		
		out_value.set(sum);
		
		context.write(key, out_value);
		
	}
}
