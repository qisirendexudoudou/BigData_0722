package com.atguigu.lgl;

/*
	自定义异常类 ：
	
	1.自定义类并继承Exception(编译时异常)/RuntimeException（运行时异常）
	2.提供两个构造器：一个空参的，一个有参的（需要调用父类的有参构造器）
	3.提供一个serialVersionUID，也可以不写系统会自动提供一个
	
*/
public class MyException extends Exception {

	public MyException(){
		super();
	}
	public MyException(String s){
		super(s);
	}
}
