package com.atguigu.lgl;

//��д�����ɼ����������������ֱ�������num1��num2��num3�������ǽ�������(ʹ�� if-else if-else),���Ҵ�С���������

import java.util.Scanner;
public class test9
{
	public static void main(String[] agrs){
		System.out.println("please input 1st num1:");
		Scanner s = new Scanner(System.in);
		int  num1 = s.nextInt();
		
		System.out.println("please input 2sc num2:");
		Scanner m = new Scanner(System.in);
		int  num2 = m.nextInt();

		System.out.println("please input  3th num3:");
		Scanner n = new Scanner(System.in);
		int  num3 = n.nextInt();
		int min,mid,max;

		if (num1 == num2 && num2 == num3 )
		{
			System.out.println(num3 + "=" + num2 + "=" + num1);
		}

		if (num1 < num2)
		{
			if ( num2 < num3 )
			{
				System.out.println(num1 + "<" + num2 + "<" + num3);
			}else
			{
				if(num3>num1){
				System.out.println(num1 + "<" + num3 + "<" + num2);

				}else{

				System.out.println(num3 + "<" + num1 + "<" + num2);
				}
			}
		}else if (num2  < num1)
		{
			if (num1 < num3 )
			{
				System.out.println(num2 + "<" + num1 + "<" + num3);
			}else 
			{
				if(num2>num3){
				System.out.println(num3 + "<" + num2 + "<" + num1);
				}else{
					System.out.println(num2 + "<" + num3 + "<" + num1);
				}
			}
		}
	}
}