package com.atguigu.lgl;

/* 
2.编写程序，定义三个重载方法并调用。方法名为mOL。
三个方法分别接收一个int参数、两个int参数、一个字符串参数。
分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
在主类的main ()方法中分别用参数区别调用三个方法。

3.定义三个重载方法max()，
第一个方法求两个int值中的最大值，
第二个方法求两个double值中的最大值，
第三个方法求三个double值中的最大值，并分别调用三个方法。

 */
public class overload_Luo2 {

	public static void main(String[] args) {
		luo2 ll = new luo2();
		System.out.println(ll.mOL(10));
		System.out.println(ll.mOL(10,20));
		System.out.println(ll.mOL("iloveyou"));
		
		run2 ll2 = new run2();
		System.out.println(ll2.max(10, 5));
		System.out.println(ll2.max(11.2, 18.4));
		System.out.println(ll2.max(12.6, 1.12, 22.0));

	}
}


class luo2{
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

class run2{
	public int max(int a,int b){
		int max = (a > b)?a:b;
		return max;
	}
	
	public double max(double a,double b){
		double max = (a > b)?a:b;
		return max;
	}
	
	public double max(double a,double b,double c){
		double tmp = (a > b)?a:b;
		double max = (c > tmp )?c:tmp;
		return max;
	}
}
