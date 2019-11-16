package com.atguigu.lgl2;

import java.util.Arrays;

import org.junit.Test;

/**
 * 定义类FilterEmployeeImpl
 * 作用： 判断年龄是否大于18
 * @author luogaolong
 *
 */
class FilterEmployeeImpl implements FilterEmployee{

	@Override
	public boolean filter(Employee e) {
		if (e.age >= 18 ) {
			return true;
		}else{
			return false;
		}
	}
} 

/**
 * 定义类：FilterEmployeeImpl2
 * 作用：判断成绩是否及格
 * @author luogaolong
 *
 */
class FilterEmployeeImpl2 implements FilterEmployee{

	@Override
	public boolean filter(Employee e) {
		if (e.score >= 60) {
			return true;
		}else{
			return false;
		}
	}
}




public class EmployeeTest {
	//初始化数据
	static Employee[] es = null;
	//静态代码块-- new对象时就自动创建
	static {
		Employee e = new Employee("aa", 18, 100);
		Employee e2 = new Employee("bb", 15, 80);
		Employee e3 = new Employee("ddd", 28, 50);
		Employee e4 = new Employee("ccc", 19, 30);
		//创建一个数组
		es =new Employee[]{e,e2,e3,e4}; 
	}
	@Test
	public void test(){
		//年纪大于18
		Employee[] filterEMP = filterEmp(es, new FilterEmployeeImpl());
		System.out.println(Arrays.toString(filterEMP));
		
		Employee[] filterEMP2 = filterEmp(es, new FilterEmployeeImpl2());
		System.out.println(Arrays.toString(filterEMP2));
		
	}
	
	//判断使用了接口
	public Employee[] filterEmp(Employee[] es,FilterEmployee fe){
		//新建一个数组，用来存放满足条件的数据
		Employee[] filterEs = new Employee[4];
		int total = 0;
		for (int i = 0; i < es.length; i++) {
			Employee employee = es[i];
			//条件判断
			if (fe.filter(employee)) {
				filterEs[total++] = employee;
			}
		}
		return filterEs;
		
	}	

}	



	