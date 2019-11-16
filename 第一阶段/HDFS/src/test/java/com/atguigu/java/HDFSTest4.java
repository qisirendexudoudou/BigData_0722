package com.atguigu.java;

import static org.junit.Assert.*;

import java.util.Date;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.BlockLocation;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.FsStatus;
import org.apache.hadoop.fs.LocatedFileStatus;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.RemoteIterator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HDFSTest4 {
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

	
	//推荐的判断方法-liststatus():循环遍历目录中的文件属性
	@Test
	public void test() throws Exception {
		Path p = new Path("/eclipse3");
		FileStatus[] listStatus = fs.listStatus(p);
		
		for (FileStatus fileStatus : listStatus) {
			System.out.println("------"+fileStatus.getPath().getName()+"-------");
			
			System.out.println("permission：" + fileStatus.getPermission());
			System.out.println("owner: " + fileStatus.getOwner());
			System.out.println("gropu：" + fileStatus.getGroup() );
			System.out.println("size: " + fileStatus.getLen()/1024/1024+"M");
			long time = fileStatus.getModificationTime();
			Date date = new Date(time);
			System.out.println("Last Modified: "+ date);
			System.out.println("replication: " + fileStatus.getReplication());
			System.out.println("blocksize: " + fileStatus.getBlockSize()/1024/1024+"M");
			
		}
	}
	
	//推荐的判断方法-
	@Test
	public void test2() throws Exception {
		Path p = new Path("/eclipse3");
		RemoteIterator<LocatedFileStatus> listStatus = fs.listLocatedStatus(p);
		
		while (listStatus.hasNext()) {
			LocatedFileStatus fileStatus = listStatus.next();

			System.out.println("------"+fileStatus.getPath().getName()+"-------");
			
			System.out.println("permission：" + fileStatus.getPermission());
			System.out.println("owner: " + fileStatus.getOwner());
			System.out.println("gropu：" + fileStatus.getGroup() );
			System.out.println("size: " + fileStatus.getLen()/1024/1024+"M");
			long time = fileStatus.getModificationTime();
			Date date = new Date(time);
			System.out.println("Last Modified: "+ date);
			System.out.println("replication: " + fileStatus.getReplication());
			System.out.println("blocksize: " + fileStatus.getBlockSize()/1024/1024+"M");
			
			BlockLocation[] blockLocations = fileStatus.getBlockLocations();
			for (BlockLocation blockLocation : blockLocations) {
				System.out.println(blockLocation);
			}
		}
		
		
		
	}
	
}
