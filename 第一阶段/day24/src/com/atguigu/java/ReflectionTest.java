package com.atguigu.java;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * 通过反射获取类中的结构
 * 
 * 记住 - 
 * 		1.获取指定的属性和方法
 * 		2.获取Class对象的四种方式（前三种必须会）
 * 		3.三种类加载器
 * 			[面试题] ：自定义一个类java.lang.String类是否能替换核心类库中的String? 
 * 						不能，因为类加载器不同（双亲委派模型）
 * 
 */
public class ReflectionTest {

	/**
	 * 获取类中所有的方法
	 */
	@Test
	public void test(){
		//1.获取Class的对象
		Class clazz = SubClass.class;
		//2.获取方法 - 获取本类及父类中所有的public修饰的方法
//		Method[] methods = clazz.getMethods();
//		for (Method method : methods) {
//			System.out.println(method);
//		}
		
		//3.获取本类中所有的方法 - 获取本类中所有的方法
		Method[] declaredMethods = clazz.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method);
		}
	}
	
	/**
	 * 获取类中指定的方法
	 * @throws Exception 
	 * @throws NoSuchMethodException 
	 */
	@Test
	public void test3() throws NoSuchMethodException, Exception{
		SubClass sc = new SubClass();
		//1.获取Class的对象
		Class clazz = SubClass.class;
		//2.获取指定的方法 - 只能获取public修饰的方法
		/*
		 * getMethod(String name, Class<?>... parameterTypes)
		 * 第一个参数：方法的名字
		 * 第二个参数 ：方法形参的类型
		 */
		Method sbinfoPublic = clazz.getMethod("sbinfoPublic",String.class,int.class);
		//3.调用方法
		/*
		 * invoke(Object obj, Object... args)
		 * 第一个参数 ：调用的方法所属的对象
		 * 第二个参数 ： 实参
		 */
		sbinfoPublic.invoke(sc,"小龙哥",10);
		
		System.out.println("---------------------------调用私有的方法--------------------------------------");
		/*
		 * 调用任何权限修饰符修饰的方法
		 * getDeclaredMethod(String name, Class<?>... parameterTypes)
		 * 第一个参数：方法的名字
		 * 第二个参数 ：方法形参的类型
		 */
		Method sbinfoPrivate = clazz.getDeclaredMethod("sbinfoPrivate");
		/*
		 * 授权（允许访问）
		 */
		sbinfoPrivate.setAccessible(true);
		/*
		 * invoke(Object obj, Object... args)
		 * 第一个参数 ：调用的方法所属的对象
		 * 第二个参数 ： 实参
		 */
		sbinfoPrivate.invoke(sc);
	}
	
	/**
	 * 获取类中指定的属性
	 * @throws Exception 
	 * @throws NoSuchFieldException 
	 */
	@Test
	public void test4() throws NoSuchFieldException, Exception{
		
		SubClass sc = new SubClass();
		
		//1.获取Class的对象
		Class clazz = SubClass.class;
		//获取属性 - 只能是public修饰的
		Field sbStreetPublic = clazz.getField("sbStreetPublic");
		//给属性赋值
		sbStreetPublic.set(sc, "aaaaaaaaaaaaaaaaa");
		
		System.out.println(sc.sbStreetPublic);
		
		System.out.println("------------------获取私有的属性------------------------------");
		
		//获取指定的属性 - 任何权限修饰符修饰的属性
		Field sbScorePrivate = clazz.getDeclaredField("sbScorePrivate");
		//授权 -允许访问
		sbScorePrivate.setAccessible(true);
		//给属性赋值
		/*
		 * setInt(Object obj, int i)
		 * 第一个参数 ： 给哪个对象的该属性赋值
		 * 第二个参数 ： 给属性赋的内容
		 */
		sbScorePrivate.setInt(sc, 111);
		
		System.out.println(sc.getSbScorePrivate());
	}
	
	/**
	 * 获取类中的属性
	 */
	@Test
	public void test2(){
		//1.获取Class的对象
		Class clazz = SubClass.class;
		//2.获取属性 - 获取本类及父类中所有的public修饰的属性
		Field[] fields = clazz.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		
		System.out.println("-------------------------------");
		//获取本类中所有的属性
		Field[] declaredFields = clazz.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println(field);
		}
	}
}
















