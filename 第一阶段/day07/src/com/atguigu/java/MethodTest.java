package com.atguigu.java;

/*
 	类的成员之 ： 方法
 	
 	格式 ：
 		
 		权限修饰符	     返回值类型	方法名(形参列表){
 			方法体
 		}
 		
 	说明：
 		1.权限修饰符 ：public protected 缺省的  private (先用public)
 		2.void/具体的类型（基本数据类型、引用数据类型）：
 		  void : 表示该方法没有返回值
 		    具体的类型 ： 调用该方法会有返回值。注意：返回数据需要使用return关键字。return 后面跟需要返回的数据。
 		3.方法名 ：只需要遵守标识符的规则和规范即可(形参相同的情况下，同一个类中的方法名不能相同)。
 		4.形参列表 ：可以有0个1个或多个。多个之间使用","隔开。
 			作用 ：用来通知方法的调用者调用此方法时需要传递数据。
 			注意： 实参的类型必须和形参的类型保持一致
 		5.方法体 ： 方法功能的具体体现。
 			注意 ：只有调用方法时方法体才会执行。
 */
class Computer{
	
	//有形参的方法
	public void showInfo(String name,int age){
		System.out.println("我的名字叫" + name + "年纪" + age);
	}
	//有形参的方法
	public void add(int a,int b){
		System.out.println(a + b);
	}
	
	//有返回值的方法
	public String getInfo(){
		return "cpu:I7" + "内存:16G";
	}
	
	//有返回值的方法
	public int sum(){
		System.out.println("计算中.....");
		int a = 20;
		return a; //返回数据需要使用return关键字。return 后面跟需要返回的数据。
//		System.out.println("cccc");注意 ：return后面不能直接再跟其它语句
	}
	
	//缺省的
	void run(){
		System.out.println("正在运行中................");
	}
	
	//public
	public void show(){
		
	}
}
public class MethodTest {

	public static void main(String[] args) {
		//创建对象
		Computer computer = new Computer();
		//调用方法 - 无返回值的方法
		computer.run();
//		System.out.println(computer.run()); 编译错误：因为方法没有返回值所以不能输出
		//调用方法 - 调用有返回值的方法
		int result = computer.sum();
		System.out.println("result=" + result);
		//调用方法 - 调用有参的方法
//		String info = computer.getInfo();
		System.out.println(computer.getInfo());
		
		System.out.println("---------------------------------------------");
		
		//调用有参的方法
		computer.add(5,10);
		//调用有参的方法
		computer.showInfo("小龙哥", 18);//实参
//		computer.showInfo(18, "小龙哥"); //编译错误，实参的类型必须和形参的类型保持一致
		/*
		 	public void showInfo(String name,int age){
				System.out.println("我的名字叫" + name + "年纪" + age);
			}
		 */
	}
}






