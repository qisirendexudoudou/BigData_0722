package com.atguigu.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.entity.Employee;
import com.atguigu.main.mapper.EmployeeMapper;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeMapper em;
	
	public Employee getEmployeeById(Integer id) {
		
		return em.getEmployeeById(id);
		
	};

}
