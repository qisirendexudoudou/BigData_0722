package com.atguigu.java;

/*
 	抽象类和抽象方法（关键字：abstract）:
 	
 	abstract可以修饰方法和类
 	
 	abstracct修饰方法（抽象方法）:
 		1.抽象方法没有方法体
 		2.抽象类不能被实例化
 		3.抽象类中有构造器吗？有构造器 - 为了子类对象的实例化过程（因为必须调用父类的构造器）。
 	abstract修饰类（抽象类）:
 		1.抽象方法所在的类必须为抽象类
 		2.非抽象子类必须重写抽象父类中的所有抽象方法，如果父类重写了抽象父类中的抽象方法，那么该非抽象子类就不用再重写了
 		3.抽象子类可以不用重写抽象父类中的抽象方法，不过可以进行重写。
 		4.抽象类中可以没有抽象方法。
 	
 	abstract不能和哪些关键字一起使用？ final,private,static
 	
 */


/**
 * 抽象类
 * 
 *
 */
abstract class Math{
	/**
	 * 抽象方法
	 */
	public abstract void say();
}

/**
 * 抽象方法所在的类必须为抽象类
 *
 */
abstract class GeometricObject extends Math{
	
	/**
	 * 思考 ：抽象类中有构造器吗？有构造器 - 为了子类对象的实例化过程（因为必须调用父类的构造器）。
	 */
	public GeometricObject(){
		System.out.println("GeometricObject()");
	}
	
	/**
	 * 该方法必须声明，因为需要使用多态。但是该方法的方法体又不能具体去实现。那我们可以将该方法声明成抽象方法
	 * @return
	 */
	public abstract double findArea();//抽象方法没有方法体
	
	/**
	 * 抽象子类可以重写抽象父类中的抽象方法
	 */
	@Override
	public void say() {
		System.out.println("-------say----------");
	}

}

class Circle extends GeometricObject{
	double radius = 1;
	
	/**
	 * 非抽象子类必须重写抽象父类中的所有抽象方法，如果父类重写了抽象父类中的抽象方法，那么该非抽象子类就不用再重写了
	 * 抽象子类可以不用重写抽象父类中的抽象方法，抽象子类可以重写抽象父类中的抽象方法
	 */
	@Override
	public double findArea() {
		
		return 3.14 * radius * radius;
	}

	
}



public class AbstractTest {

	public static void main(String[] args) {
		
		//抽象类不能被实例化
//		new GeometricObject();
		
		GeometricObject go = new Circle();//多态
	
	}
}
