package com.atguigu.java2;

import org.junit.Test;

import com.atguigu.java3.Employee;
import com.atguigu.java3.FilterEmployee;

/*
  	创建匿名实现类（匿名子类）的对象
 	必须会
 */
public class InterfaceTest4 {
	
	@Test
	public void test2(){
		/*
		 * 方式一
		 */
		//多态 ： 左边是接口的类型，右边是实现类的对象
		FilterEmployee fe = new FilterEmployee(){

			@Override
			public boolean filter(Employee e) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		
		demo(fe);
		
		/*
		 * 方式二 : 创建FilterEmployee匿名实现类的匿名对象
		 */
		demo(new FilterEmployee() {

			@Override
			public boolean filter(Employee e) {
				// TODO Auto-generated method stub
				return false;
			}
		});
	}
	
	public void demo(FilterEmployee fe){
		
	}

	@Test
	public void test(){
		/*
		 * 创建的是匿名实现类的对象
		 	格式 ： new 接口名（）{
		 			
		 			//需要重写的方法
		 		 }
		 */
		//创建的是FilterEmployee匿名实现类的对象
		FilterEmployee filterEmployee = new FilterEmployee(){

			@Override
			public boolean filter(Employee e) {
				System.out.println("--------fitler((Employee e)");
				return false;
			}
			
		};
	}
}
