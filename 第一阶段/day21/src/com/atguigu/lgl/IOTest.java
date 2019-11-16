package com.atguigu.lgl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.Test;

/**
 	流的分类：
 		按照操作数据单位不同分： 字节流（8bit） 字符流（16bit）
 		
 	四个抽象基类：
 		字节流：	输入流：InputStream 输出流： OutputStream
 		字符流：	输入流：Reader		   输出流: Writer
 *
 */
public class IOTest {
	
	//output
	@Test
	public void test2() throws Exception{
		FileOutputStream fos = null;
		try {
			File file = new File("Filetest\\2.txt");
			fos = new FileOutputStream(file, true);
			fos.write("ccc".getBytes());
			fos.write("ddd".getBytes());			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}		
	}
	
	
	
	
	//input
	@Test
	public void test1() throws Exception{
		FileInputStream fis=null;
		try {
			//创建File对象
			File file = new File("Filetest\\1.txt");
			//创建流的对象
			fis = new FileInputStream(file);
			//读取内容
			byte[] c = new byte[5];
			int len = 0;
			while  ((len = fis.read(c)) != -1) {
				System.out.println("length="+len);
//			System.out.println(new String(c));//会重复
				System.out.println(new String(c, 0, len));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if (fis != null) {
				try {
					//关流
					fis.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
