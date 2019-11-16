package com.atguigu.lgl;

import java.util.Arrays;


//eclipse方式
public class Maintest {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println(Arrays.toString(args));
		System.out.println(args.length);
	}
}





