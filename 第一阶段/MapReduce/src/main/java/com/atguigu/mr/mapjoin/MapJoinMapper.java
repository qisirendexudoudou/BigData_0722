package com.atguigu.mr.mapjoin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

// 处理的是大文件的切片
public class MapJoinMapper extends Mapper<LongWritable, Text, Text, NullWritable>{

	private Map<String, String> pdInfo=new HashMap<>();
	
	private Text out_key=new Text();
			
	
	// 在Map之前，从分布式缓存中读取已经下载到本地的文件
	@Override
	protected void setup(Context context)
			throws IOException, InterruptedException {
		
		// 获取所有的缓存的文件
		URI[] cacheFiles = context.getCacheFiles();
		
		if (cacheFiles != null) {
			
			for (URI uri : cacheFiles) {
				
				BufferedReader reader = new BufferedReader(new  InputStreamReader(new FileInputStream(new File(uri)), "utf-8"));
				
				String line=null;
				
				while(StringUtils.isNotEmpty(line=reader.readLine())) {
					
					String[] words = line.split("\t");
					
					pdInfo.put(words[0], words[1]);
					
				}
				
			}
			
		}
		
		
	}
	
	
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, NullWritable>.Context context)
			throws IOException, InterruptedException {
		
		//处理来自order.txt的数据
		String[] words = value.toString().split("\t");
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(words[0]).append("\t"+pdInfo.get(words[1])).append("\t"+words[2]);
		
		out_key.set(sb.toString());
		
		context.write(out_key, NullWritable.get());
		
	
	}
}
