package com.atguigu.java;

/*
 	可变个数形参 ：
 	
 	格式 ： 变量的类型 ... 变量名
 	
 	说明：
 		1.可变形参的底层就是一个数组
 		2.在可变形参的方法中，和可变形参相同类型的数组的方法不构成重载。
 		3.在形参列表中可变形参只能放在最后
 		4.在同一个方法的形参列表中只能有一个可变形参。
 		5.可变形参的个数可以是0个1个或多个
 		
 	
 */
public class VarargsTest {

	public static void main(String[] args) {
		
		VarargsTest vt = new VarargsTest();
//		vt.add(new int[]{1,2,3,4,5,6});
//		vt.add(new int[]{1,2,3,4,5,6,7,8,9,10});
		
		vt.add();
		vt.add(1,2,3,4,5,6,7,8);
		vt.add(2,2,2,2,2);
	}
	
	//注意 ： 在形参列表中可变形参只能放在最后
	public void sum(double  num,int ... numbers){
		
	}
	
	/**
	 * 可变形参
	 * @param numbers
	 */
	public void add(int ... numbers){ //可变形参
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("sum=" + sum);
	}

	// 需求：求两个int类型的和
	/*
	public void add(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("sum=" + sum);
	}
	*/
	

	// 需求：求三个int类型的和
	// 需求：求100个int类型的和
	// 需求：求105个int类型的和
}
