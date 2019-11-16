package com.atguigu.lgl;
/*
��д��������2��int�ͱ�������ֵ���ж�����֮�ͣ�������ڵ���50����ӡ��hello world!��
��д��������2��double�ͱ�������ֵ���жϵ�һ��������10.0���ҵ�2����С��20.0����ӡ����֮�͡����򣬴�ӡ�����ĳ˻���
3) �ҼҵĹ�5���ˣ�5��Ĺ��൱���������أ���ʵ������ǰ����ÿһ���൱�������10.5�֮꣬��ÿ����һ����������ꡣ
��ô5��Ĺ��൱��������������أ�Ӧ���ǣ�10.5 + 10.5 + 4 + 4 + 4 = 33�ꡣ
��дһ�����򣬻�ȡ�û�����Ĺ������䣬ͨ��������ʾ���൱����������䡣����û����븺��������ʾһ����ʾ��Ϣ��
*/

import java.util.Scanner;
public class test10
{
	public static void main(String[] args){

		//test3
		System.out.println("please input your dog's age:");
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();

		if (age >= 0 && age <= 2 ){
			double sum=age*10.5;
			System.out.println("your dog's age is people's age " + sum);
		}else if (age > 2){
			double sum=(age-2)*4+21;
			System.out.println("your dog's age is people's age " + sum);
		}else if (age < 0){
			System.out.println("please input an int number!");
		}else{
			System.out.println("please input a number!");
		}

		//test2
		/*
		double a=11.2;
		double b=40;
		if (a > 10.0 && b < 20)
		{
			double c=a+b;
			System.out.println("a=" + a);
			System.out.println("b=" + b);
			System.out.println("a+b=" + c);
		}else
		{
			double c=a*b;
			System.out.println("a=" + a);
			System.out.println("b=" + b);
			System.out.println("a+b=" + c);
		}
		*/

		//test1
		/*
		int a=10;
		int b=45;
		//int c=a+b;
		if (a+b >= 50 )
		{
			System.out.println("HelloWorld!");
		}
		*/

	}
}
