package com.atguigu.mr.index;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

/*
 * 输入：(atguigu-b.txt\t2)
 */
public class IndexReducer2 extends Reducer<Text, Text, Text, Text>{

	private Text out_value=new Text();
	
	@Override
	protected void reduce(Text key, Iterable<Text> values,
			Context context) throws IOException, InterruptedException {
		
		StringBuffer sb = new StringBuffer();
		
		for (Text text : values) {
			
			sb.append(text+"   ");
		}
		
		out_value.set(sb.toString());
		
		context.write(key, out_value);
		
		
	}
}
