package com.atguigu.java;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class HDFSTest2 {
	
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
	
	//增--create
	@Test
	public void addfile() throws Exception {
		fs.create(new Path("/2.txt"));
	}
	
	//删--delete
	@Test
	public void deletefile() throws Exception {
		fs.delete(new Path("/黑道特种兵.txt"));
//		fs.delete(new Path("/2.txt"), recursive)
	}
	
	//改--rename
	@Test
	public void updatefile() throws Exception {
		fs.rename(new Path("/eclipse"), new Path("/eclipse0"));
	}
	
	//上传--copyFromLocalFile
	@Test
	public void loadfile() throws Exception {
		fs.copyFromLocalFile(new Path("G:\\Game\\1.txt"), new Path("/eclipse3"));
	}
	
	//下载--copyToLocalFile
	@Test
	public void dumpfile() throws Exception {
		fs.copyToLocalFile(new Path("/黑道特种兵.txt"), new Path("G:\\黑道特种兵.txt"));
	}

}
