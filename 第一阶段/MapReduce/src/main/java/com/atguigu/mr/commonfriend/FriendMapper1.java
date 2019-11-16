package com.atguigu.mr.commonfriend;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

// 输入：(A---B,C,D,F,E,O)
// 输出： (B,A)
public class FriendMapper1 extends Mapper<Text, Text, Text, Text>{
	
	private Text out_key=new Text();
	
	@Override
	protected void map(Text key, Text value, Mapper<Text, Text, Text, Text>.Context context)
			throws IOException, InterruptedException {
		
		String[] words = value.toString().split(",");
		
		for (String friend : words) {
			
			out_key.set(friend);
			
			context.write(out_key, key);
			
		}
		
	}

}
