package com.atguigu.exer;

import java.util.Scanner;

/*
 	输入五名同学成绩，求出总成绩和平均成绩

 */
public class ScoreTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//创建一个数组用来存放学生的成绩
		int[] scores = new int[5];
		//读取学生成绩
		for (int i = 0; i < scores.length; i++) {
			System.out.println("请输入学生的成绩");
			int score = sc.nextInt();
			//将学生的成绩存放到数组中
			scores[i] = score;
		}
		
		int sum = 0;//存学生的总成绩
		//学生总成绩和平均成绩
		for (int i = 0; i < scores.length; i++) {
			//获取数组中的数据
			int score = scores[i];
			sum += score;
		}
		
		System.out.println("学生的总成绩：" + sum + "平均成绩是:" + sum / scores.length);
	}
}
