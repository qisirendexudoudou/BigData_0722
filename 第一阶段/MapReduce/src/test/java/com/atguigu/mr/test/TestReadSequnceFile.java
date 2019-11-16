package com.atguigu.mr.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.SequenceFile;
import org.apache.hadoop.io.Text;
import org.junit.Test;

public class TestReadSequnceFile {

	// 读取SequenceFile
	@Test
	public void test() throws IOException {
		
		Configuration conf = new Configuration();
		
		FileSystem fs = FileSystem.get(conf);
		
		Path input=new Path("E:\\mroutput\\custom\\part-r-00000");
		
		// 提供一个SequenceFile的Reader
		SequenceFile.Reader reader=new SequenceFile.Reader(fs, input, conf);
		
		Text key=new Text();
		
		BytesWritable val=new BytesWritable();
		
		while(reader.next(key, val)) {
			
			System.out.println(key);
			System.out.println(new String(val.copyBytes()));
			System.out.println(new String(val.getBytes()));
			
			
		}
		
	}

}
