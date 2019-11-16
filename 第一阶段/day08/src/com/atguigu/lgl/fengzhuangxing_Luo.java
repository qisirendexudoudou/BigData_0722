package com.atguigu.lgl;

/*	面向对象特性之 ： 封装性
 	
	为什么要使用封装性？
		在创建对象以后，就可以通过对象名.属性名这种方式对属性直接进行操作。这种操作对于属性只有类型和范围的限制。
		但是在实际开发中我们会有更多的其它的限制条件。而这些限制条件又不能在属性的声明处加以限制。我们采取取如下方式
		1.使用权限修饰符对属性进行权限的限制，那么在类的外部就不能随意的再调用类中的属性
		2.提供公共的方法，在方法中可以加以限制其它的条件。然后可以通过该方法给属性赋值和获取属性的值。
		
	
	封装性的体现（狭义上）：
		1.将属性私有化。（private修饰属性）
		2.提供公共的set/get方法。（set方法用来给属性赋值，get方法用来获取属性的值）
		
	封装性的体现（广义上）：
		1.可以使用四种权限修饰符:private,缺省的，protected,public
		2.四种权限修饰符可以修饰 ：属性，方法，构造器，内部类
		3.类只能被public和缺省的修饰。*/

public class fengzhuangxing_Luo {
	public static void main(String[] args) {

		Dog dog = new Dog();
//		dog.age = 1;
		
		dog.setAge(-10);
		System.out.println(dog.getAge());
		
		dog.setAge(12);
		System.out.println(dog.getAge());
	}

}

class Dog{
	private int age;
	
	public void setAge(int a){
		if (a>0) {
			age = a; 
		} else {
			age = 1;
		}
	}
	
	public int getAge(){
		return age;
	}
}