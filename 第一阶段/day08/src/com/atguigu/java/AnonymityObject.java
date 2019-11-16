package com.atguigu.java;

/*
 	匿名对象 : 没有名字的对象
 	
 	特点 ： 只能使用一次。
 	
 	使用场景 ： 往往将匿名对象作为实参进行传递。
 */
class Cat{
	
	String name;
	
	public void run(){
		System.out.println(name + "在跑步");
	}
}


public class AnonymityObject {

	public static void main(String[] args) {
		//创建对象
		Cat cat = new Cat();
		cat.name = "菊猫";
		cat.run();
		
		//创建匿名对象
		new Cat().name = "小猫咪";
		new Cat().run();
		
		//调用方法
		Cat c = new Cat();
		new AnonymityObject().setCat(new Cat());
		
	}
	
	//方法
	public void setCat(Cat cat){ //注意 ： 如果形参是一个引用数据类型，那么我们往往传递的是该类的类型的对象。
		
	}
}
