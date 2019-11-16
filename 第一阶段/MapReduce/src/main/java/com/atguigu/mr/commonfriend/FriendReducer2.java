package com.atguigu.mr.commonfriend;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

/*
 * 输入： (A-B,E),(A-B,C)
 *  (用户-用户，友)
 *  
 *  输出： (用户-用户，好友列表)
 */
public class FriendReducer2 extends Reducer<Text, Text, Text, Text>{
	
	private Text out_value=new Text();
	
	@Override
	protected void reduce(Text key, Iterable<Text> values, Reducer<Text, Text, Text, Text>.Context context)
			throws IOException, InterruptedException {
		
		StringBuffer sb = new StringBuffer();
		
		for (Text friend : values) {
			
			sb.append(friend+" ");
			
		}
		
		out_value.set(sb.toString());
		
		context.write(key, out_value);
		
		
	}

}
