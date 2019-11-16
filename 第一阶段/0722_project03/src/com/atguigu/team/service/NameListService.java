package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Data;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Equipment;
import com.atguigu.team.domain.NoteBook;
import com.atguigu.team.domain.PC;
import com.atguigu.team.domain.Printer;
import com.atguigu.team.domain.Programmer;
import com.atguigu.team.utils.TeamException;

/**
 * 
 * 作用 ： 用来保存所有公司的员工
 *
 */
public class NameListService {
	// 保存数据
	private Employee[] employees;

	public NameListService() {
		// 1.初始化数组
		employees = new Employee[Data.EMPLOYEES.length];
		// 2.封装对象
		// 2.1遍历二维数组
		for (int i = 0; i < employees.length; i++) {
			// 2.2获取每一个员工
			String[] employee = Data.EMPLOYEES[i];
			// 2.3获取员工的类型
			String type = employee[0];

			// 2.5获取员工的数据
			int id = Integer.parseInt(employee[1]);
			String name = employee[2];
			int age = Integer.parseInt(employee[3]);
			double salary = Double.parseDouble(employee[4]);

			// 2.4判断员工的类型
			switch (Integer.parseInt(type)) {
			case Data.EMPLOYEE: // 和 case 10是一样的
				// 2.6封装对象
				Employee emp = new Employee(id, name, age, salary);
				// 2.7 将对象放入到数组中
				employees[i] = emp;
				break;
			case Data.PROGRAMMER:
				// 2.6封装对象
				Programmer programmer = new Programmer(id, name, age, salary, createEquipment(i));
				// 2.7 将对象放入到数组中
				employees[i] = programmer;
				break;
			case Data.DESIGNER:
				// 2.6封装对象
				Designer designer = new Designer(id, name, age, salary, createEquipment(i),
						Double.parseDouble(employee[5]));
				// 2.7将对象放入到数组中
				employees[i] = designer;
				break;
			case Data.ARCHITECT:
				// 2.6封装对象
				Architect architect = new Architect(id, name, age, salary, createEquipment(i),
						Double.parseDouble(employee[5]), Integer.parseInt(employee[6]));
				// 2.7将对象放入到数组中
				employees[i] = architect;
				break;
			}
		}
	}

	/**
	 * 创建设备的对象并返回
	 * 
	 * @param i
	 * @return
	 */
	private Equipment createEquipment(int i) {
		// 1.根据索引值获取设备的对象
		// 1.1获取对易用
		String[] equipment = Data.EQIPMENTS[i];
		// 1.2获取设备的类型
		String type = equipment[0];
		// 1.3根据设备的类型封装对象
		switch (Integer.parseInt(type)) {
		case Data.PC:
			return new PC(equipment[1],equipment[2]);
		case Data.NOTEBOOK:
			return new NoteBook(equipment[1], Double.parseDouble(equipment[2]));
		case Data.PRINTER:
			return new Printer(equipment[1],equipment[2]);
		}
		return null;
	}
	
	/**
	 * 根据指定的id获取员工
	 * @throws TeamException 
	 */
	public Employee getEmployee(int id) throws TeamException{
		for (int i = 0; i < employees.length; i++) {
			if(employees[i].getId() == id){
				return employees[i];
			}
		}
		//如果在整个for循环的过程中都没有结束方法说明没有找到该员工
		throw new TeamException("没有找到该员工");
	}

	/**
	 * 获取所有的员工
	 * 
	 * @return
	 */
	public Employee[] getEmployees() {
		return employees;
	}
}
