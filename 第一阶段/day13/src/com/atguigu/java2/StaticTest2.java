package com.atguigu.java2;

/*
 	注意 ： 一个属性能不能设置成类变量，就看该属性是对象独有的还是共同拥有的。
 */
public class StaticTest2 {

	public static void main(String[] args) {
		
		new Student();
		new Student();
		new Student();
		new Student();
		System.out.println(Student.count);
		
		System.out.println("--------------------------------------");

		Dog dog = new Dog(2, "哈士奇");
		Dog dog2 = new Dog(3, "二哈");
		Dog dog3 = new Dog(2, "三哈");
		Dog dog4 = new Dog(3, "大傻");
		
		dog.info();
		dog2.info();
		dog3.info();
		dog4.info();
	}
}

//需求：给Dog对象中的id自动赋值（实现自增的效果）
class Dog{
	//因为每只狗都有独自的id所以不能设置成static
	int id;
	int age;
	String name;
	
	static int count = 0;
	
	public Dog(int age,String name){
		id = ++count;
		this.age = age;
		this.name = name;
	}
	
	public void info(){
		System.out.println(id + " " + age + " " + name);
	}
	
}

//需求 ： 统计当前类创建的对象的个数
class Student{
	
	static int count;
	
	//创建对象必调构造器
	public Student(){
		++count;
	}
}
