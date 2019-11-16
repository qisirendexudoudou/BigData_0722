package com.atguigu.java2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
	注解（Annotation） : 注解用来对类中的结构（属性，方法，类，构造器...）进行补充说明，并不会改变原来的结构
	
	一 系统内置常见的三个注解
		@Override: 限定重写父类方法, 该注解只能用于方法
		@Deprecated: 用于表示所修饰的元素(类, 方法等)已过时。通常是因为所修饰的结构危险或存在更好的选择
		@SuppressWarnings: 抑制编译器警告

	二 自定义注解
		格式 ： @interface 注解名{
					//default后面跟该属性的默认值
					String name() default "abc"; //可以理解成属性
			  }
			  
	三 元注解 ： 注解的注解（在自定义的注解上使用的注解）
		@Target : 用来说明该注解所作用上的注解所使用的范围（可用在哪些类的结构上）
		@Retention ： 用来说明该注解所作用上的注解的生命周期
			SOURCE ： 从创建 - 编译期间 （被编译器所放弃了）
			CLASS ：  编译期间 - 运行期间
			RUNTIME ：运行期间 (如果想通过反射获取该注解，那么该注解的生命周期必须为RUNTIME)
		
		//下面两个注解了解即可
		@Documented : 用来说明该注解所作用上的注解可以被javadoc所解析
		@Inherited ： 用来说明该注解所作用上的注解可以被继承
		
	四 通过反射获取注解信息（反射的时候再说）

 */
@interface MyAnn{
	
}

@interface MyAnn2{
	//default后面跟该属性的默认值
	String name() default "abc"; //可以理解成属性
}


@Retention(RetentionPolicy.RUNTIME) //只要自定义注解那么生命周期必为RUNTIME
@Target(ElementType.METHOD)
@interface MyAnn3{
	
}


@MyAnn2(name = "ccccccccccccccc")
public class AnnotationTest {

	public static void main(String[] args) {
		
		new SubClass().test();
		
		
		@SuppressWarnings("unused")
		int a = 10;
		
		System.out.println("hello java");
	}
}


@MyAnn2
class SuperClass {

	public void info() {

	}
}

@MyAnn
@Deprecated
class SubClass extends SuperClass {
	
	
	@MyAnn
	@Deprecated
	public int age;
	
	
	@MyAnn
	@Deprecated
	public SubClass(){
		
	}
	
	@MyAnn
	@Deprecated
	public void test(){
		
	}

	@MyAnn3
	@MyAnn
	@Override
	public void info() {

	}
}
