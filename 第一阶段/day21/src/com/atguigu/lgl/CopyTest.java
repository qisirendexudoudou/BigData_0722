package com.atguigu.lgl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.Test;

// 实现复制的功能（一边读一边写）
public class CopyTest {
	
	@Test
	public void test1() throws Exception{
//		copy("G:\\eclipse-workspace\\day21\\Filetest\\1.txt", "G:\\eclipse-workspace\\day21\\Filetest\\3.txt");
		copy("333.txt", "0503.txt");
	}

	
	public void copy(String src,String desc){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			//1.创建file对象
			File descfile = new File(desc);//写入的文件
			File srcfile = new File(src);//读取的文件
			//2.创建流的对象
			fis = new FileInputStream(srcfile);//输入流
			fos = new FileOutputStream(descfile);//输出流
			//3.复制（一边读一边写）
			byte[] b = new byte[1024];//创建byte数组
			int len = 0; //定义截取字符长度 
			while ((len = fis.read(b)) != -1) {
				fos.write(b, 0, len); //写入到新文件中
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			
			try {
				//4.关流
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			try {
				if (fos != null) {
					fos.close();	
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
