package com.atguigu.lgl;

/*	可变个数形参 ：
 	
	格式 ： 变量的类型 ... 变量名
	
	说明：
		1.可变形参的底层就是一个数组
		2.在可变形参的方法中，和可变形参相同类型的数组的方法不构成重载。
		3.在形参列表中可变形参只能放在最后
		4.在同一个方法的形参列表中只能有一个可变形参。
		5.可变形参的个数可以是0个1个或多个*/
		
public class VarargsTest_Luo {
	public static void main(String[] args) {
		sunTest sunTest1 = new sunTest();
		System.out.println(sunTest1.sum(12,14,16,18,20));
		
		System.out.println("-------array_test---------");
		sunTest sunTest2 = new sunTest();
		int[] a = {12,14,16,18,20};
		System.out.println(sunTest2.sum2(a));
		
		System.out.println(sunTest2.sum2(new int[]{12,14,16,18,20}));
		
	}

}

class sunTest{
	
	public int sum(int...a){
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}	
	
	public int sum2(int[] a){
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
