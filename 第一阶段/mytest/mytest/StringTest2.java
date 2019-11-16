package mytest;

import org.junit.Test;

/**
 *  * 1.将字符串中大写的内容转成小写 "abcAADEFccc"
	 * 2.将字符串中小写的内容转成大写
	 * 3.将字符串中小写的内容转成大写，大写的内容转成小写
	 * 4.反转字符串中的内容
	 * 5.计算"abc"在"abcdeabcffabcefabc"中出现的次数
 * @author luogaolong
 *
 */
public class StringTest2 {
	
	
	@Test
	public void test2(){
		String str = "abcAADEFccc";
		String tmpe = "";
		for (int i = str.length()-1; i >=0; i--) {
			tmpe += str.charAt(i);
		}
		System.out.println(tmpe);
	}

	@Test
	public void test1(){
		String str = "abcAADEFccc";
		String aa = "";
//		System.out.println(str.length());
		for (int i = 0; i < str.length(); i++) {
			char at = str.charAt(i);
			if ( at >= 'A' && at <= 'Z') {
				at+=32;
				aa+=at;
			}else if(at >= 'a' && at <= 'z'){
				at-=32;
				aa+=at;
			}
			
		}
		System.out.println(aa);
	}
	
}
