package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/**
 * 实现复制的功能（一边读一边写）
 * 
 * @author Administrator
 *
 */
public class IOTest2 {

	@Test
	public void test() throws Exception {
		long start = System.currentTimeMillis();
		copy("555.txt", "333.txt");
		long end = System.currentTimeMillis();
		System.out.println("time=" + (end - start));
	}

	@SuppressWarnings("resource")
	public void copy(String desc, String src) throws Exception {
		// 1.创建File对象
		File descFile = new File(desc);// 写
		File srcFile = new File(src);// 读

		// 2.创建流的对象
		// 创建输入流
		FileInputStream fis = new FileInputStream(srcFile);
		// 创建输出流
		FileOutputStream fos = new FileOutputStream(descFile);

		// 3.一边读一边写
		byte[] b = new byte[8192];
		int len = 0;
		while ((len = fis.read(b)) != -1) {
			// 写内容
			fos.write(b, 0, len);
		}

		// 4.关流
		fos.close();
		fis.close();
	}

	@SuppressWarnings("resource")
	public void copy2(String desc, String src) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			// 1.创建File对象
			File descFile = new File(desc);// 写
			File srcFile = new File(src);// 读

			// 2.创建流的对象
			// 创建输入流
			fis = new FileInputStream(srcFile);
			// 创建输出流
			fos = new FileOutputStream(descFile);

			// 3.一边读一边写
			byte[] b = new byte[512];
			int len = 0;
			while ((len = fis.read(b)) != -1) {
				// 写内容
				fos.write(b, 0, len);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			// 4.关流
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
