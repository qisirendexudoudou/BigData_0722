package com.atguigu.team.view;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamService;
import com.atguigu.team.utils.TSUtility;
import com.atguigu.team.utils.TeamException;

public class TeamView {

	private NameListService listService = new NameListService();
	private TeamService teamService = new TeamService();

	/**
	 * 进入主菜单
	 */
	public void enterMainMenu() {
		boolean isFlag = true;
		do {
			System.out.println("-------------------------------开发团队调度软件--------------------------------");
			System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
			// 显示所有的员工
			listAllEmployees();
			System.out.println("--------------------------------------------------------------------------");
			System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
			// 读取菜单项
			char menuSelection = TSUtility.readMenuSelection();
			// 判断
			switch (menuSelection) {
			case '1'://1-团队列表
				listMember();
				break;

			case '2'://2-添加团队成员
				addMember();
				break;
			case '3'://3-删除团队成员
				deleteMember();
				break;
			case '4'://4-退出
				System.out.print("确认是否退出:(Y/N):");
				//读取是否退出
				char selection = TSUtility.readConfirmSelection();
				if (selection == 'Y') {
					isFlag = false;
					System.out.println("退出成功");
				}
				break;
			}
		} while (isFlag);
	}
	
	/**
	 * 显示所有的团队成员
	 */
	private void listMember(){
		/*
		 * --------------------团队成员列表---------------------
			TID/ID	姓名	年龄	工资	职位	奖金	股票
			2/2	令狐冲	32	18000.0	架构师	15000.0	2000
			3/3	任我行	23	7000.0	程序员
			4/7	张无忌	29	10800.0	设计师	5200.0
			-------------------------------------------------
		 */
		System.out.println("--------------------团队成员列表---------------------");
		System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
		//获取所有的团队成员
		Programmer[] team = teamService.getTeam();
		//遍历数组
		for (int i = 0; i < team.length; i++) {
			Programmer p = team[i];
			//多态 ：对象是谁调用的就是谁的getMemberInfo()
			System.out.println(p.getMemberInfo());
		}
		System.out.println("-------------------------------------------------");
		//按回键继续
		TSUtility.readReturn();
	}

	/**
	 * 显示所有的员工
	 */
	private void listAllEmployees() {
		// 获取所有的员工
		Employee[] employees = listService.getEmployees();
		// 遍历数组
		for (int i = 0; i < employees.length; i++) {
			Employee employee = employees[i];
			System.out.println(employee.toString());// 多态 : 对象是谁就调用谁的toString方法
		}
	}

	/**
	 * 添加成员
	 */
	private void addMember() {
		/*
		 * 请输入要添加的员工ID：20
			没有找到该员工
			按回车键继续...
		 */
		System.out.print("请输入要添加的员工ID：");
		//读取员工id
		int id = TSUtility.readInt();
		
		try {
			//根据id获取对应的成员
			Employee employee = listService.getEmployee(id);
			//添加成员
			teamService.addMember(employee);
			//如果上面的代码没有抛异常那说明添加成功
			System.out.println("添加成功");
		} catch (TeamException e) {
			System.out.println(e.getMessage());
		}
		//按回键继续
		TSUtility.readReturn();
		
		/*
		 * 下面的写法是不对的：如果找不到员工那么就不能再执行添加的操作
		try {
			employee = listService.getEmployee(id);
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//添加成员
		try {
			teamService.addMember(employee);
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
	}

	/**
	 * 删除成员
	 */
	private void deleteMember() {

		/*
		 *  请输入要删除员工的TID：1
			确认是否删除(Y/N):Y
			没有找到该成员
			按回车键继续...
			
			请输入要删除员工的TID：2
			确认是否删除(Y/N):y
			删除成功
			按回车键继续...
		 */
		System.out.print("请输入要删除员工的TID：");
		//读取TID
		int tid = TSUtility.readInt();
		//确认是否删除
		System.out.print("确认是否删除(Y/N):");
		char selection = TSUtility.readConfirmSelection();
		//判断是否删除
		if (selection == 'Y') {
			//确认删除
			try {
				teamService.removeMember(tid);
				//如果上面的代码没有发生异常那么就表示删除成功
				System.out.println("删除成功");
			} catch (TeamException e) {
				System.out.println(e.getMessage());
			}
			//按回车键继续
			TSUtility.readReturn();
		}
	}

	public static void main(String[] args) {
		new TeamView().enterMainMenu();
	}
}
