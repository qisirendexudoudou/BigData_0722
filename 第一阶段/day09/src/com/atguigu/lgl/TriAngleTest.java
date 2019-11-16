package com.atguigu.lgl;

//		另一个类中使用这些公共方法，计算三角形的面积。
public class TriAngleTest {
	
	public static void main(String[] args) {
		
		System.out.println("--------默认值测试-----------");
		TriAngle triAngle = new TriAngle();
		System.out.println(triAngle.getBase());
		System.out.println(triAngle.getHeight());
		System.out.println(triAngle.s());
		
		
		System.out.println("--------具体赋值测试-----------");
		TriAngle triAngle2 = new TriAngle();
		triAngle2.setValues(2.0, 3.0);
		System.out.println(triAngle2.getBase());
		System.out.println(triAngle2.getHeight());
		System.out.println(triAngle2.s());	
	}
}
