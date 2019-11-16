package com.atguigu.java3;

import java.util.Arrays;

public class MainTest {

	/**
	 * 1.main方法是程序的入口
	 * 2.只有形参的名字可以修改
	 * 
	 * 给程序的入口传参的方式：1.通过使用eclipse传参     2.使用命令行  java 字节码文件名 数据1 数据2 ........
	 * 
	 * 注意 ：如果需要通过eclipse给程序的入口传数据，必须先运行一次。
	 */
	public static void main(String[] args) {
		System.out.println(args.length);
		System.out.println(Arrays.toString(args));
	}
}

/*
 * 只是将两个程序写在了一个源文件中，编译后会生成两个字节码文件，一个字节码文件就是一个程序。
 */
class MainTest2{
	public static void main(String[] args){
		
		System.out.println("ccccccccccccccccccccccc");
		
	}
}













