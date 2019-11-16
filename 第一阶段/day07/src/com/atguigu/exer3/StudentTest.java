package com.atguigu.exer3;

/*
 * 4. 对象数组题目：
定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一：打印出3年级(state值为3）的学生信息。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息

提示：
1) 生成随机数：Math.random()，返回值类型double;  
2) 四舍五入取整：Math.round(double d)，返回值类型long。

 */
class Student{
	int number; //学号
	int state; //年纪
	int score;
}
public class StudentTest {

	public static void main(String[] args) {
		
		for (int i = 0; i < 20; i++) {
			//创建学生对象
			Student stu = new Student();
			//给属性赋值
			stu.number = i + 1;
			//赋值 1 - 6年纪（随机）
			stu.state = (int)(Math.random() * 6 + 1);
			//赋值 0 - 100分(随机)
			stu.score = (int)Math.round(Math.random() * 100);
			
			
			//输出年级等于3的同学
			if(stu.state == 3){
				System.out.println(stu.number + " " + stu.state + " " + stu.score);
			}
		}
	}
}













