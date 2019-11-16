package com.atguigu.java2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

/*
 * 理解
 */
public class ClassLoaderTest {
	
	
	/*
	 * 读取配置文件
	 */
	@Test
	public void test2() throws Exception{
		
		Properties pt = new Properties();
		
		/*
		FileInputStream fis = new FileInputStream("src/user.properties");
		*/
		
		//通过类加载器获取流默认路径是bin目录下
		InputStream is = this.getClass().getClassLoader()
						.getResourceAsStream("user.properties");
		
		pt.load(is);
		
		
		String name = pt.getProperty("username");
		System.out.println(name);
		is.close();
	}

	@Test
	public void test() throws Exception{
		//1.获取一个系统类加载器
		ClassLoader classloader = ClassLoader.getSystemClassLoader();
		System.out.println(classloader);
		
		
		//2.获取系统类加载器的父类加载器，即扩展类加载器
		classloader = classloader.getParent();
		System.out.println(classloader);
		
		
		//3.获取扩展类加载器的父类加载器，即引导类加载器
		classloader = classloader.getParent();
		System.out.println(classloader);
		
		
		//4.测试当前类由哪个类加载器进行加载
		classloader = Class.forName("java.lang.String").getClassLoader();
		System.out.println(classloader);

	}
}
