package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * 测试 插件只识别 XXXTest 或 TestXXX
 */
public class HelloTest {
	
	@Test
	public void testHello() throws Exception {
		
		com.atguigu.hello.Hello.sayHello();
		
	}

}
