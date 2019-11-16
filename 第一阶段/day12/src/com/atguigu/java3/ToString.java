package com.atguigu.java3;

import java.util.Date;

/*
 	toString方法：
 	
 	说明：
 		1.Object中的toString方法
 			public String toString() {
        		return getClass().getName() + "@" + Integer.toHexString(hashCode());
    		}
    	2.像String，Date等核心类库中的类都重写了toString方法，用来输出内容。
    	
    	3.往往我们调用toString方法时，是想输出该对象的内容。所以我们在自定义类中
    		会重写toString方法。如果不重写调用的是Object中的toString方法输出的是地址值。
 */
public class ToString {

	public static void main(String[] args) {
		
		Person person = new Person("cc",18);
		//com.atguigu.java3.Person@659e0bfd
		System.out.println(person.toString());
//		com.atguigu.java3.Person@659e0bfd
		System.out.println(person);//默认调用的是toString方法
		
		System.out.println("------------------------------------");
		
		String s = new String("aaa");
		System.out.println(s.toString()); //输出的是内容
		Date date = new Date();
		System.out.println(date.toString());//输出的是内容
	}
}












