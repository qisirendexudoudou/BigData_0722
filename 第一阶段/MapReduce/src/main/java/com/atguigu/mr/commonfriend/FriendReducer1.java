package com.atguigu.mr.commonfriend;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

/*
 * 输入： (E,A),(E,B),(E,G),(E,L)
 *  (友，用户)
 *  
 *  输出： (友，用户列表)
 */
public class FriendReducer1 extends Reducer<Text, Text, Text, Text>{
	
	private Text out_value=new Text();
	
	@Override
	protected void reduce(Text key, Iterable<Text> values, Reducer<Text, Text, Text, Text>.Context context)
			throws IOException, InterruptedException {
		
		StringBuffer sb = new StringBuffer();
		
		for (Text user : values) {
			
			sb.append(user+"-");
			
		}
		
		out_value.set(sb.toString());
		
		context.write(key, out_value);
		
		
	}

}
