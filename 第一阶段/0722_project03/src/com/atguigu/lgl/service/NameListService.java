package com.atguigu.lgl.service;

import com.atguigu.lgl.domain.Architect;
import com.atguigu.lgl.domain.Data;
import com.atguigu.lgl.domain.Designer;
import com.atguigu.lgl.domain.Employee;
import com.atguigu.lgl.domain.Equipment;
import com.atguigu.lgl.domain.NoteBook;
import com.atguigu.lgl.domain.PC;
import com.atguigu.lgl.domain.Printer;
import com.atguigu.lgl.domain.Programmer;
import com.atguigu.lgl.utils.TeamException;

/**
	对象数组： 里面的元素保存的是对象（引用数据类型）
 */

public class NameListService {//保存公司所有员工
	
	private Employee[] employees;//保存数据
	public NameListService(){//构造器
		employees = new Employee[Data.EMPLOYEES.length];//初始化数组
		for (int i = 0; i < employees.length; i++) {//遍历二维数组
			String[] employee = Data.EMPLOYEES[i];//获取每一个员工
			//获取员工的数据
			int id = Integer.parseInt(employee[1]);
			String name = employee[2];
			int age = Integer.parseInt(employee[3]);
			double salary = Double.parseDouble(employee[4]);
			String type = employee[0];//获取员工类型
			switch (Integer.parseInt(type)) {//判断员工类型
			case Data.EMPLOYEE:
				Employee emp = new Employee(id, name, age, salary);//封装对象
				employees[i] = emp;//添加到数组中
				break;
			case Data.PROGRAMMER:
				Programmer programmer = new Programmer(id, name, age, salary, createEquipment(i));
				employees[i] = programmer;
				break;
			case Data.DESIGNER:
				Designer designer = new Designer(id, name, age, salary, createEquipment(i), Double.parseDouble(employee[5]));
				employees[i] = designer;
				break;
			case Data.ARCHITECT:
				Architect architect = new Architect(id, name, age, salary, createEquipment(i), Double.parseDouble(employee[5]), Integer.parseInt(employee[6]));
				employees[i] = architect;
				break;
			}	
		}
	}
	
	//创建设备的对象并返回
	public Equipment createEquipment(int i){
		String[] equipment = Data.EQIPMENTS[i];//根据索引值获取设备的对象
		String type = equipment[0];//获取设备的类型
		switch (Integer.parseInt(type)) {//根据设备的类型封装对象
		case Data.PC:
			return  new PC(equipment[1], equipment[2]);
		case Data.NOTEBOOK:
			return new NoteBook(equipment[1], Double.parseDouble(equipment[2]));
		case Data.PRINTER:
			return new Printer(equipment[1], equipment[2]);
		}
		return null;
	}
	
	//获取所有的员工
	public Employee[] getEmployees(){
		return employees;
	}
	
	//根据指定的id获取员工
	public Employee getEmployee(int id) throws TeamException{
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getId() == id) {//根据指定的id 获取员工
				return employees[i];
			}
		}
		//如果在整个for循环中都没有结束方法说明没有找到该员工
		throw new TeamException("没有找到该员工");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
