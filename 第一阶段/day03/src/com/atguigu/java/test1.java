package com.atguigu.java;

		/*
			��++ : �����㣨��ֵ��������1
			ǰ++ ��������1 �����㣨��ֵ��
			��-- : �����㣨��ֵ�� ���Լ�1
			ǰ-- �����Լ�1  �����㣨��ֵ��
		*/
		
public class test1{
	public static void main(String[] args){
		System.out.println("---hou++---");
		int a = 5,b = 10;
		a++;
		System.out.println("a = " + a);//5
		int num1 = a;
		System.out.println("num1 = " + num1); //6
		
		System.out.println("---++qian---");
	
		++a;
		System.out.println("a = " + a);//6
		int num2 = a;
		System.out.println("num2 = " + num2);//6
		
		System.out.println("---hou-----");
	
		b--;
		System.out.println("b = " + b);//10
		int num3 = b;
		System.out.println("num3 = " + num3);//9
		
		System.out.println("-----qian---");
		
		--b;
		System.out.println("b = " + b);//9
		int num4 = b;
		System.out.println("num4 = " + num4);//9
		
	}
}