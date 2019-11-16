package com.atguigu.wordcount;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable>{

	private IntWritable out_value=new IntWritable();
	int sum=0;
	
	@Override
	protected void reduce(Text key, Iterable<IntWritable> values,
			Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
		
		Iterator<IntWritable> iterator = values.iterator();
		
		while (iterator.hasNext()) {
			IntWritable intWritable = iterator.next();
			
			sum+=intWritable.get();
		}
		  
		out_value.set(sum);
		
		context.write(key, out_value);
		
		 
		
	}
}
