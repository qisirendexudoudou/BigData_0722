package mytest;

import org.junit.Test;

public class test12 {

	@Test
	public void test(){
	//包装类 <------->String
		
		Integer integer = new Integer(16);
		String s13 = integer.toString();
		System.out.println(s13 + 122);
		
		
		String s4 = "true";
		Boolean b1 = new Boolean(s4);
		System.out.println(b1);
		
		
		
		
		
	
	//基本数据类型<----->String
		
	int a2 = 12;
	String s2 = String.valueOf(a2);
	System.out.println(s2 + 1);	
	
	String s3 ="151";
	int a3 = Integer.parseInt(s3);
		System.out.println(a3+2);
		
	//基本数据类型 <---->包装类
	
	int a =10;
	Integer aa = new Integer(a);
	System.out.println(aa + 1 );
	
	Integer bb = new Integer(12);
	int cc = bb.intValue();
	System.out.println(cc + 1);
	
	}
	
	
	
}
