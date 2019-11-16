package com.atguigu.java2;

/*
 	二维数组的内存解析
 */
public class DyadicArray2 {

	public static void main(String[] args) {
		
		//创建二维数组
		String[][] ps = new String[3][];
		ps[0] = new String[2];
		ps[1] = new String[3];
		ps[2] = new String[2];
		//给二维数组赋值
		ps[0][0] = "威哥";
		ps[1][0] = "强哥";
		ps[2][1] = "119";
		
		
		for (int i = 0; i < ps.length; i++) {
			for (int j = 0; j < ps[i].length; j++) {
				System.out.print(ps[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
