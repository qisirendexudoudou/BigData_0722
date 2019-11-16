package com.atguigu.lgl;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.lang.model.element.Element;

/**
1.编写一个Person类，使用Override注解它的toString方法
2.自定义一个名为“MyTiger”的注解类型，它只可以使用在方法上，带一个String类型的value属性，然后在第1题中的Person类上正确使用。

 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyTiger{
	String value() default "aa";
	
}

public class Person {

	String name;
	int age;
	
	@MyTiger("bb")
	@Override
	public String toString(){
		return name +" -- "+ age;
	}
	
}
