package com.atguigu.mr.sort;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;


/*
 *  (200,1234xxx),(200,127xxx)
 *  
 *  Top10:  ①只要20个，即便第20名出现了并列
 *  		②将20名，并列的也输出
 */
public class SortSumFlowReducer extends Reducer<LongWritable, Text, Text, LongWritable>{

	private int count=0;
	
	@Override
	protected void reduce(LongWritable key, Iterable<Text> values,
			Reducer<LongWritable, Text, Text, LongWritable>.Context context) throws IOException, InterruptedException {
		
		// ①固定Top20
		/*for (Text value : values) {
			
			if (count>=20) {
				
				return;
				
			}
			
			context.write(value, key);
			
			count++;
			
		}*/
		
		// ②将20名，并列的也输出
		if (count<20) {
			
			for (Text value : values) {
				
				context.write(value, key);
				
				count++;
				
			}
			
		}
		
	}
	
}
