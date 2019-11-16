package com.atguigu.java3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;

/**
 * 
 	打印流 ： 
 */
public class IOTest2 {

	@Test
	public void test() throws IOException {


		FileOutputStream fos = new FileOutputStream(new File("text.txt"));
		
		// 创建打印输出流,设置为自动刷新模式(写入换行符或字节 '\n' 时都会刷新输出缓冲区)
		PrintStream ps = new PrintStream(fos, true);
		
		if (ps != null) {// 把标准输出流(控制台输出)改成文件
			System.setOut(ps); //只能修改一次
		}
		
		for (int i = 0; i <= 255; i++) { // 输出ASCII字符
			System.out.println(i); // 换行
		}

		ps.close();

	}
}
