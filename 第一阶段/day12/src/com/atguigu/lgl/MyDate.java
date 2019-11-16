package com.atguigu.lgl;

/**
.请根据以下代码自行定义能满足需要的MyDate类,
在MyDate类中覆盖equals方法，
使其判断当两个MyDate类型对象的年月日都相同时，结果为true，否则为false。    public boolean equals(Object o)
 *
 public class EqualsTest {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(14, 3, 1976);
        MyDate m2 = new MyDate(14, 3, 1976);
        if (m1 == m2) {
            System.out.println("m1==m2");
        } else {
            System.out.println("m1!=m2"); // m1 != m2
        }

        if (m1.equals(m2)) {
            System.out.println("m1 is equal to m2");// m1 is equal to m2
        } else {
            System.out.println("m1 is not equal to m2");
        }
    }
}

 */
public class MyDate {
	
	public static void main(String[] args) {
		MyDate day1 = new MyDate(2019, 8, 9);
		System.out.println(day1.equals(new MyDate(2019, 8, 8)));
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
	public boolean equals(Object arg0) {
		if (this == arg0) {
			return true;
		}
		
		if (arg0 instanceof MyDate) {
			MyDate dd = (MyDate) arg0;
			return this.year == dd.year && this.month == dd.month && this.day == dd.day;
		}
		return false;
	}

}
