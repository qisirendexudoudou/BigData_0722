package com.atguigu.java;

/*
3��
	�����������ͼ�����㣨������boolean��


			�Զ�����������С�����ı����ʹ������ı������������ô������ı���������

					byte,short,char -> int -> long ->float -> double

					ע�⣺1.����ָ���Ǳ�����Χ
						  2.byte,short,char����֮����������Ƚ�����������int����

			ǿ������ת�����Զ���������������̡����Ѵ�������ֵ��С���������VarTest4.java


	�����������ͺ�String�������: ���VarTest5.java

*/
public class VarTest3{

	public static void main(String[] args){
	
		int a = 10;
		long b = 20L;
		long sum = a + b;
		System.out.println(sum);

		System.out.println("----------------------------");

		long num = 30L;
		float f = 12.3f;
		float num2 = f + num;
		System.out.println(num2);

		System.out.println("----------------------------");

		//byte,short,char����֮����������Ƚ�����������int����
		byte n1 = 10;
		short n2 = 20;
		int n3 = n1 + n2;
		System.out.println(n3);

		System.out.println("---------------------������Ĭ��ֵ-------------------------------");
		//java�����ͳ���Ĭ��Ϊ int ��
		long lon = 1211111111111111L;
		System.out.println("lon=" + lon);
		byte byt = 10;
		System.out.println(byt);
		//Java �ĸ����ͳ���Ĭ��Ϊdouble��
		double dou = 12.3;
		System.out.println(dou);
	}
}