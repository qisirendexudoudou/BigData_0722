package com.atguigu.java;

/**
 	面向对象特性之 ： 多态性
 	
 	
 	一  多态性的说明:  一类事物的多种形态
 	
 	二  多态性的理解：
 		广义上：1.方法的重写，重载   2.子类对象的多态性
 		
 		狭义上：子类对象的多态性
 		
 	三 子类对象的多态性 ：父类的引用指向子类的对象
 	
 	
 */
public class PersonTest {

	public static void main(String[] args) {
		//父类的引用指向子类的对象
		Person p = new Woman();//多态
		//思考 ：调用的是谁的show方法？
		p.show();//编译看左边，运行看右边 (采用的是动态绑定技术)
//		p.buy(); 不能调用子类独有的方法
		
		System.out.println("--------------向下转型--------------------");
		
		//如果想调用子类中的独有的方法怎么办？
		Woman w = (Woman) p; //向下转型
		w.buy();
		
		
		//向下转型时，就看父类的引用指向的对象是谁，那么就可以转成谁
//		Man m = (Man) p; //运行时发生的异常 ：ClassCastException
//		m.smoking();
		
		/*
		 * 类型判断 ：
		 * 
		 * a instanceof A :  a这个对象是否是A类的一个实例。如果是返回true,否则返回false
		 * 
		 * a instanceof A 返回值是true,a instanceof B返回值也是true,说明A和B之间存在继承关系
		 * 
		 */
		p = new Man();
		if(p instanceof Woman){
			System.out.println("我是女生，爱漂亮的女生");
			Woman w2 = (Woman) p;
		}else if(p instanceof Man){
			System.out.println("我是男生，帅帅的男生");
			Man m2 = (Man) p;
		}
		
		System.out.println(p instanceof Man); //true
		System.out.println(p instanceof Woman);//false
		System.out.println(p instanceof Person);//true
		
		System.out.println("---------------------------------------------");
		
		//c对象是谁就看指向的对象是谁
		Creature c = new Woman();
		System.out.println(c instanceof Woman);
		System.out.println(c instanceof Person);
		System.out.println(c instanceof Creature);
		
		/*
		 * 注意 ：创建Creature对象，那么内存中只有Creature及父类的信息（没有子类的类信息）
		 * 
		 *      创建Woman的对象，那么内存中那么就有Creature的类信息和Person的类信息
		 */
		c = new Creature(); //c的对象是Creature的实例
		System.out.println(c instanceof Woman); //false
		System.out.println(c instanceof Person); //false
		System.out.println(c instanceof Creature);//true
		
		System.out.println("-------------------注意------------------");
		
		Creature c2 = new Woman();
		//因为Person也是Woman的父类所以可以转成Person
		Person p2 = (Person) c2;
		p2.show(); //思考 ：show方法是谁的 - woman
		c2.show();
	}
}















