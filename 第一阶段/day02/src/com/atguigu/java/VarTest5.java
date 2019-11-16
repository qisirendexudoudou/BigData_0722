package com.atguigu.java;


/*
3��

	������������(8��)��String�������: ���VarTest5.java

	˵����
		1.�ַ����ͻ�����������ֻ�����������㣨+��
		2.�ַ����ͻ���������������������Ϊ�ַ���
*/
public class VarTest5{

	public static void main(String[] args){
	
		//�ַ����������͸�ֵ
		String s = "hello";
		//�������ַ�ʽ����������ʱ����˵��
		String s2 = new String("java");

		System.out.println(s);
		System.out.println(s2);

		System.out.println("-----------------------------------------------");

		int a = 10;
		String s3 = s + a;
		boolean boo = true;
		String s4 = s + boo;
		char c = 'A';
		String s5 = s + c;
		System.out.println(s5);

		System.out.println("-----------------------------------------------");

		System.out.println(s + c);
		System.out.println("hello" + 'A');

		System.out.println("------------------��ϰ��-----------------------------");

		int number = c + 1;//66
		System.out.println(number);

		char c2 = 'A';
		String str = "hello";
		int num = 100;
		System.out.println(c2 + str + num); //Ahello100
		System.out.println(c2 + (str + num)); //Ahello100
		System.out.println(c2 + num + str); //165hello
		System.out.println(str + num + c2); //hello100A
	}
}