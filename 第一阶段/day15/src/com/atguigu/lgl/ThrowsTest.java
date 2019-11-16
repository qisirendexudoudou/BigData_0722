package com.atguigu.lgl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.imageio.stream.FileImageInputStream;

import org.junit.Test;

public class ThrowsTest {

	@Test
	public void test1(){
		try{
			c(-2);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void c(int id) throws FileNotFoundException{
		b(id);
	}
	
	public void b(int id) throws FileNotFoundException{
		a(id);
	}
	public void a(int id) throws FileNotFoundException{
		new FileInputStream("12.txt");
	}
	
}
