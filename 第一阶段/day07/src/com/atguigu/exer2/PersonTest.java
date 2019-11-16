package com.atguigu.exer2;

class Person{
	/*
	 * 要求：(1)创建Person类的对象，设置该对象的name、age和sex属性，调用study方法，
	 * 输出字符串“studying”，调用showAge()方法显示age值，调用addAge()方法给对象的age属性值增加2岁。
(2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。

	 */
	
	public String name;
	public int age;
	public int sex;
	
	//给age增加2岁同时返回年纪
	public int addAge(int i){
		age += i;
		return age;
	}
	
	//需求： 调用showAge()方法显示age值
	public void showAge(){
		System.out.println(age);
	}
	
	//需求： 输出字符串“studying”
	public void study(){
		System.out.println("studying");
	}
	
}
public class PersonTest {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "小强哥";
		p.age = 38;
		p.sex = 0;
		
		p.showAge(); //显示年纪  38
		p.study();//显示学生习中
		p.addAge(2);
		p.showAge(); //40
	}

}
