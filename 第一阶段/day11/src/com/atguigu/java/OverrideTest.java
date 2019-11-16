package com.atguigu.java;

/**
	方法的重写 （Override）：子类可以对父类中的方法进行复写，覆盖（重写）。
	
	说明:
		1.如果子类对父类中的方法不满意，那么就可以考虑进行方法的重写。
		2.有了继承以后才可以考虑方法的重写。
		3.子类对父类的方法进行重写后，那么再通过子类的对象调用该方法时，那么实际上调用的是子类重写父类的方法。
	
	
	-------------------------------下面的了解即可--------------------------------------------------------
	
	     权限修饰符   返回值类型    方法名(形参列表){
	     	方法体;
	  }
	  
	    子类重写的方法    父类被重写的方法
	  
	  1.子类重写的方法和父类被重写的方法的方法名和形参列表必须一致。
	  2.子类重写的方法的返回值类型不大于父类被重写方法的返回值类型(引用数据类型)
	  		子类重写方法的返回值类型 			父类被重写方法的返回值类型
	  			void							void
	  			具体的基本数据类型(int)				具体的数据类型(int)
	  3.子类重写方法的权限修饰符不小于父类被重写方法的权限修饰符
	  4.子类方法抛出的异常不能大于父类被重写方法的异常（等讲异常的时候再说）
	  
	  
	  注意：
	  1.父类被private修饰的方法不能被子类重写
	  
	  2.子类重父类相同的方法，要么同时加static要么同时不加static(否则会出错) - 等讲了static就明白该关键字的意思了
	  		如果同时加static那么就不是方法的重写。
	  		如果同时不加static那么就是方法的重写。

 */

/*
 * 快捷键 ：ctrl + t : 查看继承树
 */
class Animal{
	
	//父类被重写的方法
	public void shout(){
		System.out.println("啊啊啊啊........");
	}
	
	/*
	 * Object <- Number <- Integer
	 */
	public Number demo(){
		return null;
	}
	
	// private  < 缺省的  < protected < public
	protected void test(){
		
	}
	
//	 1.父类被private修饰的方法不能被子类重写
	private void test2(){
		
	}
	
	public static void run(){
		
	}
}

class Dog extends Animal{
	
	//不是方法的重写
	public static void run(){
		
	}
	
	public void test2(){
		System.out.println("hehe");
	}
	
//	@Override
//	private void test2(){
//		
//	}
	
	//子类重写方法的权限修饰符不小于父类被重写方法的权限修饰符
	public void test(){
		
	}
	
	
	/*
	 *父类被重写的方法的返回值类型是void,那么子类被重写的方法的返回值类型也只能是void
	 *父类被重写的方法的返回值类型是(具体的基本数据类型),那么子类被重写的方法的返回值类型也只能是（具体的基本数据类型）
	 *子类重写方法的返回值类型（引用数据类型）不大于父类被重写方法的返回值类型(引用数据类型)。
	 */
	public Integer demo(){
		return null;
	}
	
	//方法的重写
	@Override //该注解是用来说明注解的方法是重写父类的方法
	public void shout(){//子类重写的方法
		System.out.println("汪汪汪........");
	}
}


public class OverrideTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.shout();
	}
}
