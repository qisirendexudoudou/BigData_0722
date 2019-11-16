package com.atguigu.java3;

import java.util.Arrays;

import org.junit.Test;

/*
 	了解（最好理解并能够默写出来）
 */

class FilterEmployeeImpl implements FilterEmployee{

	@Override
	public boolean filter(Employee e) {
		if(e.age >= 18){
			return true;
		}else{
			return false;
		}
	}
	
}

class FilterEmployeeImpl2 implements FilterEmployee{

	@Override
	public boolean filter(Employee e) {
		if(e.score >=60){
			return true;
		}else{
			return false;
		}
	}
}

/*
 	接口的使用 ：
 */
public class InterfaceTest3 {
	/*
	 * 数据的初始化
	 */
	static Employee[] es = null;
	
	static{
		Employee e = new Employee("aa", 18, 100);
		Employee e2 = new Employee("bb", 15, 80);
		Employee e3 = new Employee("ddd", 28, 50);
		Employee e4 = new Employee("ccc", 19, 30);
		//创建一个数组
		 es = new Employee[]{e,e2,e3,e4};
	}
	
	@Test
	public void test2(){
		//需求：年纪大于18
		Employee[] filterEmp = filterEmp(es, new FilterEmployeeImpl());
		System.out.println(Arrays.toString(filterEmp));
		
		//需求：成绩合格
		Employee[] filterEmp2 = filterEmp(es, new FilterEmployeeImpl2());
		System.out.println(Arrays.toString(filterEmp2));
		
	}
	
	/**
	 * 使用了接口时的判断方法
	 */
	public Employee[] filterEmp(Employee[] es,FilterEmployee fe){
		//创建一个新数组 - 用来存放满足条件的员工
		Employee[] filterEs = new Employee[4];
		//满足条件的人数 - 用来存放元素的索引值
		int total = 0;
		
		for (int i = 0; i < es.length; i++) {
			Employee employee = es[i];
			//条件的判断
			if(fe.filter(employee)){
				filterEs[total++] = employee;
			}
		}
		return filterEs;
	}

	/*
	 * 下面的方法是没有使用接口时的判断方法
	@Test
	public void test(){
		
		
		//获取年纪大于18的员工
		Employee[] filterAge = filterAge(es);
		System.out.println(Arrays.toString(filterAge));
		
		System.out.println("-------------------------------------");
		
		//获取成绩大于60的员工
		Employee[] filterScore = filterScore(es);
		System.out.println(Arrays.toString(filterScore));
	}
	*/
	
	
	/*
	public Employee[] filterScore(Employee[] es){
		//创建一个新数组 - 用来存放满足条件的员工
		Employee[] filterEs = new Employee[4];
		//满足条件的人数 - 用来存放元素的索引值
		int total = 0;
		
		for (int i = 0; i < es.length; i++) {
			Employee employee = es[i];
			//条件的判断
			if(employee.score >= 60){
				filterEs[total++] = employee;
			}
		}
		return filterEs;
	}
	
	public Employee[] filterAge(Employee[] es){
		//创建一个新数组 - 用来存放满足条件的员工
		Employee[] filterEs = new Employee[4];
		//满足条件的人数 - 用来存放元素的索引值
		int total = 0;
		
		for (int i = 0; i < es.length; i++) {
			Employee employee = es[i];
			//条件的判断
			if(employee.age >= 18){
				filterEs[total++] = employee;
			}
		}
		return filterEs;
	}
	*/
}

