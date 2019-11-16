package com.atguigu.mr.commonfriend;

import java.io.IOException;
import java.util.Arrays;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

// 输入：(E\tA-B-G-L-H)
//     （友，用户列表）
// 输出： (A-B,E)
public class FriendMapper2 extends Mapper<Text, Text, Text, Text>{
	
	private Text out_key=new Text();
	
	@Override
	protected void map(Text key, Text value, Mapper<Text, Text, Text, Text>.Context context)
			throws IOException, InterruptedException {
		
		String[] users = value.toString().split("-");
		
		// 保证users中所有的user，按照顺序排列
		Arrays.sort(users);
		
		// 两两拼接输出
		for (int i = 0; i < users.length-1; i++) {
			
			for (int j = i+1; j < users.length; j++) {
				
				out_key.set(users[i]+"-"+users[j]);
				
				context.write(out_key, key);
				
				
			}
			
		}
		
		
	}

}
