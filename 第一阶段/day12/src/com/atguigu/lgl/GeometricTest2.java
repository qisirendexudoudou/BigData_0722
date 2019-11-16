package com.atguigu.lgl;


/*
 * 定义三个类，父类GeometricObject代表几何形状，子类Circle代表圆形，MyRectangle代表矩形。
 * 定义一个测试类GeometricTest，
 * 编写equalsArea方法测试两个对象的面积是否相等（注意方法的参数类型，利用动态绑定技术），
 * 编写displayGeometricObject方法显示对象的面积（注意方法的参数类型，利用动态绑定技术）。

 */
public class GeometricTest2 {
	
	public static void main(String[] args) {
		GeometricTest2 gtest = new GeometricTest2();
		System.out.println(
				gtest.equalsArea(new Circle("red", 1, 2.0), new MyRectangle("yellow", 1, 2.0, 2.0)));
		
		GeometricTest2 gtest2 = new GeometricTest2();
		System.out.println(gtest2.displayGeometricObject(new Circle("red", 1, 2.0)));
		System.out.println(gtest2.displayGeometricObject(new MyRectangle("bule", 1, 2.0, 2.0)));
		
		
	}
	
	public boolean equalsArea(GeometricObject g1,GeometricObject g2){
		return g1.findArea() == g2.findArea();
	}

	public double displayGeometricObject(GeometricObject g){
			return	g.findArea();
	}
}
