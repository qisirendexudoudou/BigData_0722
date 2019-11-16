package com.atguigu.main.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.entity.Employee;
import com.atguigu.main.service.EmployeeService;

@Controller
public class HelloHandler {
	
	@Autowired
	private EmployeeService es;
	
	@ResponseBody
	@RequestMapping(value="/hello")
	public Employee handle1(Integer id) {
		
		System.out.println("查询了"+id+"号员工！");
		
		return es.getEmployeeById(id);
	}

}
