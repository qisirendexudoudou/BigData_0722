package com.atguigu.lgl;

import javax.crypto.SealedObject;


//枚举
public class EnumTest {
	public static void main(String[] args) {
		//第一种方式
		System.out.println(Season.SPRING.getSeasonName() + " " + Season.SPRING.getSeasonDes());
		
		//第二种方式
		System.out.println(Season.getInstance().getSeasonName()+ " " + Season.getInstance().getSeasonDes());
	}

}


class Season{
	private final String seasonName;
	private final String seasonDes;
	
	//私有化构造器
	private Season(String seasonName,String seasonDes){
		this.seasonName = seasonName;
		this.seasonDes = seasonDes;
	}
	
	//创建对象
	public static final Season SPRING = new Season("春天","暖和");
	public static final Season SUMMER = new Season("夏天","夏天蚊子咬");
	public static final Season AUTUMN = new Season("秋天","秋天落叶黄");
	public static final Season WINTER = new Season("冬天","冬天穿棉袄");
	
	//提供一个公共的方法，返回该类的对象。
	public static Season getInstance(){
		return SPRING;
	}
	
	//get方法
	public String getSeasonName(){
		return seasonName;
	}
	
	public String getSeasonDes(){
		return seasonDes;
	}
}

