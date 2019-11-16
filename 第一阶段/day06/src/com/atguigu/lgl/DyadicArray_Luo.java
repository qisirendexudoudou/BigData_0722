package com.atguigu.lgl;


public class DyadicArray_Luo{
	
	public static void main(String[] args) {
		//二维数组的申明和初始化
		int[][] a;
		a = new int[][]{{1,9},{3,4}};
		System.out.println("---------------------");
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		
		String[][] b = {{"a","1"},{"b","2"}};
		System.out.println("---------------------");
		System.out.println(b[0][0]);
		
		String[][] c;
		c= new String[3][];
		c[0] = new String[2];
		c[1] = new String[3];
		c[2] = new String[3];
		c[0][0] = "haha";
		System.out.println("---------------------");
		System.out.println(c[0][0]);
		
		System.out.println("---------------------");
		System.out.println(c.length);
		
		
		System.out.println("---------------------");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.println(c[i][j]);
			}
			
		}
		
		
		
	}
	
}