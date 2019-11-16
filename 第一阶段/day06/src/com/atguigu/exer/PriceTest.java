package com.atguigu.exer;

/*
 	 小明要去买一部手机，他询问了4家店的价格，分别是2800.5元，2900元，2750.0元和3100元，显示输出最低价

 */
public class PriceTest {

	public static void main(String[] args) {
		
		double[] ps = {2800.5,2900,2750.0,3100};
		
		//把第一个元素先当成最小的值
		double min = ps[0];
		
		for (int i = 1; i < ps.length; i++) {
			//如果min中的数值比数组中的数值大，那么将数组中的数组赋值给min(min中永远是最小的值)
			if(min > ps[i]){
				min = ps[i];
			}
		}
		
		System.out.println(min);
	}
}
