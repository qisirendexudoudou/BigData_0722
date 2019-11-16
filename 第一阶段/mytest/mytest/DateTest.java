package mytest;

import java.sql.Date;

//import java.util.Date;

import org.junit.Test;

public class DateTest {

/*	@Test
	public void test1(){
		System.out.println(new Date());//Wed Aug 21 19:53:09 IRKT 2019
		System.out.println(new Date(1566388389862L));//Wed Aug 21 19:53:09 IRKT 2019
		System.out.println(new Date().toString());//Wed Aug 21 19:55:13 IRKT 2019
		System.out.println(new Date().getTime());//1566388389862		
	}*/
	
	@Test
	public void test2(){
		Date date = new Date(1566388389862L);
		System.out.println(date.toString());
		System.out.println(date.getTime());
		
		
		System.out.println(new Date(new java.util.Date().getTime()));
	}
}
