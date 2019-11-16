package com.atguigu.team.test;

import org.junit.Test;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.service.NameListService;

public class NameListServiceTest {

	@Test
	public void getAllEmployees(){
		
		NameListService service = new NameListService();
		
		Employee[] allEmployees = service.getAllEmployees();
		
		for (int i = 0; i < allEmployees.length; i++) {
		
			System.out.println(allEmployees[i].getName());
		}
	}
}
