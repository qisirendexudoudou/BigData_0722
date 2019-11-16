package com.atguigu.lgl;

/*
5.声明一个日期类型MyDate：
有属性：年year,月month，日day。
创建2个日期对象，分别赋值为：你的出生日期，你对象的出生日期，并显示信息。
*/
public class YearMonthDay_Luo {

	public static void main(String[] args) {
		MyDate p1 = new MyDate();
		MyDate p2 = new MyDate();
		
		p1.year = 2001;
		p1.month = 03;
		p1.day = 23;
		
		p2.year = 2004;
		p2.month = 11;
		p2.day = 20;
		
		p1.myinfo();
		p2.mygfinfo();
	}
}

class MyDate{
	public int year;
	public int month;
	public int day;
	
	public void myinfo(){
		System.out.println("my birthday is " + year + "年" + month + "月 "+ day + "日."  );
	}
	
	public void mygfinfo(){
		System.out.println("mygf birthday is " + year + "年" + month + "月 "+ day + "日."  );
	}
}
