package com.atguigu.java;

/*
 	验证 ‘1’和1是不一样的
 */
public class Test {

	public static void main(String[] args) {
		System.out.println('1' + 1); // '1' = 49
		switch('1'){
		case 49:
			System.out.println("111111111111");
			break;
		default:
			System.out.println("other");
			break;
		}
	}
}
