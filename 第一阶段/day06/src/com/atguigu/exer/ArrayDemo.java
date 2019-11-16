package com.atguigu.exer;

/*
 创建一个char类型的26个元素的数组，分别 放置'A'-'Z‘。
使用for循环访问所有元素并打印出来。
提示：char类型数据运算 'A'+1 -> 'B'，'0'+1 -> ‘1‘

		'A' -> 65
		'B' -> 66
		'C' -> 67

 */
public class ArrayDemo {

	public static void main(String[] args) {
		
		//创建一个char类型的数组
		char[] c = new char[26];
		
		char ch = 'A';
		
		//给数组中存放数据
		for (int i = 0; i < c.length; i++) {
			c[i] = ch++;
			/*
			c[i] = ch;
			ch += 1;
			*/
		}
		
		//遍历数组中的内容
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		
	}
}
