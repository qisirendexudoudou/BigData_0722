package mytest;

import java.util.Arrays;

import org.junit.Test;

/**
六 与其它结构的转换：	
6.1 与基本数据类型、包装类之间的转换：
      String -> 基本数据类型   ： 包装类.parseXxx()
      String -> 包装类 ： 通过包装类的构造器

6.2 与字节数组byte[]之间的转换：
     String -> byte[]  :  byte[] bs = "abc".getBytes();
     byte[] -> String :    new String(bs);
		
6.3 与字符数组char[]之间的转换：
         String -> char[] :  char[] cs = "abc".toCharArray();
         char[] -> String :  new String(cs);

 */
public class StringTest {

	@Test
	public void test1(){
//		String str = "11";
//		System.out.println(str + 22);
//		System.out.println("------------------");
//		int i = Integer.parseInt(str);
//		System.out.println(i+22);
		
//		Integer integer = new Integer(str);
//		System.out.println(integer+22);
		
		String str = "abc";
		byte[] vs = str.getBytes();
		char[] ca = str.toCharArray();
		for (byte b : vs) {
			System.out.println(b);
		}
		for (char c : ca) {
			System.out.println(c);
		}
		System.out.println(Arrays.toString(ca));
		
	}
}
