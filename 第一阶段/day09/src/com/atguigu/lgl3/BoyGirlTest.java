package com.atguigu.lgl3;

public class BoyGirlTest {
	public static void main(String[] args) {
		Boy_Luo boy1 = new Boy_Luo("小罗", 28);
		Girl_Luo girl1 = new Girl_Luo("小许", 26);
		
		girl1.marry(boy1);
		boy1.marry(girl1);
		
		Girl_Luo girl2 = new Girl_Luo("小小许", 14);
		girl1.compare(girl2);
	}

}
