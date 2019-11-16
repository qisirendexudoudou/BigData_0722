package com.atguigu.lgl;

/* 1.创建程序,在其中定义两个类：Person和PersonTest类。定义如下：
用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
在PersonTest类中实例化Person类的对象b，调用setAge()和getAge()方法，
--------------体会Java的封装性。

*/
public class PersonTest_Luo {
	public static void main(String[] args) {
		Person person = new Person();
		person.setAge(10);
		System.out.println(person.getAge());
		System.out.println("-----falsedata------");
		
		person.setAge(-12);
		System.out.println(person.getAge());
	}
}

class Person{
	private int age;
	
	public void setAge(int a){
		if (a >= 0 && a<= 130) {
			age = a;
		} else {
			age = 1;
		}
	}
	
	public int getAge(){
		return age;
	}
}
