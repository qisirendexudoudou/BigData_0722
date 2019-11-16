package com.atguigu.lgl;

/*
 	类的成员之 方法：
 	权限修饰符   返回值类型   方法名（形参列表）{
 		方法体
 	}
 	
 	说明：
 		1.权限修饰符：public protected private default
 		2.void/返回类型 （基本数据类型、引用数据类型）
 			void:表示该方法没有返回值
 			具体的类型：需要用关键字return来返回数据
 			
 		3.方法名（方法的重载）
 		4.形参列表
 		5.方法体
  */
public class MethodTest_luo {
	public static void main(String[] args) {
		Computer p1 =  new Computer();
		System.out.println(p1.show3(1,2));
	}

}

class Computer{
	public void show1(){
		
	}
	
	void show2(){
		
	}
	
	public int show3(int a,int b){
		return a+b;
	}
	
	
	
}