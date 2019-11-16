package com.atguigu.java;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Date;

import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.BlockLocation;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.FsStatus;
import org.apache.hadoop.fs.LocatedFileStatus;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.RemoteIterator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HDFSTest5
{
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

	
	@Test
	public void test1() throws Exception {
		Path src = new Path("file:///G:\\Game\\黑道特种兵.txt");
		Path dest = new Path("/黑道特种兵前1M.txt");
		
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", "file:///");
		
		FileSystem localfs = FileSystem.get(conf);
		FSDataInputStream is = localfs.open(src);
		FSDataOutputStream os = fs.create(dest);
		
		try {
			byte[] buffer=new byte[1024];
			for (int i = 0; i < 1024; i++) {
				is.read(buffer);
				os.write(buffer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			IOUtils.closeStream(is);
			IOUtils.closeStream(os);
			localfs.close();
		}
		
		
		
		
		
		
		
		
	}
	
}
