package com.atguigu.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.atguigu.entity.Employee;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/*
 *   将json字符串和Java对象相互转换框架
 *   1. Gson ：  google推出
 *   2. Jackson :  spring框架集成了Jackson,对Jackson支持好
 *   3. FastJson :    alibaba推出
 */
public class TestJson {

	@Test
	public void testJavaObjToJsonStr() {
		
		Employee employee = new Employee(1, "jack", "male", "xxxx");
		
		Gson gson = new Gson();
		
		// 单个对象
		String employeeStr = gson.toJson(employee);
		
		System.out.println(employeeStr);
		
		Employee e = gson.fromJson(employeeStr, Employee.class);
		
		System.out.println(e);
		
		
	}
	
	@Test
	public void testJavaObjToJsonStr1() {
		
		List<Employee> emps= new ArrayList<>();
		
		Employee employee1 = new Employee(1, "jack", "male", "xxxx");
		Employee employee2 = new Employee(2, "tom", "male", "xxxx");
		
		emps.add(employee1);
		emps.add(employee2);
		
		Gson gson = new Gson();
		
		String employeeStr = gson.toJson(emps);
		
		System.out.println(employeeStr);
		
		List<Employee> employees = gson.fromJson(employeeStr, new TypeToken<List<Employee>>() {}.getType());
		
		System.out.println(employees);
		
		
	}
	
	@Test
	public void testJavaObjToJsonStr2() {
		
		Map<String, Employee> emps=new HashMap();
		
		Employee employee1 = new Employee(1, "jack", "male", "xxxx");
		Employee employee2 = new Employee(2, "tom", "male", "xxxx");
		
		emps.put("jack", employee1);
		emps.put("tom", employee2);
		Gson gson = new Gson();
		
		String employeeStr = gson.toJson(emps);
		
		System.out.println(employeeStr);
		
		Map<String, Employee> employees = gson.fromJson(employeeStr, new TypeToken<Map<String, Employee>>() {}.getType());
		
		System.out.println(employees);
		
		
	}
	
	
}
