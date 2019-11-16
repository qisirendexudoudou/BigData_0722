package run100;

import org.junit.Test;

public class test2 {

	/*
	 * 		7.有n步台阶，一次只能上1步或2步，共有多少种走法？
		答案一：递归
	 */
	@Test
	public void test1(){

		System.out.println(f(5));
	}
	public static int f(int n) {
		if (n <= 2)
			return n;
		int x = f(n - 1) + f(n - 2);
		return x;
	}
	
	/*
	 * 8.输入整型数98765，输出是56789
	 */
	@Test
	public void test2(){
		long num = 98765L;
		StringBuffer str = new StringBuffer(num+"");
		str.reverse();
		String string = str.toString();
		long num2 = Long.parseLong(string);
		System.out.println(num2);
	}
	
	/*
	 * 一列数的规则如下：1、1、2、3、5、8、13、21、34....求第n位数是多少？
在数学上，斐波纳契数列以如下被以递归的方法定义：F0=0，F1=1，Fn=F(n-1)+F(n-2)（n>=2，n∈N*）在现代物理、准晶体结构、化学等领域，斐波纳契数列都有直接的应用
答案一：递归

	}
	 */
	@Test
	public void test3(){
		
	}
	
	public static long fibonacci(int n) {
		long result = 1;
		if (n > 2) {
			result = fibonacci(n - 1) + fibonacci(n - 2);
		}
		return result;
	}
		
		public static long sss(int n){
			long result = 1;
			if(n>2){
				result = sss(n-1)+ sss(n-2);
			}
			return result;
		}
	
	
	
	
	
	
	
}
