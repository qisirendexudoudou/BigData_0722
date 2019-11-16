package com.atguigu.lgl;

import org.junit.Test;

public class StringAPI2 {
	/*
	 * 
	 * 1.将字符串中大写的内容转成小写 "abcAADEFccc"
	 * 2.将字符串中小写的内容转成大写
	 * 3.将字符串中小写的内容转成大写，大写的内容转成小写
	 * 4.反转字符串中的内容
	 * 5.计算"abc"在"abcdeabcffabcefabc"中出现的次数
	 * 
	 */
	
	@Test
	public void test5(){
		int count = 0;
		int index = 0;
		String str = "abckgjfabckgfdabch";
		String findStr = "abc";
		
		index = str.indexOf(findStr,index);
		while (index != -1) {
			count++;
			index = str.indexOf(findStr, index + findStr.length());
			System.out.println(index);
		}
		System.out.println(count);
		
		
		
	}
	
	@Test
	public void test4(){
		String str = "abcd";
		String str2 = "";
		
		for (int i = str.length()-1; i >=0 ; i--) {
			str2 += str.charAt(i);
		}
		System.out.println(str2);
	}

	@Test
	public void test3(){
		String str = "abcAADEFccc";
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			char at = str.charAt(i);
			if (at >= 'A' && at <= 'Z') {
				at += 32;
				str2 += at;
			} else if(at >= 'a' && at <= 'z'){
				at -= 32;
				str2 += at;
			}
		}
		System.out.println(str2);
	}
	
	@Test
	public void test2(){
		String str = "abcAADEFccc";
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (charAt >= 'A' && charAt <= 'Z') {
				charAt += 32;
			}
			str2 += charAt;
		}
		System.out.println(str2);
}

		
		@Test
		public void test(){
			String str = "abcAADEFccc";
			String str3 = "";
			for (int i = 0; i < str.length(); i++) {
				char charAt = str.charAt(i);
		charAt = str.charAt(i);
		if (charAt >= 'a' && charAt <= 'z') {
			charAt -= 32;
		}
		str3 += charAt;
	}
	System.out.println(str3);
		
	}
	
}