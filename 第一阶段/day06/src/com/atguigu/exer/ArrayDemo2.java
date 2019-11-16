package com.atguigu.exer;

/*
 创建一个char类型的36个元素的数组，前26个元素放置'A'-'Z‘,后10个元素放置'0'-'9‘。
使用for循环访问所有元素并打印出来。

	'0' = x;
	'1' = x + 1;

 */
public class ArrayDemo2 {

	public static void main(String[] args) {
		
		//1.创建一个char类型的数组
		char[] cs = new char[36];
		
		char c = 'A';
		char c2 = '0';
		
		//2.给char数组存放数据
		for (int i = 0; i < cs.length; i++) {
			if(i < 26){
				cs[i] = c++;
			}else{
				cs[i] = c2++;
			}
		}
		
		//3.遍历数组中的元素
		for (int i = 0; i < cs.length; i++) {
			System.out.print(cs[i] + " ");
		}
	}
}
