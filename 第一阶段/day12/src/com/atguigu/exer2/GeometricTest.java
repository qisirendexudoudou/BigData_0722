package com.atguigu.exer2;

public class GeometricTest {

	/*
	 * 定义三个类，父类GeometricObject代表几何形状，子类Circle代表圆形，MyRectangle代表矩形。
	 * 定义一个测试类GeometricTest，编写equalsArea方法测试两个对象的面积是否相等
	 * （注意方法的参数类型，利用动态绑定技术），
	 * 编写displayGeometricObject方法显示对象的面积（注意方法的参数类型，利用动态绑定技术）。

	 */
	public static void main(String[] args) {
		GeometricTest gt = new GeometricTest();
		
		GeometricObject c = new Circle(1, "yellow", 1);
		GeometricObject mr = new MyRectangle("red", 1, 1, 1);
	
		boolean bo =gt.equalsArea(c,mr);
		System.out.println(bo);
		
		gt.displayGeometricObject(c);
		gt.displayGeometricObject(mr);
	}
	
	public void displayGeometricObject(GeometricObject go){
		System.out.println(go.findArea());
	}
	
	public boolean equalsArea(GeometricObject go1,GeometricObject go2){
		return go1.findArea() == go2.findArea();
	}
}
