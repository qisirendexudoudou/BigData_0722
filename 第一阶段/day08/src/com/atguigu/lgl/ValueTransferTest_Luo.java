package com.atguigu.lgl;

/*
	值传递 ：
	
	说明：
		1.在调用方法时如果传递的是基本数据类型，那么传递的是基本数据类型中具体的数据
		2.在调用方法时如果传递的是引用数据类型，那么传递的是引用数据类型中的地址值
*/
public class ValueTransferTest_Luo {
	public static void main(String[] args) {
		int m = 10;
		int n = 5;
		
		ValueTransferTest_Luo test1 = new ValueTransferTest_Luo();
		test1.swapdata(m, n);
		
		System.out.println("在main方法中   m = " + m + " n = " + n);
	}
	

	
	public void swapdata(int m,int n){
		System.out.println("swapdata方法中 传递前  m = " + m + " n = " + n);
		int tmpe = m;
		m = n;
		n = tmpe;
		System.out.println("swapdata方法中 传递后  m = " + m + " n = " + n);
	}
}

