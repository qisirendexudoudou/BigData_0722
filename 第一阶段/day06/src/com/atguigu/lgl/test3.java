package com.atguigu.lgl;

/*
 * 练习一
输入五名同学成绩，求出总成绩和平均成绩
 */

import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {
		
		double sum = 0.00;
		System.out.println("请输入5名同学的成绩：");
		double[] sorce = new double[5];
		Scanner s = new Scanner(System.in);
		
		for (int i=0;i<sorce.length;i++){	
			sorce[i] = s.nextDouble();
			sum += sorce[i];
		}
		System.out.println("总成绩： " + sum);
		System.out.println("平均成绩 ： " + (sum/(sorce.length)));
	}
}
