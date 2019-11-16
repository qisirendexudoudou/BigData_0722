package com.atguigu.lgl;
/*

2.编写程序，定义三个重载方法并调用。方法名为mOL。
三个方法分别接收一个int参数、两个int参数、一个字符串参数。
分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
在主类的main ()方法中分别用参数区别调用三个方法。

3.定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方法求两个double值中的最大值，
	第三个方法求三个double值中的最大值，并分别调用三个方法。

 */

public class MOLTest_Luo {

	public static void main(String[] args) {
		runTest1 run1 = new runTest1();
		System.out.println(run1.mOL(10));
		System.out.println(run1.mOL(10, 5));
		System.out.println(run1.mOL("iloveyou"));
		System.out.println("------------------");
		
		runTest2 run2 = new runTest2();
		System.out.println(run2.max(10, 4));
		System.out.println(run2.max(12.4, 89.9));
		System.out.println(run2.max(5.4, 11.2, 46.2));
	}

}

class runTest1{
	
	public int mOL(int a){
		return a*a;
	}	

	public int mOL(int a,int b){
		return a*b;
	}
	
	public String mOL(String a){
		return a;
	}	
}

class runTest2{

	public int max(int a, int b){
		return (a>b)?a:b;
	}
	
	public double max(double a,double b){
		return (a>b)?a:b;
	}
	
	public double max(double a,double b,double c){
		double maxNumber = max(a,b);
		return max(maxNumber,c);
		
	}
}