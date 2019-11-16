package com.atguigu.main.mapper;

import com.atguigu.entity.Department;
import com.atguigu.entity.Employee;

public interface EmployeeMapper {
	
	Employee getEmployeeById(Integer id);
	
	Department getDepartmentById(Integer id);

}
