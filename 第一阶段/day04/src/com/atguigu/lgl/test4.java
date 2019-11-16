package com.atguigu.lgl;

import java.util.Scanner;
public class test4
{
	public static void main(String[] args){
	
		//tets4
		//System.out.println("please input i's number:");
		//Scanner s = new Scanner(System.in);
		//int number = s.nextInt();

		System.out.println("-------------------�˷��ھ�-------------------");

		for (int i=1;i<10;i++ )
		{
			for (int j=1;j<=i;j++ )
			{
				int sum=i*j;
				System.out.print(j+ "x" + i + " = " + sum + " ");
			}
			System.out.print("\n");
		}
	}
}

