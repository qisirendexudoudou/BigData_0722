package com.atguigu.java;

import org.junit.Test;

public class StringAPI2 {
	
	/*
	 * 5.计算"abc"在"abcdeabcffabcefabc"中出现的次数
	 */
	@Test
	public void test3(){
		int count = 0; //计算出现的次数
		int index = 0; //abc出现的位置
		String str = "abcdeabcffabcefabc";
		String findStr = "abc";
		
		/*
		//查找abc在当前字符串中的位置
		index = str.indexOf(findStr, index);
		
		while(index != -1){
			//出现的次数加1
			count++;
			//再次进行查找
			index = str.indexOf(findStr, index + findStr.length());
			
		}
		*/
		
		while((index = str.indexOf(findStr, index)) != -1){
			//出现的次数加1
			count++;
			//计算下一次需要查找位置
			index += findStr.length();
		}
		System.out.println("abc出现了" + count + "次");
		
	}
	
	//4.反转字符串中的内容
	@Test
	public void test2(){
		String str = "abcdefg";
		String reverseStr = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr += str.charAt(i);
		}
		
		System.out.println(reverseStr);
	}

	/*
	 * 
	 * 1.将字符串中大写的内容转成小写 "abcAADEFccc"
	 * 2.将字符串中小写的内容转成大写
	 * 3.将字符串中小写的内容转成大写，大写的内容转成小写
	 * 4.反转字符串中的内容
	 * 5.计算"abc"在"abcdeabcffabcefabc"中出现的次数
	 */
	@Test
	public void test(){
		String str = "abcAADEFccc";
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			
			char c = str.charAt(i);
			
			//判断该字符是否为大写
			if(c >= 'A' && c <= 'Z'){
				c += 32;
			}
			
			//字符串拼接
			newStr += c;
		}
		
		System.out.println(newStr);
	}
}
