package com.atguigu.java3;

import java.util.Optional;

import org.junit.Test;

/*
 	Optional ：用来解决空指针异常的问题
 	
 	说明：1.Optional是一个容器
 */
public class OptionalTest {
	
	/*
	 * Optional创建对象的其它方式
	 */
	@Test
	public void test3(){
		Optional<Object> empty = Optional.empty();//创建一个内容为空的对象
		
		String str = null;
		Optional<String> opt = Optional.of(str); //不会处理内容为null的问题（直接抛异常）
		System.out.println(opt.isPresent());
	}

	/*
	 * 创建Optional的对象
	 */
	@Test
	public void test(){
		String str = "xiaoloongge";
		str = null;
		
		Optional<String> ofNullable = Optional.ofNullable(str);
		
		//获取容器中的数据get() - 注意 ：如果内容是null则抛出异常
//		System.out.println(ofNullable.get());
		
		//在获取容器中的数据是先判断该内容是否为null
		if(ofNullable.isPresent()){
			System.out.println(ofNullable.get());
		}else{
			System.out.println("内容为空");
		}
		
	}
	
	@Test
	public void test2(){
		String str = "xiaoloongge";
//		str = null;
		
		Optional<String> ofNullable = Optional.ofNullable(str);
		
		//如果为null输出qiangge,如果不为null则输出内容
		String name = ofNullable.orElse("qiangge");
		System.out.println(name);
	}
}





