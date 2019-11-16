package com.atguigu.team.view;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamService;
import com.atguigu.team.utils.TSUtility;
import com.atguigu.team.utils.TeamException;

public class TeamView {

	private NameListService nameListService;
	private TeamService teamService;

	public TeamView() {
		nameListService = new NameListService();
		teamService = new TeamService();
	}

	/**
	 * 程序的入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new TeamView().enterMainMenu();
	}

	/**
	 * 进入主菜单
	 */
	public void enterMainMenu() {
		boolean isFlag = true;
		do {
			System.out.println("-------------------------------开发团队调度软件--------------------------------");
			// 获取所有的员工
			Employee[] allEmployees = nameListService.getAllEmployees();
			System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
			// 遍历所有的员工
			for (int i = 0; i < allEmployees.length; i++) {
				Employee employee = allEmployees[i];
				// 多态 ： 调用子类中的toString方法
				System.out.println(employee.toString());
			}
			System.out.println("--------------------------------------------------------------------------");
			System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
			// 从键盘读取菜单项
			char menuSelection = TSUtility.readMenuSelection();
			// 判断调用的是哪个菜单项
			switch (menuSelection) {
			case '1':
				listAllTeamEmployees();
				break;
			case '2': // 添加团队成员
				addMember();
				break;
			case '3':// 删除团队成员
				deleteMember();
				break;
			case '4': // 退出
				System.out.print("确认是否退出:(Y/N):");
				char confirmSelection = TSUtility.readConfirmSelection();
				if (confirmSelection == 'Y') {
					isFlag = false;
					System.out.println("退出成功");
				}
				break;
			}
		} while (isFlag);
	}

	/**
	 * 获取所有的团队成员
	 */
	private void listAllTeamEmployees() {

		/*
		 * --------------------团队成员列表--------------------- TID/ID 姓名 年龄 工资 职位 奖金
		 * 股票 1/2 令狐冲 32 18000.0 架构师 15000.0 2000
		 * -------------------------------------------------
		 */
		System.out.println("--------------------团队成员列表---------------------");
		System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
		// 获取团队中所有的成员
		Programmer[] team = teamService.getTeam();
		if (team.length == 0) {
			System.out.println("暂时团队中还没有成员");
		} else {
			for (int i = 0; i < team.length; i++) {
				Programmer p = team[i];
				// 多态 ： 实际对象是谁就调用谁的该方法
				System.out.println(p.showTeamInfo());
			}
		}
		System.out.println("-------------------------------------------------");
		// 按回车键继续
		TSUtility.readReturn();
		
	}

	/**
	 * 添加团队成员
	 */
	private void addMember() {
		/*
		 * 请输入要添加的员工ID：2 添加成功 / 没有找到该员工 按回车键继续...
		 */
		System.out.print("请输入要添加的员工ID：");
		// 读取要添加的员工的ID
		int id = TSUtility.readInt();
		// 调用NameListService中的getEmployee方法
		Employee employee = null;
		try {
			// 获取id对应的员工，如果没有找到将抛出异常
			employee = nameListService.getEmployee(id);
			// 将获取到的员工添加到团队列表中
			// (注意和上一行代码不要用两个try-catch去写。因为没有找到该成员就没有必要再添加了)
			teamService.addMember(employee);
			// 如果添加成功则输出“添加成功”
			System.out.println("添加成功");
		} catch (TeamException e) {
			System.out.println(e.getMessage());
		}

		// 按回车键继续
		TSUtility.readReturn();
	}

	/**
	 * 删除团队成员
	 */
	private void deleteMember() {

		/*
		 * 请输入要删除员工的TID：1 确认是否删除(Y/N):y 删除成功 按回车键继续...
		 */
		System.out.print("请输入要删除员工的TID：");
		// 读取团队成员的tid
		int tid = TSUtility.readInt();
		System.out.print("确认是否删除(Y/N):");
		char confirmSelection = TSUtility.readConfirmSelection();
		if (confirmSelection == 'Y') {
			try {
				// 从TeamService中删除该成员
				teamService.removeMember(tid);
				// 删除成功
				System.out.println("删除成功");
			} catch (TeamException e) {
				System.out.println(e.getMessage());
			}
		}
		// 按回车键继续
		TSUtility.readReturn();

	}

}
