package com.atguigu.lgl;

// 杨辉三角
public class YangHui_Luo {
	public static void main(String[] args) {
		int[][] a = new int[10][];
		
		for (int i = 0; i < a.length; i++) {
			// 创建二维数组的元素
			a[i] = new int[i+1];	
			
			//首位补充一
			a[i][0] = a[i][i] = 1;
			
			
		//补充中间的数字	
		for (int j = 1; j < a[i].length-1; j++) {
			a[i][j] = a[i-1][j-1] + a[i-1][j];		
		}
		
		}
//		遍历
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+ " ");			
			}
				System.out.println();
		}
			
		}
		
	}
