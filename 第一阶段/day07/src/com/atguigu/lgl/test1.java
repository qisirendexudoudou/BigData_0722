package com.atguigu.lgl;

/*
 Student类
属性：
name:String
age:int
major:String
interests:String
方法：say()
返回学生的个人信息

Teacher类
属性：
name:String
age:int
teachAge:int
course:String
方法：say()
输出教师的个人信息

 */



public class test1 {

	public static void main(String[] args) {
		
		Student t1 = new Student();
		Teacher t2 = new Teacher();
	
		t1.say("小罗",22,"english","play basketball");
		System.out.println();
		t2.say("小许",26,4,"eat");		
		
	}
}

class Student{
	String name;
	int age;
	String major;
	String intersts;
	
	public void say(String name,int age,String major,String intersts){
		System.out.println("学生姓名 = " + name);
		System.out.println("年龄  = " + age);
		System.out.println("主修  = " + major);
		System.out.println("兴趣爱好 = " + intersts);
	}	
}

class Teacher{
	String name;
	int age;
	int teachAge;
	String course;
	
	public void say(String name,int age,int teachAge,String course){
		System.out.println("教师姓名 = " + name);
		System.out.println("年龄  = " + age);
		System.out.println("教龄  = " + teachAge);
		System.out.println("说明 = " + course);
	}	
}
