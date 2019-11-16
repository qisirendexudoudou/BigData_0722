package com.atguigu.java4;

/**
	接口的新特性(jdk1.8 - 熟悉即可) 
	
	说明：
		1.调用接口中的静态方法 ： 接口名.静态方法名
		2.调用接口中的默认方法 ： 接口的实现类的对象.默认方法名
		3.类优先原则 ：接口和父类中的方法相同时，那么默认调用的是父类中的该方法。
		4.一个类实现多个接口，多个接口中有相同的默认方法，那么该类必须重写该默认方法。
		5.如果子类重写了接口中的默认方法，那么我们可以通过（接口名.super.默认方法名）的方式调用接口中的默认方法
*/

class SuperClass{
	public void demo(){
		System.out.println("superClass demo");
	}
}
class MyClass  implements MyInterface,MyInterface2{

	@Override
	public void demo() {
		//调用的是MyInterface中的默认方法
		MyInterface.super.demo();
		//调用的是MyInterface2中的默认方法
		MyInterface2.super.demo();
		System.out.println("myClass demo");
	}
	
}
public class NewInterfaceTest {

	public static void main(String[] args) {
		//调用接口中的静态方法
		MyInterface.info();
		MyInterface2.info();
		System.out.println("------------------------------------");
		//调用接口中的默认方法
		new MyClass().demo();
	}
}
