package com.atguigu.lgl;
import java.util.*;
/*
 * 练习三
输入10个元素（10——99范围），保存到数组中，查找里面是否有>80，如果有，显示有，否则提示没有
 */
public class test5 {
	public static void main(String[] args) {
		int[] a = new int[10];
		boolean flag = false;
		Scanner s = new Scanner(System.in);
		
		System.out.println("请输入10个数：");
		for (int i=0;i<a.length;i++){
			a[i] = s.nextInt();
		}
		
		for (int j=0;j<a.length;j++){
			if( a[j] > 80 ){
				flag =true;
			}
		}
		if(flag){
			System.out.println("有大于80的数");
		}else{
			System.out.println("没有大于80的数");
		}
		

	}

}
