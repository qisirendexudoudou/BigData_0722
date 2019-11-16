package com.atguigu.java;

/**
	枚举类 ： 一个类的对象是可数多个的（有限的）这样的类叫作枚举类
	
	一  自定义枚举类
	
		注意 ： 只有一个对象的枚举类，可以看成是一种单例的实现。
	
	二 使用enum关键字定义枚举类 （jdk1.5开始）
	
	三 枚举类常用的方法
	
	四  实现接口的枚举类
 */
class Season{
	//提供属性
	private final String seasonName;
	private final String seasonDes;
	
	
	//1.私有化构造器 - 防止在类的外部随意的去创建该类的对象
	private Season(String seasonName,String seasonDes){
		this.seasonDes = seasonDes;
		this.seasonName = seasonName;
	}
	
	//2.创建对象 - ①static修饰是为了可以通过类名进行调用  ②final修饰是为了不让随意修改变量的值。
	public static final Season SPRING = new Season("春天","春眠不觉晓");
	public static final Season SUMMER = new Season("夏天","夏天蚊子咬");
	public static final Season AUTUMN = new Season("秋天","秋天落叶黄");
	public static final Season WINTER = new Season("冬天","冬天穿棉袄");
	
	int a;
	int b;
	public static final String str = new String("haha");


	public String getSeasonName() {
		return seasonName;
	}
	public String getSeasonDes() {
		return seasonDes;
	}
	
	
}


public class EnumTest {

	public static void main(String[] args) {
		
		System.out.println(Season.SPRING.getSeasonName() + " " + Season.SPRING.getSeasonDes());
		System.out.println(Season.WINTER.getSeasonName() + " " + Season.WINTER.getSeasonDes());
	}
}


