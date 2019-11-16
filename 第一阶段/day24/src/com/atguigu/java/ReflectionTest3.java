package com.atguigu.java;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

import org.junit.Test;

/*
 * 了解
 */
public class ReflectionTest3 {
	
	/*
	 * 通过反射获取属性的详细信息
	 */
	@Test
	public void test(){
		Class clazz = SubClass.class;
		
		//获取本类中的所有属性
		Field[] declaredFields = clazz.getDeclaredFields();
		
		for (Field field : declaredFields) {
			
			Annotation[] annotations = field.getAnnotations();
			for (Annotation annotation : annotations) {
				System.out.println(annotation);
			}
			
			//获取属性的权限修饰符
			int modifiers = field.getModifiers();
			//通过Modifier.toString方法将权限修饰符的数值转换成对应的名称
			System.out.print(Modifier.toString(modifiers) + " ");
			
			//获取属性的类型
			System.out.print(field.getType() + " ");
			
			//获取属性的名字
			System.out.print(field.getName());
			System.out.println();
		}
	}

	/*
	 * 通过反射获取方法的详细信息
	 */
	@Test
	public void test2(){
		
		Class clazz = SubClass.class;
		
		Method[] declaredMethods = clazz.getDeclaredMethods();
		
		for (Method method : declaredMethods) {
			
			System.out.print(Modifier.toString(method.getModifiers()) + " ");
			//获取返回值类型
			System.out.print(method.getReturnType() + " ");
			
			System.out.print(method.getName() + " ");
			
			Parameter[] parameters = method.getParameters();
			System.out.print("(");
			for (Parameter parameter : parameters) {
				System.out.print(parameter + " ");
			}
			System.out.print(")");
			
			System.out.println();
		}
	}
}

















