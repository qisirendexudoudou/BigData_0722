package com.atguigu.java;


/*
	��������� �� +������ -������ + - * / % ǰ++ ��++  ǰ-- ��-- +�����ӷ���
*/
public class ArithmeticTest{

	public static void main(String[] args){
	
		/*
			��++ : �����㣨��ֵ��������1
			ǰ++ ��������1 �����㣨��ֵ��
			��-- : �����㣨��ֵ�� ���Լ�1
			ǰ-- �����Լ�1  �����㣨��ֵ��
		*/
		int a = 10;
		int b = 10;

		int num1 = a++;//��++ : �����㣨��ֵ��������1
		int num2 = ++b;//ǰ++ ��������1 �����㣨��ֵ��

		System.out.println("a=" + a + "  num1=" + num1);
		System.out.println("b=" + b + " num2=" + num2);

		System.out.println("-----------------------------------------------------");


		int a2 = 10;
		int b2 = 10;

		int num3 = a2--;//��-- : �����㣨��ֵ�� ���Լ�1
		int num4 = --b2;//ǰ-- �����Լ�1  �����㣨��ֵ��

		System.out.println("a2=" + a2 + "  num3=" + num3); //9 , 10
		System.out.println("b2=" + b2 + " num4=" + num4); //9 , 9
	}
}