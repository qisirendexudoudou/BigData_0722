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

/*
 * 用来处理公司所有的员工
 */
public class NameListService {

	// 用来保存所有公司员工对象
	private Employee[] employees;

	/*
	 * 1.初始化数组 2.将给定的数据进行封装 3.将封装好的数据存放到数组中
	 */
	public NameListService() {
		// 初始化
		employees = new Employee[Data.EMPLOYEES.length];
		// 遍历所有的数据
		for (int i = 0; i < Data.EMPLOYEES.length; i++) {
			// 获取员工的所有信息
			String[] worker = Data.EMPLOYEES[i];
			// 获取数据的类型
			String type = worker[0];
			// 获取员工的id
			int id = Integer.parseInt(worker[1]);
			// 获取员工的年纪
			int age = Integer.parseInt(worker[3]);
			// 获取员工的姓名
			String name = worker[2];
			// 获取员工的薪水
			double salary = Double.parseDouble(worker[4]);
			// 员工的将金
			double bonus;
			// 根据不同的数据类型进行对应的封装
			switch (Integer.parseInt(type)) {
			case Data.EMPLOYEE:

				/*
				 * //封装Employee对象 
				 * Employee employee = new Employee(id, name,age, salary);
				 * //将封装好的对象放进数组中 employees[i] = employee;
				 */
				employees[i] = new Employee(id, name, age, salary);
				break;
			case Data.PROGRAMMER:
				employees[i] = new Programmer(id, name, age, salary, createEquipment(i));
				break;
			case Data.DESIGNER:
				// 获取员工的将金
				bonus = Double.parseDouble(worker[5]);
				employees[i] = new Designer(id, name, age, salary, createEquipment(i), bonus);
				break;
			case Data.ARCHITECT:
				bonus = Double.parseDouble(worker[5]);
				int stock = Integer.parseInt(worker[6]);
				employees[i] = new Architect(id, name, age, salary, createEquipment(i), bonus, stock);
				break;
			}
		}
	}

	/*
	 * 创建设备的对象
	 */
	private Equipment createEquipment(int index) {
		// 获取对应的设备的全部信息
		String[] equipment = Data.EQIPMENTS[index];
		// 获取设备的类型
		String type = equipment[0];
		//根据不同的设备类型创建对应的对象
		switch (Integer.parseInt(type)) {
		case Data.PC:
			String model = equipment[1];
			String display = equipment[2];
			return new PC(model, display);
		case Data.NOTEBOOK:
			String mo = equipment[1];
			double price  = Double.parseDouble(equipment[2]);
			return new NoteBook(mo, price);
		case Data.PRINTER:
			String eType = equipment[2];
			String name = equipment[1];
			return new Printer(eType, name);
		}
		return null;
	}

	/*
	 * 获取所有的员工
	 */
	public Employee[] getAllEmployees() {
		return employees;
	}

	/*
	 * 根据id获取对应的员工
	 */
	public Employee getEmployee(int id) throws TeamException {
		for (int i = 0; i < employees.length; i++) {
			Employee employee = employees[i]; //获取每一个员工
			if(employee.getId() == id){
				return employees[i];
			}
		}
		throw new TeamException("没有找到该员工");
	}

}
