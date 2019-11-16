package com.atguigu.lgl;

/*
  		类的成员之属性：也叫做成员变量
  		
  		变量的分类：
  			1.按照数据类型来分： 基本数据类型 vs 引用数据类型
  			2.按照位置来分：成员变量 vs 局部变量
  			
  		成员变量和局部变量的区别：
  		
  			相同点：
  			不同点：
  				位置：
  					局部变量：在方法里，方法的形参，构造器中，构造器的形参，代码块
  					成员变量：在类中方法等结构外
  				权限修饰符：
  					局部变量：不能使用权限修饰符
  					成员变量：可以使用4中权限修饰符（public private protected default)
  				内存中：
  					局部变量：在内存的栈中
  					成员变量：在内存的堆（对象）中
  				默认值：
  					局部变量：没有默认值
  					成员变量：和数组元素的默认值一样
  					
 */
public class FieldTest_Luo {

		public static void main(String[] args) {
//			int a =10;
		 Animal p1 = new Animal();
			 
		}
}

class Animal{
	//属性 （成员变量）
	String name;
	public int a;
	protected boolean flag;
	
	//代码块
	{
		int a =1;// 局部变量
	}
	
	//构造器
	public Animal(){//构造器的形参
		int a = 1;//局部变量
	}
	
	//方法
	public void fangfa(){
		int a =1 ;//局部变量
	}

	
}