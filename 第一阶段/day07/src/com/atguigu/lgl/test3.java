package com.atguigu.lgl;

/*
 1 编写程序，声明一个method方法，在方法中打印一个10*8 的*型矩形，在main方法中调用该方法。
 */
public class test3 {

	public static void main(String[] args) {
		Tuxing t1 = new Tuxing();
		t1.run(5, 8);
	
		
	}
}


class Tuxing{
	
	public void run(int m,int n){
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("该图形的面积是：" + m*n);
	}
}
