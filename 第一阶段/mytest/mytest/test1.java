package mytest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class test1{
	@Test
	public void test2() throws Exception{
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


