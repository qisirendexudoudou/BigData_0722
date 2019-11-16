package com.atguigu.lgl;


/*
 * 定义三个类，父类GeometricObject代表几何形状，子类Circle代表圆形，MyRectangle代表矩形。
 * 定义一个测试类GeometricTest，
 * 编写equalsArea方法测试两个对象的面积是否相等（注意方法的参数类型，利用动态绑定技术），
 * 编写displayGeometricObject方法显示对象的面积（注意方法的参数类型，利用动态绑定技术）。

 */
public class GeometricTest {
	
	public static void main(String[] args) {
		
		GeometricTest gtest = new GeometricTest();
		boolean result = gtest.equalsArea(new Circle("red", 1, 1.0), new MyRectangle("bule", 1, 1.0, 1.0));
		System.out.println(result);
		
		System.out.println();
		GeometricTest gtest2 = new GeometricTest();
		System.out.println(gtest2.displayGeometricObject(new Circle("red", 1, 2.0)));
		System.out.println();
		System.out.println(gtest2.displayGeometricObject(new MyRectangle("yellow", 1, 2.0, 2.0)));
		
		
	}
	
	public boolean  equalsArea(GeometricObject c,GeometricObject m){
		
		if (c.findArea() == m.findArea()) {
			return true;
		}else
			return false;
	}
	
	public double displayGeometricObject(GeometricObject g){
		return g.findArea();
		
	}
}

