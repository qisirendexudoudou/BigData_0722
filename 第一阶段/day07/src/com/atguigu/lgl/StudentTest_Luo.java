package com.atguigu.lgl;

import java.util.Arrays;

/*
 * 4. 对象数组题目：
定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一：打印出3年级(state值为3）的学生信息。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息

int
提示：
1) 生成随机数：Math.random()，返回值类型double;  
2) 四舍五入取整：Math.round(double d)，返回值类型long。

 */

public class StudentTest_Luo {

	public static void main(String[] args) {
		
		//创建学生信息
		int[] info = new int[20];
		for (int i = 0; i < 20; i++) {
			Student2 st = new Student2();
			st.number = i+1;
			st.state = (int)(Math.random()*6+1);
			st.score = (int)(Math.round(Math.random()*100));
			info[i] = st.score;
			
			if (st.state == 3) {
				System.out.print("学号：  " + st.number + " ");
				System.out.print("班级: " + st.state + " ");
				System.out.print("分数：  " + st.score + " ");
				System.out.println();
			}
	
		}
		System.out.println();
		//遍历原始成绩
		System.out.println("原始的成绩： ");
		for (int i = 0; i < info.length; i++) {
			System.out.print(info[i] + " ");
		}
		System.out.println();
		System.out.println("------------------");
		
		//使用冒泡排序，遍历排序后的成绩
		for (int i = 0; i < info.length -1; i++) {
			for (int j = 0; j < info.length- i -1; j++) {
				if (info[j] > info[j+1]) {
					int tmp = info[j];
					info[j] = info[j+1];
					info[j+1] = tmp;
				}	
			}
		}
		
		System.out.println("排序后的成绩： ");
		for (int i = 0; i < info.length; i++) {
			System.out.print(info[i] + " ");
		}
		System.out.println();
		
		
		
		//使用arrays工具类排序后遍历成绩
		/*System.out.println("------------------");
		for (int i = 0; i < info.length; i++) {
			System.out.print(info[i] + " ");
		}
		System.out.println();*/
	}
}

class Student2{
	public int number;
	public int state;
	public int score;
	
}
