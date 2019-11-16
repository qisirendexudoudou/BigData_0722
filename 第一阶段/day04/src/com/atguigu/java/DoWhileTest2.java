package com.atguigu.java;



/*

	while��do-while������

	do-while����ִ��һ��ѭ���塣
	while�п���һ��ѭ����Ҳ��ִ�С�

*/
public class DoWhileTest2{

	public static void main(String[] args){
	
		boolean boo = false;
		
		while(boo){
			System.out.println("while test");
		}

		do{
			System.out.println("do while test");
		}while(boo);
	}
}