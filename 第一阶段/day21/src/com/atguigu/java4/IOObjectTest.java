package com.atguigu.java4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**

	对象流 ：
	
	序列化：用ObjectOutputStream类保存基本类型数据或对象的机制
	反序列化：用ObjectInputStream类读取基本类型数据或对象的机制

 */
public class IOObjectTest {

	/**
	 * 反序列化
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception{
		//创建流的对象
		FileInputStream fis = new FileInputStream("aaa.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//读取内容
		Person p = (Person) ois.readObject();
		System.out.println(p.toString());
		//关流
		ois.close();
		fis.close();
		
	}
	
	
	/**
	 * 序列化
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception{
		//创建流的对象
		FileOutputStream fos = new FileOutputStream("aaa.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//写数据
		oos.writeObject(new Person("ccc", 10,new Address(10, "宝安大道", "中国")));
		
		//关流
		oos.close();
		fos.close();
	}
}
