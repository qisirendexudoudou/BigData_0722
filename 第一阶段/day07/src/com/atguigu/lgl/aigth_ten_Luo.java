package com.atguigu.lgl;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
3.1 编写程序，声明一个method方法，在方法中打印一个10*8 的*型矩形，在main方法中调用该方法。

3.2 修改上一个程序，在method方法中，除打印一个10*8的*型矩形外，再计算该矩形的面积，
	并将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。

3.3 修改上一个程序，在method方法提供m和n两个参数，方法中打印一个m*n的*型矩形，并计算该矩形的面积， 
	将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。

 */

public class aigth_ten_Luo {
	
	public static void main(String[] args) {
		aigth_ten_Luo tu1 = new aigth_ten_Luo();
		Scanner s = new Scanner(System.in);
		
		System.out.println("请输入矩形 的常和宽： ");
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println("该图形打印后如下所示：");
		System.out.println("该图形的面积是： " + tu1.method(n, m));
		
		
	}
	
public int method(int m,int n){
	for (int i = 1; i <= m; i++) {
		for (int j = 1; j <= n; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	return m*n;
}	

}
