package com.atguigu.exer4;

public class MyDate {
	
	public static void main(String[] args) {
		MyDate day1 = new MyDate(2019, 8, 9);
		System.out.println(day1.equals(new MyDate(2019, 8, 9)));
	}

	private int year;
	private int month;
	private int day;

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj instanceof MyDate) {
			// 向下转型
			MyDate md = (MyDate) obj;
			return this.year == md.year && this.month == md.month && this.day == md.day;
		}

		return false;
	}
}
