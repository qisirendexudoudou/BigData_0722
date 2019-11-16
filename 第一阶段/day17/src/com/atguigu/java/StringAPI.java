package com.atguigu.java;

import java.util.Arrays;

import org.junit.Test;

public class StringAPI {
	
	/*
	 * 将String -> byte[]
	 * 
	 * 将String -> char[]
	 */
	@Test
	public void test5(){
		//将String -> byte[]
		byte[] bytes = "abcdefg".getBytes();
		//byte[] -> String
		String s = new String(bytes,1,3); //将数组bytes中索引值为1长度为3的内容转成字符串
		System.out.println(s);
		
		//将String -> char[]
		char[] charArray = "abcdefg".toCharArray();
		//char[] -> String
		String string = new String(charArray);
	}
	
	/*
String replace(char oldChar, char newChar)：返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。 
String replace(CharSequence target, CharSequence replacement)：使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。 
String replaceAll(String regex, String replacement)：使用给定的 replacement 
		替换此字符串所有匹配给定的正则表达式的子字符串。 
String replaceFirst(String regex, String replacement)：使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。 
String[] split(String regex)：根据给定的匹配拆分此字符串
	 */
	@Test
	public void test4(){
		//String replace(char oldChar, char newChar)：
		//返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。 
		System.out.println("abcdafg".replace('a', 'A'));
		System.out.println("abcdefgabc".replace("abc", "AAA"));
		System.out.println("abcdefgabc".replaceAll("abc", "AAA"));
		//String replaceFirst(String regex, String replacement)：
		//使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。 
		System.out.println("abcdefgabc".replaceFirst("abc", "AAA"));
		
		System.out.println("-------------------------------");
		String str = "abc-cc-ddd";
		String[] split = str.split("-");
		System.out.println(Arrays.toString(split));
		
		String str2 = "cccdeffff";
		String[] split2 = str2.split("");
		System.out.println(Arrays.toString(split2));
		
	}
	
	/*
boolean contains(CharSequence s)：当且仅当此字符串包含指定的 char 值序列时，返回 true
int indexOf(String str)：返回指定子字符串在此字符串中第一次出现处的索引 
int indexOf(String str, int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始 
int lastIndexOf(String str)：返回指定子字符串在此字符串中最右边出现处的索引 
int lastIndexOf(String str, int fromIndex)：返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索 
注：indexOf和lastIndexOf方法如果未找到都是返回-1
	 */
	@Test
	public void test3(){
		//boolean contains(CharSequence s)：当且仅当此字符串包含指定的 char 值序列时，返回 true
		System.out.println("hellocangjie".contains("cangjie"));
		//int indexOf(String str)：返回指定子字符串在此字符串中第一次出现处的索引 
		System.out.println("abbcdddabcfffabc".indexOf("abc"));
		//int indexOf(String str, int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始 
		System.out.println("abcdddabcfffabc".indexOf("abc", 3));
		//int lastIndexOf(String str)：返回指定子字符串在此字符串中最右边出现处的索引 
		System.out.println("abcdddabcfffabc".lastIndexOf("abc"));
		//int lastIndexOf(String str, int fromIndex)：返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索 
		System.out.println("abcdddabcfffabc".lastIndexOf("abcffff", 11));
	}
	
	/*
boolean endsWith(String suffix)：测试此字符串是否以指定的后缀结束 
boolean startsWith(String prefix)：测试此字符串是否以指定的前缀开始 
boolean startsWith(String prefix, int toffset)：测试此字符串从指定索引开始的子字符串是否以指定前缀开始

	 */
	@Test
	public void test2(){
		//boolean endsWith(String suffix)：测试此字符串是否以指定的后缀结束 
		System.out.println("hellojava.java".endsWith(".java"));
		//boolean startsWith(String prefix)：测试此字符串是否以指定的前缀开始 
		System.out.println("personName".startsWith("personN"));
		//boolean startsWith(String prefix, int toffset)：测试此字符串从指定索引开始的子字符串是否以指定前缀开始
		System.out.println("http://www.baidu.com".startsWith("www",7));
	}

	/*
int length()：返回字符串的长度： return value.length
char charAt(int index)： 返回某索引处的字符return value[index]
boolean isEmpty()：判断是否是空字符串：return value.length == 0
String toLowerCase()：使用默认语言环境，将 String 中的所有字符转换为小写
String toUpperCase()：使用默认语言环境，将 String 中的所有字符转换为大写
String trim()：返回字符串的副本，忽略前导空白和尾部空白
boolean equals(Object obj)：比较字符串的内容是否相同
boolean equalsIgnoreCase(String anotherString)：与equals方法类似，忽略大小写
String concat(String str)：将指定字符串连接到此字符串的结尾。 等价于用“+”
String substring(int beginIndex)：返回一个新的字符串，它是此字符串的从beginIndex开始截取到最后的一个子字符串。 
String substring(int beginIndex, int endIndex) ：返回一个新字符串，它是此字符串从beginIndex开始截取到endIndex(不包含)的一个子字符串。 
	 */
	@Test
	public void test(){
		//int length()：返回字符串的长度： return value.length
		System.out.println("abc".length());
		//char charAt(int index)： 返回某索引处的字符return value[index]
		System.out.println("abc".charAt(0));
		//boolean isEmpty()：判断是否是空字符串：return value.length == 0
		System.out.println("".isEmpty());
		//String toLowerCase()：使用默认语言环境，将 String 中的所有字符转换为小写
		System.out.println("Abc".toLowerCase());
		//String toUpperCase()：使用默认语言环境，将 String 中的所有字符转换为大写
		System.out.println("abc".toUpperCase());
		//String trim()：返回字符串的副本，忽略前导空白和尾部空白
		System.out.println("  a bc    ".trim());
		//boolean equalsIgnoreCase(String anotherString)：与equals方法类似，忽略大小写
		System.out.println("abc".equalsIgnoreCase("ABC"));
		//String concat(String str)：将指定字符串连接到此字符串的结尾。 等价于用“+”
		System.out.println("abc".concat("ccc"));
		//String substring(int beginIndex)：返回一个新的字符串，它是此字符串的从beginIndex开始截取到最后的一个子字符串。
		System.out.println("abcdefg".substring(2));
		//String substring(int beginIndex, int endIndex) ：返回一个新字符串，
//			它是此字符串从beginIndex开始截取到endIndex(不包含)的一个子字符串。(包头不包尾 [beginIndex,endIndex))
		System.out.println("abcdefg".substring(1, 3));
		
	}
}
