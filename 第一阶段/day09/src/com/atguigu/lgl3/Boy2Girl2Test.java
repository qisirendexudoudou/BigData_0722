package com.atguigu.lgl3;

public class Boy2Girl2Test {

	public static void main(String[] args) {
		
		Girl2 girl2 = new Girl2("小许", 26);
		Boy2 boy2 = new Boy2("小罗", 28);
		
		girl2.marry(boy2);
		boy2.marry(girl2);
		
		Girl2 girl22 = new Girl2("小小许", 28);
		girl2.compare(girl22);
	}
}
