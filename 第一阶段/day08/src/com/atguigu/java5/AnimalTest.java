package com.atguigu.java5;


/*
 	面向对象特性之 ： 封装性
 	
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
 		3.类只能被public和缺省的修饰。
 	
 */

/**
 * 兄弟注意狗的腿只有4条，年纪不能小于0
 * @author Administrator
 *
 */
class Dog{
	
	String name;
	private int legs;
	private int age;
	
	//通过调用方法给属性赋值
	public void setAge(int a){
		if(a < 0){
			//1.抛异常  2.提示  3.赋值默认值
			System.out.println("哥们你瞎啊，是不是从火星上来的");
			age = 2;
		}else{
			age = a;
		}
	}
	//通过调用方法获取属性的值
	public int getAge(){
		return age;
	}
	
	/**
	 * 通过方法给属性赋值
	 * @param l
	 */
	public void setLegs(int l){
		if(l != 4){
			System.out.println("哥们你见过狗吗？别闹");
			legs = 4;
		}else{
			legs = l;
		}
		
	}
	/**
	 * 通过方法获取属性的值
	 */
	public int getLegs(){
		return legs;
	}
	
	public void info(){
		System.out.println("name=" + name + " legs=" + legs + " age=" + age);
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "贵宾犬";
//		dog.legs = 9;
//		dog.age = -5;
		dog.setAge(-5);
		dog.setLegs(-10);
		
		dog.info();
	}
}
