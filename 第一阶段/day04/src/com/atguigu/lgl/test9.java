package com.atguigu.lgl;

import java.util.Scanner;
public class test9
{
	public static void main(String[] args){
	
		//tets4
		Scanner s = new Scanner(System.in);
		System.out.println("please input year:");	
		int year = s.nextInt();
		System.out.println("please input month:");	
		int month = s.nextInt();
		System.out.println("please input day:");
		int day = s.nextInt();

		int sum = 0;
		switch ( month )
		{

		case 4:
			sum += 31;
		case 3:
			if ((year % 4 == 0 && year %100 != 0) || (year % 400 == 0 ))
			{
				sum += 29;
			}else
				sum += 28;
		case 2:
			sum += 31;
		case 1:
			sum += day;
		}
			System.out.println("this is "+ year + "'s " + sum + "th day!");
	}
}