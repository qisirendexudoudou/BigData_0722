package com.atguigu.exer2;

public class Test {

	public static void main(String[] args) {
		
		Boy boy = new Boy("小龙哥", 35);
		Girl girl = new Girl("热巴", 18);
		
		girl.marry(boy);
		
		System.out.println("-----------------------------");
		
		Girl girl2 = new Girl("志玲姐姐", 18);
		girl.compare(girl2);
	}
}
