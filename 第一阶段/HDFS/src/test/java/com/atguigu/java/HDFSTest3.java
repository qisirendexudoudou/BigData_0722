package com.atguigu.java;

import static org.junit.Assert.*;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.FsStatus;
import org.apache.hadoop.fs.Path;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HDFSTest3 {
	FileSystem fs;

	@Before
	public void init() throws Exception {
		Configuration conf = new Configuration();
		fs=FileSystem.get(conf);
	}
	
	@After
	public void close() throws Exception {
		if (fs != null) {
			fs.close();
		}
	}

	//过时的判断方法
	@Test
	public void testName() throws Exception {
		
		boolean directory = fs.isDirectory(new Path("/eclipse0"));
		
		System.out.println(directory);
		
		boolean file = fs.isFile(new Path("/黑道特种兵.txt"));
		System.out.println(file);
	}
	
	//推荐的判断方法-getfilestatus()：判断单个文件或者目录
	@Test
	public void test2() throws Exception {
		
		Path p = new Path("/黑道特种兵.txt");
		FileStatus fileStatus = fs.getFileStatus(p);
		
		boolean file = fileStatus.isDirectory();
		boolean file2 = fileStatus.isFile();
		
		System.out.println(file);
		System.out.println(file2);
		
		long len = fileStatus.getLen();
		System.out.println(len);
		
	}
	
	//\推荐的判断方法-liststatus():循环遍历目录中的文件
	@Test
	public void test3() throws Exception {
		Path p = new Path("/eclipse3");
		FileStatus[] listStatus = fs.listStatus(p);
		
		for (FileStatus fileStatus : listStatus) {
			System.out.println(fileStatus.getPath().toString() + " 是否是目录：" + fileStatus.isDirectory());
			System.out.println(fileStatus.getPath().getName() + " 是否是文件：" + fileStatus.isFile());
			
		}
	}
	
}
