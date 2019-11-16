package com.atguigu.mr.CombineTextinputformat;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;


public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable>{
	
	private IntWritable out_value=new IntWritable();
	
	
	@Override
	protected void reduce(Text key, Iterable<IntWritable> values,
			Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
		
		int sum=0;
		// 增强for循环循环遍历迭代器中的数据
		/*for (IntWritable intWritable : values) {
			
		}*/
		Iterator<IntWritable> iterator = values.iterator();
		
		while(iterator.hasNext()) {
			
			IntWritable intWritable = iterator.next();
			
			sum+=intWritable.get();
			
			
		}
		
		out_value.set(sum);
		
		//输出最终结果
		context.write(key, out_value);
		
		
	}
	

}
