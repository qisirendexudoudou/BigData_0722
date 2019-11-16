package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

/**
 * 异常的演示
 * @author Administrator
 *
 */
public class ExceptionTest {

	@Test
	public void test(){
		
		ArrayList dest = new ArrayList();
		ArrayList src = new ArrayList();
		src.add(111);
		Collections.copy(dest, src);
		
		setAge(-5);
	}
	
	public void setAge(int a){
		if(a < 0){
			throw new NullPointerException("不能小于0");
		}
	}
}

