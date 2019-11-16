package com.atguigu.java4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

/**
 * 处理异常方式二 ： throws
 * 
 * 格式 ： 权限修饰符 返回值类型 方法 (形参列表) throws 异常类型1，异常类型2......{
 * 
 * }
 * 
 * 说明 ： throws并没有真正的处理异常，而是将异常抛给了方法的调用者。由调用者来处理。
 * 
 * throws和try-catch-finally的区别？ throws并没有真正的处理异常，而是将异常抛给了方法的调用者。由调用者来处理。
 * try-catch-finally真正的将异常处理掉
 * 
 * 思考：什么时候不能使用throws? 父类中被重写的方法没有throws,那么子类重写的方法也不能throws
 * 注意：子类重写的方法抛出的异常不大于父类被重写方法抛出的异常
 * 
 * 思考 ： 什么时候必须使用throws? 当我们调用多个方法进行数据传递时，如果因为数据的问题发生异常，那么该方法只能将异常向上抛，
 * 		  抛给方法的调用者。由调用者重新填写数据。
 * 
 * 
 */
public class ThrowsTest {

	@Test
	public void test2() {
		try {
			v(110);
		} catch (FileNotFoundException e) {
			System.out.println("身份证号错误");
		}
	}

	public void v(int id) throws FileNotFoundException {
		c(id);
	}
	
	public void c(int id) throws FileNotFoundException {
		m(id);
	}
	
	public void m(int id) throws FileNotFoundException {
		//验票的过程 - 模拟错误信息
		
		new FileInputStream("123.txt");
		
	}

	



	@Test
	public void test() {
		try {
			demo2();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void demo2() throws FileNotFoundException {
		demo();
	}

	public void demo() throws FileNotFoundException {
		new FileInputStream("123.txt");
	}
}
