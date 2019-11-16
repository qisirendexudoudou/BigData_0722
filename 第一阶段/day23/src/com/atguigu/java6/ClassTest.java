package com.atguigu.java6;

import org.junit.Test;

class Dog{
	
}
public class ClassTest {

	/*
	 *  1.Class本身也是一个类
	    2.Class 对象只能由系统建立对象
		3.一个加载的类在 JVM 中只会有一个Class实例 
		4.一个Class对象对应的是一个加载到JVM中的一个.class文件
		5.每个类的实例都会记得自己是由哪个 Class 实例所生成
		6.通过Class可以完整地得到一个类中的所有被加载的结构 
		7.Class类是Reflection的根源，针对任何你想动态加载、运行的类，唯有先获得相应的Class对象

	 */
	
	/*
	 * 获取Class对象的方式：
	 *  1）前提：若已知具体的类，通过类的class属性获取，该方法最为安全可靠，程序性能最高
		     实例：Class clazz = String.class;
		2）前提：已知某个类的实例，调用该实例的getClass()方法获取Class对象
		      实例：Class clazz = “www.atguigu.com”.getClass();
		3）前提：已知一个类的全类名，且该类在类路径下，可通过Class类的静态方法forName()获取，可能抛出ClassNotFoundException
		      实例：Class clazz = Class.forName(“java.lang.String”);
		4）其他方式(不做要求)
		ClassLoader cl = this.getClass().getClassLoader();
		Class clazz4 = cl.loadClass(“类的全类名”);

	 */
	@Test
	public void test() throws ClassNotFoundException{
		//方式一：类名.class
		Class clazz = Dog.class;
		//方式二：对象名.getClass();
		Dog dog = new Dog();
		Class clazz2 = dog.getClass();
		//方式三 ： Class.forName(全类名)
		Class clazz3 = Class.forName("com.atguigu.java6.Dog");
		//方式四 ： 类名加载.loadClass(全类名) (理解)
		ClassLoader classLoader = this.getClass().getClassLoader();//获取类加载器
		Class clazz4 = classLoader.loadClass("com.atguigu.java6.Dog");
		
		System.out.println(clazz == clazz2);
		System.out.println(clazz3 == clazz4);
		System.out.println(clazz == clazz3);
	}
}















