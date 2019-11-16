package com.atguigu.lgl;
/*
 * 要求：(1)创建Person类的对象，设置该对象的name、age和sex属性，
 * 调用study方法，输出字符串“studying”，
 * 调用showAge()方法显示age值，
 * 调用addAge()方法给对象的age属性值增加2岁。
(2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。

 */
public class PersonTest_Luo {
	public static void main(String[] args) {
		Person5 p1 = new Person5();
		p1.age = 18;
		
		p1.study();
		p1.showAge();
		p1.addAge(8);
		p1.showAge();
	}

}

class Person5{
	String name;
	int age;
	int sex;
	
	public void study(){
		System.out.println("studying...");
	}
	
	public void showAge(){
		System.out.println("age = " + age);
	}
	
	public int addAge(int i){
		age += i;
		return age;
	}
}