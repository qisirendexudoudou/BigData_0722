package com.atguigu.java3;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class FileAPI {
	
	/**
	 * public boolean renameTo(File dest):把文件重命名为指定的文件路径
	 */
	@Test
	public void test6(){
		
		File f = new File("abc.txt");
		//功能一 ：改名
//		boolean renameTo = f.renameTo(new File("abc.txt"));
//		System.out.println(renameTo);
		
		//功能二 ：移动文件
		boolean renameTo = f.renameTo(new File("D:\\io\\abc.txt"));
		System.out.println(renameTo);
	}
	
	/**
	 * 可以看一下
	 * public boolean createNewFile() ：创建文件。若文件存在，则不创建，返回false
public boolean mkdir() ：创建文件目录。如果此文件目录存在，就不创建了。如果此文件目录的上层目录不存在，也不创建。
public boolean mkdirs() ：创建文件目录。如果上层文件目录不存在，一并创建
	 * @throws IOException 

	 */
	@Test
	public void test5() throws IOException{
		
		File f = new File("D:\\io\\io\\abc.txt");
		if(f.exists()){//文件存在
			f.delete();//删除文件
		}else{//文件不存在
			//注意：如果父目录不存在则创建失败
			boolean createNewFile = f.createNewFile();
			System.out.println(createNewFile);
		}
		
		System.out.println("-----------------------");
		/*
		File file = new File("D:\\io\\io\\abc");
		//mkdir() :如果父目录不存在则创建失败
		//mkdirs() :如果父目录存在则把父目录一并创建
		boolean mkdir = file.mkdirs();
		System.out.println(mkdir);
		*/
	}
	
	/**
	 *  public boolean isDirectory()：判断是否是文件目录
		public boolean isFile() ：判断是否是文件
		public boolean exists() ：判断是否存在
		public boolean canRead() ：判断是否可读
		public boolean canWrite() ：判断是否可写
		public boolean isHidden() ：判断是否隐藏

	 */
	@Test
	public void test4(){
		File file = new File("D:\\io");
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.exists());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.isHidden());
		
		System.out.println("-----------------------------------");
		File file2 = new File("123.txt");
		System.out.println(file2.isDirectory());
		System.out.println(file2.isFile());
		System.out.println(file2.exists());
		System.out.println(file2.canRead());
		System.out.println(file2.canWrite());
		System.out.println(file2.isHidden());
		
		System.out.println("-----------------------------------");
		File file3 = new File("abc.txt");
		System.out.println(file3.isDirectory());
		System.out.println(file3.isFile());
		System.out.println(file3.exists());
		System.out.println(file3.canRead());
		System.out.println(file3.canWrite());
		System.out.println(file3.isHidden());
	}
	
	/**
	 * public String[] list() ：获取指定目录下的所有文件或者文件目录的名称数组
		public File[] listFiles() ：获取指定目录下的所有文件或者文件目录的File数组 
	 */
	@Test
	public void test3(){
		File file = new File("D:\\io");
		
		//用来获取该目录下所有目录和文件的名字
		String[] list = file.list();
		for (String name : list) {
			System.out.println(name);
		}
		
		//用来获取该目录下所有目录和文件的对象
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			System.out.println(file2);
		}
	}
	
	/**
	 * 	public long length() ：获取文件长度（即：字节数）。不能获取目录的长度。
		public long lastModified() ：获取最后一次的修改时间，毫秒值
		
	 */
	@Test
	public void test2(){
		File f = new File("D:\\io\\1.txt");
		System.out.println(f.length());
		System.out.println(f.lastModified());
	}

	/**
	 *  可以看一下
	 *  public String getAbsolutePath()：获取绝对路径
		public File getAbsoluteFile()：获取绝对路径表示的文件
		public String getPath() ：获取路径
		public String getName() ：获取名称
		public String getParent()：获取上层文件目录路径。若无，返回null
		
		
		

	 */
	@Test
	public void test(){
		
		File f = new File("123.txt");
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getPath());
		System.out.println(f.getName());
		System.out.println(f.getParent());
	
		System.out.println("------------------------------------");
		
		File f2 = new File("D:\\io\\1.txt");
		System.out.println(f2.getAbsolutePath());
		System.out.println(f2.getAbsoluteFile());
		System.out.println(f2.getPath());
		System.out.println(f2.getName());
		System.out.println(f2.getParent());
	}
}











