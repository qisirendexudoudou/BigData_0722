package com.atguigu.exer3;

/*
 * 1.创建程序,在其中定义两个类：Person和PersonTest类。定义如下：
用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
在PersonTest类中实例化Person类的对象b，调用setAge()和getAge()方法，体会Java的封装性。

 */
class Person{
	private int age;
	
	/**
	 * 给属性赋值
	 */
	public void setAge(int a){
		//加限制条件
		if(a >= 0 && a <= 130){
			age = a;
		}else{
			//如果不在合理范围之内给一个默认值
			age = 10;
		}
	}
	
	/**
	 * 获取属性值
	 */
	public int getAge(){
		return age;
	}
}
public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(90);
		System.out.println(p.getAge());
	}
}
