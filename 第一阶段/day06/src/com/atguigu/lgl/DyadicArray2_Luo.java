package com.atguigu.lgl;

public class DyadicArray2_Luo {
	public static void main(String[] args) {
		
		int[][] a = new int[2][3];
		a[0][0] = 10;
		a[0][2] = 20;
		a[1][1] = 30;
		
		int[][] b = a;
		
		b[0][2] = 200;
		
		 for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " " );	
			}System.out.println();
		}
		 
		 System.out.println("------------------------------");
		 for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " " );	
			}System.out.println();
		}
		 
		 int[][] c = a;
		 c = new int[2][];
		 c[0] = new int[4];
		 c[1] = new int[4];
		 c[0][2] = 123;
		 
		 System.out.println("------------------------------");
		 for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " " );	
			}System.out.println();
		}
	}

}
