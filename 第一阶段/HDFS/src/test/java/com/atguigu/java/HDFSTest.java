package com.atguigu.java;

import static org.junit.Assert.*;

import java.net.URI;

import org.apache.commons.net.ftp.Configurable;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Test;

import com.google.common.io.Files;



public class HDFSTest {
	
	@Test
	public void test1() throws Exception {
		
		//创建全局的配置对象
		Configuration conf=new Configuration();
		
		//创建客户端对象(默认是本地文件系统)
//		FileSystem fs =FileSystem.get(conf);
		
		//创建分布式客户端对象--三个参数 uri、conf、username
		FileSystem fs =FileSystem.get(new URI("hdfs://10.211.55.100:9000"), conf, "hadoop");
//		FileSystem fs =FileSystem.get(new URI("hdfs://hadoop:9000"), conf);
		
		System.out.println(fs.getClass().getName());
		
		//使用
		fs.mkdirs(new Path("/eclipse2"));
		
		//关闭客户端对象
		fs.close();
		
	}
	
		//set设置配置属性
		@Test
		public void test2() throws Exception {
			
			Configuration conf = new Configuration();
			
			conf.set("fs.defaultFS", "hdfs://10.211.55.100:9000");
			
			FileSystem fs = FileSystem.get(conf);
			
			System.out.println(fs.getClass().getName());
			
			
			fs.mkdirs(new Path("/eclipse1"));
			
			fs.close();
	
		}

		
		//读取配置文件
		//--将core-site.xml放置到项目中
		@Test
		public void test3() throws Exception {
			Configuration conf = new Configuration();
			FileSystem fs = FileSystem.get(conf);
			fs.mkdirs(new Path("/eclipse3"));
			fs.close();
			
		}
}
