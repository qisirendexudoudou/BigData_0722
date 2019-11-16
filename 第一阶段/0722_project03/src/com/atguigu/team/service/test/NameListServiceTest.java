package com.atguigu.team.service.test;

import org.junit.Test;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.utils.TeamException;

public class NameListServiceTest {
	
	@Test
	public void getEmployeeTest(){
		NameListService nameListService = new NameListService();
		try {
			Employee employee = nameListService.getEmployee(1);
			System.out.println(employee.getName());
		} catch (TeamException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void getEmployeesTest(){
		
		NameListService nameListService = new NameListService();
		
		Employee[] employees = nameListService.getEmployees();
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getName());
			
			//判断类型 - 因为Employee中没有设备
			if(employees[i] instanceof Programmer){
				Programmer p = (Programmer)employees[i];
				String desc = p.getEquipment().getDescription();
				System.out.println(desc);
			}
		}
	}
}
