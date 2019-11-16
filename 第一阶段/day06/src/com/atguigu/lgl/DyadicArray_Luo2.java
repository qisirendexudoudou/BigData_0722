package com.atguigu.lgl;
/*
 		二维数组的声明 初始化 赋值 读取值 属性 遍历二维数组
 */
public class DyadicArray_Luo2 {
	public static void main(String[] args) {
		
		int[][] a;
		a = new int[][]{{1,2}};
		System.out.println("---------------------");
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
//		System.out.println(a[1][0]);
		
		String[][] b = {{"a","b"}};
		System.out.println("---------------------");
		System.out.println(b[0][0]);
		System.out.println(b[0][1]);
//		System.out.println(b[1][1]);
		
		int[][] c = new int[2][];
		c[0] = new int[1];
		c[1] = new int[2];
		System.out.println("---------------------");
		System.out.println(c[0][0]);
//		System.out.println(c[0][1]);
		System.out.println(c[1][0]);
		System.out.println(c[1][1]);
		
		String[][] d = new String[5][];
		d[0] = new String[1];
		d[1] = new String[3];
		d[2] = new String[2];
		System.out.println("---------------------");
		System.out.println(d[0][0]);
//		System.out.println(d[0][1]);
		System.out.println(d[1][0]);
		System.out.println(d[1][1]);
		System.out.println(d[1][2]);
//		System.out.println(d[1][3]);
//		System.out.println(d[3][0]);
//		System.out.println(d[3][1]);
		
		System.out.println(d.length);
		System.out.println(d[0].length);
		System.out.println(d[1].length);
//		System.out.println(d[3].length);
		
		
		
		
		
		
	}
}
