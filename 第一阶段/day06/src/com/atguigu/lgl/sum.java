package com.atguigu.lgl;

/*
 		获取arr数组中所有元素的和。
*/
public class sum {
	
	public static void main(String[] args) {
		
		int[][] a = {{3,5,8},{12,9},{7,0,6,4}};
		int sum = 0;
		
		  for (int i=0;i<a.length;i++){
			  for ( int j=0;j<a[i].length;j++){
				  sum += a[i][j];
			  }
		  }
		  System.out.println("sum = " + sum);
	}


}
