package com.atguigu.lgl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

/**
1.请从键盘随机输入10个整数保存到List中，并按倒序、从大到小的顺序显示出来

2.请把学生名与考试分数录入到集合中，并按分数显示前三名成绩学员的名字。
 */
public class test1 {

	
	@Test
	public void test2(){
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("xiaoxu", 89));
		list.add(new Student("haha", 30));
		list.add(new Student("xixi", 59));
		list.add(new Student("hehe", 78));
		list.add(new Student("enen", 100));
		list.add(new Student("haode", 34));
		list.add(new Student("hello", 82));
		
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student stu1, Student stu2) {
				return stu1.score - stu2.score;
			}
		});
		Collections.reverse(list);
		System.out.println(list.get(0).name);
		System.out.println(list.get(1).name);
		System.out.println(list.get(2).name);
	}
	

	
	@Test
	public void test1(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("请输入10个数字：");
		for (int i = 0; i < 10; i++) {
			list.add(s.nextInt());
		}

		Collections.sort(list);
		Collections.reverse(list);
		System.out.println("从大到小的排序为：");
		System.out.println(list);
	}
}


class Student{
	String name;
	int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}



	@Override
	public String toString() {
		return "[" + name + " " + score + "]";
//		return name;
	}
	
	
}