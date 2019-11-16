package com.atguigu.exer;

/*
 	ctrl + z : 撤销
 	
 	ctrl + y : 反撤销
 	
 	ctrl + 1 : 创建一个新的局部变量
 	
 	
2.编写程序，定义三个重载方法并调用。方法名为mOL。
三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
在主类的main ()方法中分别用参数区别调用三个方法。

3.定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方法求两个double值中的最大值，
	第三个方法求三个double值中的最大值，并分别调用三个方法。

 */
public class MOLTest {
	
	public int max(int a,int b){
		int maxNumber = (a > b)? a : b;
		return maxNumber;
	}
	
	public double max(double a,double b){
		double maxNumber = Math.max(a, b);
		return maxNumber;
	}
	
	public double max(double a,double b,double c){
		/*
		double maxNumber = Math.max(a, b);
		return Math.max(maxNumber, c);
		*/
		double maxNumber = max(a, b);
		return max(maxNumber, c);
	}
	
	//------------------------------------------------------------------
	
	public void mOL(String str){
		System.out.println(str);
	}
	
	public void mOL(int a,int b){
		System.out.println(a * b);
	}
	
	public void mOL(int a){
		System.out.println(a * a);
	}

	public static void main(String[] args) {
		//创建对象
		MOLTest molTest = new MOLTest();
		//调用方法
		molTest.mOL(10);
		molTest.mOL("小龙哥最帅");
		molTest.mOL(5, 10);
		
		System.out.println("---------------max------------------------");
		
		double max = molTest.max(10.2, 10.6, 19.3);
		System.out.println(max);
	}
	
	
}
