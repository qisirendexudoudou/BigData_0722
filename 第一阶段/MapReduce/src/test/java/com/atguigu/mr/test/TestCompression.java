package com.atguigu.mr.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.compress.CompressionCodec;
import org.apache.hadoop.io.compress.CompressionCodecFactory;
import org.apache.hadoop.io.compress.CompressionInputStream;
import org.apache.hadoop.io.compress.CompressionOutputStream;
import org.apache.hadoop.io.compress.GzipCodec;
import org.apache.hadoop.util.ReflectionUtils;
import org.junit.Test;

/*
 * 1. CompressionCodec代表压缩格式编解码器类
 * 
 * 		压缩：   正常文件 -----> 压缩文件
 * 				创建输入流，读取文件，使用一个可以压缩的输出流，将文件的内容使用压缩输出流写出，就是一个压缩文件！
 * 
 * 		解压缩：  压缩文件------> 正常文件
 * 				使用指定压缩格式的输入流读取压缩文件，使用正常的输出流，写出正常文件
 */
public class TestCompression {
	
	@Test
	public void testCompression() throws Exception {
		
		Path source=new Path("e:/悲惨世界(英文版).txt");
		
		
		
		// ①指定当前要使用哪种压缩格式
		String codecClassName="org.apache.hadoop.io.compress.GzipCodec";
		
		Class<?> codecClass = Class.forName(codecClassName);
		
		Configuration conf = new Configuration();
		
		FileSystem fs=FileSystem.get(conf);
		
		
		GzipCodec codec = new GzipCodec();
		
		codec.setConf(conf);
		
		// ②根据压缩格式获取其CompressionCodec对象
		//CompressionCodec codec= (CompressionCodec) ReflectionUtils.newInstance(codecClass, conf);
		
		Path dest=new Path("e:/悲惨世界(英文版)"+codec.getDefaultExtension());
		// ③从CompressionCodec中获取可以压缩的输入和输出流
		
		FSDataOutputStream os = fs.create(dest, true);
		
		CompressionOutputStream compressionOutputStream = codec.createOutputStream(os);
		
		FSDataInputStream is = fs.open(source);
		
		// ④流的拷贝
		IOUtils.copyBytes(is, compressionOutputStream, conf, true);
		
		
	}
	
	@Test
	public void testDecompression() throws IOException{
		
		Path source=new Path("e:/悲惨世界(英文版).gz");
		Path dest=new Path("e:/悲惨世界(英文版).txt");
		
		Configuration conf = new Configuration();
		
		FileSystem fs=FileSystem.get(conf);
		
		FSDataInputStream is = fs.open(source);
		FSDataOutputStream os = fs.create(dest, true);
		
		// ①指定当前要使用哪种压缩格式
		// 根据文件名后缀获取压缩格式编解码器
		CompressionCodec codec =
			      new CompressionCodecFactory(conf).getCodec(source);
		
		CompressionInputStream compressionInputStream = codec.createInputStream(is);
		
		IOUtils.copyBytes(compressionInputStream, os, conf, true);
		
	}

}
