package com.atguigu.java;

/*
 	类的成员之 ： 属性（成员变量）
 	
 	变量的分类：
 		1.安照数据类型分 ：基本数据类型　　vs 引用数据类型
 		2.安照位置分 ： 成员变量  vs 局部变量
 	成员变量和局部变量
 		相同点：
 			1.变量的声明的格式都是一样的。
 			2.变量都有作用域
 			3.变量都是先声明后使用
 		不同点：
 			位置：
 				局部变量：在方法里，方法的形参，构造器中，构造器的形参，代码块
 				成员变量： 在类中方法等结构外。
 			权限修饰符：
 				局部变量：不能使用权限修饰符修饰
 				成员变量：可以使用四种权限修饰符（public protected 缺省的(default) private）
 			内存：
 				局部变量：在内存的栈中
 				成员变量：在内存的堆（对象）中
 			默认值：
 				局部变量 ：没有默认值
 				成员变量 ：有默认值（和数组元素的默认值是一样的）
 						byte,short,int,long -> 0
 						float,double -> 0.0
 						boolean -> false
 						char -> \u0000
 						引用数据类型 -> null
 				
 */
class Animal{
	//属性（成员变量）
	public String name = "动物";
	int legs;
	protected boolean isLive = true;
	
	
	{//代码块
		String address = "";//局部变量
	}
	
	public Animal(){
		
	}
	
	//构造器
	public Animal(int sex){//构造器的形参
		int a = 10;//局部变量
	}
	
	//方法
	public void say(int sex){//方法的形参
		//局部变量
		int age = 10;
		age = 20;
		
		name = "小动物";
	}
}
public class FieldTest {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		//创建对象
		Animal animal = new Animal();
		System.out.println(animal.legs);
	}
}


