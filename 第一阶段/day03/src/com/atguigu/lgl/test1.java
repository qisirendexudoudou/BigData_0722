package com.atguigu.lgl;
/*
			��++ : �����㣨��ֵ��������1
			ǰ++ ��������1 �����㣨��ֵ��
			��-- : �����㣨��ֵ�� ���Լ�1
			ǰ-- �����Լ�1  �����㣨��ֵ��
		*/
		
public class test1{
	public static void main(String[] args){
		System.out.println("---hou++---");
		int a = 5;
		int num1 = a++;
		System.out.println("num1 = " + num1); //5
		System.out.println("a = " + a);//6

		System.out.println("---++qian---");
		int num2 = ++a;
		System.out.println("num2 = " + num2);//7
		System.out.println("a = " + a);//7
		System.out.println("---hou-----");
	
		int b = 10;
		int num3 = b--;
		System.out.println("num3 = " + num3);//10
		System.out.println("b = " + b);//9
		
		System.out.println("-----qian---");
		
		int num4 = --b;
		System.out.println("num4 = " + num4);//8
		System.out.println("b = " + b);//8
		
		
	}
}