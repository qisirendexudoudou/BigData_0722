package com.atguigu.java;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import org.junit.Test;

/*
 * 了解即可
 */
class Person{
	
}
public class ReflectionTest2 {
	
	/*
	 * 通过注解给属性赋值（1.通过全类名创建对象  2.通过反射获取该属性   3.通过反射将创建的对象给属性赋值）
	 */
	@MyAnn(className = "com.atguigu.java.Person")
	Person person;
	/*
	 * 通过反射获取注解
	 */
	@Test
	public void test4() throws Exception, Exception{
		Class clazz  = SubClass.class;
		
		//获取类上的注解
		Annotation[] annotations = clazz.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}
		
		//获取属性上的注解
		//1.先获取属性
		Field field = clazz.getField("sbStreetPublic");
		//2.获取属性上的注解
		Annotation[] annotations2 = field.getAnnotations();
		for (Annotation annotation : annotations2) {
//			System.out.println(annotation);
			//1.向下转型
			MyAnn ma = (MyAnn) annotation;
			System.out.println(ma.age());
		}
	}
	/*
	 * 通过反射创建对象
	 */
	@Test
	public void test3() throws Exception, Exception{
		Class clazz = SubClass.class;
		
		//只能通过public修饰的构造器
		//创建对象 - 通过空参的构造器创建对象
		SubClass sc = (SubClass) clazz.newInstance();
		
		//只能通过public修饰的构造器
		//通过有参的构造器创建对象
		//1.先获取构造器
		Constructor constructor = clazz.getConstructor(int.class);//形参 ： 构造器形参的类型
		//2.创建对象
		SubClass sc2 = (SubClass) constructor.newInstance(10);//形参 ：传递给构造器的实参的内容
		
		
		//通过private修饰的构造器创建对象
		Constructor declaredConstructor = clazz.getDeclaredConstructor(int.class,int.class);
		//允许访问
		declaredConstructor.setAccessible(true);
		//创建对象
		declaredConstructor.newInstance(1,2);
	}
	
	/*
	 * 获取构造器
	 */
	@Test
	public void test2(){
		Class clazz = SubClass.class;
		//获取构造器 - public修饰的
		Constructor[] constructors = clazz.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		
		System.out.println("-----------------------------------");
		
		//获取所有的构造器 - 任何权限修饰符修饰的
		Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : declaredConstructors) {
			System.out.println(constructor);
		}
		
	}

	/*
	 * 获取父类
	 */
	@Test
	public void test(){
		
		Class clazz = SubClass.class;
		//获取父类的运行时类的对象（父类的类信息）
		Class superclass = clazz.getSuperclass();
		
		System.out.println(superclass);
	}
}
