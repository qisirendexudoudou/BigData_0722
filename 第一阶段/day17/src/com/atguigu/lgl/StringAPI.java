package com.atguigu.lgl;

import java.util.Arrays;

import org.junit.Test;

public class StringAPI {

	@Test
	public void test(){
		System.out.println("abc".length());
		System.out.println("abc".charAt(1));
		System.out.println("a".isEmpty());
		System.out.println("AbC".toLowerCase());
		System.out.println("ABc".toUpperCase());
		System.out.println("  ab c ".trim());
		System.out.println("abc".equals("abcd"));
		System.out.println("abc".equals("Abc"));
		System.out.println("abc".equalsIgnoreCase("AbC"));
		System.out.println("abc".concat("def"));
		System.out.println("abdcdf".substring(3));
		System.out.println("abcdefd".substring(2, 5));
		
		System.out.println("--------------");
		System.out.println("hello.java".endsWith(".jav"));
		System.out.println("hello.java".startsWith("hell"));
		System.out.println("hello.java".startsWith("llo", 3));
		
		System.out.println("---------------");
		System.out.println("xiaozemaliya".contains("malil"));
		System.out.println("kbcsdjfdkdasdk".indexOf("dk"));
		System.out.println("adkbcsdjfdkdasdk".indexOf("dk", 2));
		System.out.println("adshdkjssal".indexOf("dkds"));
		System.out.println("adkbcsdjfdkdasdk".lastIndexOf("dk"));
		System.out.println("adkbcsdjfdkdasdk".lastIndexOf("dk", 5));
		System.out.println("dddgfgfdd".indexOf("dsfsd", 12));
		
		System.out.println("----------------");
		System.out.println("abcda".replace("a", "cccc"));
		System.out.println("abcdefabc".replaceAll("abc", "HH"));
		System.out.println("sadsda".replaceAll("sa", "dddd"));
		System.out.println("adadsaddw".replaceFirst("ad", "ppopp"));
		
		System.out.println("-----------------");
		String str = "aa-bb-c-ff";
		String[] split = str.split("-");
		System.out.println(Arrays.toString(split));
		
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		String str2 = "abcdefg";
		String[] split2 = str2.split("");
		System.out.println(Arrays.toString(split2));
		
		System.out.println("-------------------");
		//String --> byte[]
		byte[] bytes = "abcd".getBytes();
		System.out.println(Arrays.toString(bytes));
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		//byte[] --> String
		String s = new String(bytes,1,2);
		System.out.println(s);
		
		//String --> char[]
		char[] charArray = "abcdefg".toCharArray();
		System.out.println(Arrays.toString(charArray));
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		//cahr[] --> String
		String string = new String(charArray);
		System.out.println(string);
		
		
		
		
		
	}
}
