package com.atguigu.lgl;

/*
 * 练习二
 小明要去买一部手机，他询问了4家店的价格，分别是2800.5元，2900元，2750.0元和3100元，显示输出最低价
 */
public class test4 {

	public static void main(String[] args) {	
		double[] pay = {2800.5,2900,2750.0,3100};
		double min=pay[0];
		
		for (int i=1;i<pay.length;i++){	
//			System.out.println("第" +(i+1)+ "家手机的价格是： " + pay[i]);
			if (pay[i] < min){
				 min = pay[i];
			}
		}
		System.out.println("该手机的最低价格是： " + min);
		}	
}
