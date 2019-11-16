package com.atguigu.java;

public class ArrayTest {

	public static void main(String[] args) {
		
		
		String[] names = new String[3];
		names[0] = "蜡笔小新";
		names[1] = "犬夜叉";
		
		String[] names2 = names;
		names2 = new String[2];
		names2[0] = "火影忍者";
		
		System.out.println("--------------names----------------------");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("--------------names2----------------------");
		for (int i = 0; i < names2.length; i++) {
			System.out.println(names2[i]);
		}
	}
}
