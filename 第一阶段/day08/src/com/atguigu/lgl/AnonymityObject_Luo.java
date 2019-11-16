package com.atguigu.lgl;

/*
	匿名对象 : 没有名字的对象
	
	特点 ： 只能使用一次。
	
	使用场景 ： 往往将匿名对象作为实参进行传递。
*/

public class AnonymityObject_Luo {
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.name = "小许 ";
		cat.run();
		
		new Cat().name = "小罗";
		new Cat().run();
		
		
		////注意 ： 如果形参是一个引用数据类型，那么我们往往传递的是该类的类型的对象。
		AnonymityObject_Luo luo1 = new AnonymityObject_Luo();
//		Cat cat2 = new Cat();
//		luo1.run(cat2);
		
		luo1.run(new Cat());
	}
	
public void run(Cat cc){
		System.out.println("test!!!");
	}	
}

class Cat{
	public String name;
	
	public void run(){
		System.out.println( name + " is running...");
	}
}