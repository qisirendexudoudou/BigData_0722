package com.atguigu.lgl.view;


import com.atguigu.lgl.domain.Employee;
import com.atguigu.lgl.domain.Programmer;
import com.atguigu.lgl.service.NameListService;
import com.atguigu.lgl.service.TeamService;
import com.atguigu.lgl.utils.TSUtility;
import com.atguigu.lgl.utils.TeamException;

public class TeamView {
	
	private NameListService listService = new NameListService();
	private TeamService teamService = new TeamService();

/**
 * + enterMainMenu(): void 
- listAllEmployees(): void 
- addMember(): void 
- deleteMember(): void 
+ main(args: String[]) : void 

 */
	//主菜单
	public void enterMainMenu(){
		
		boolean isflag = true;
		
		do {
		System.out.println("-------------------------------开发团队调度软件--------------------------------");
		System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
		listAllEmployees();
		System.out.println("--------------------------------------------------------------------------");
		System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
		
		char selection = TSUtility.readMenuSelection();
		switch (selection) {
		case '1':
			listMember();
			break;
		case '2':
			addMember();
			break;
		case '3':
			deleteMember();
			break;
		case '4':
			System.out.print("确认是否退出:(Y/N):");
			char readConfirmSelection = TSUtility.readConfirmSelection();
			if (readConfirmSelection == 'Y') {
				isflag = false;
				System.out.println("退出成功");
			}
			break;
			}
		} while (isflag);
	}
	
	//团队成员列表
	private void listMember() {
	System.out.println("--------------------团队成员列表---------------------");
	System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
	//获取所有的团队成员
	Programmer[] team = teamService.getTeam();
	if (team.length == 0 ) {
		System.out.println("暂时没有团队成员");
	}else{
		for (int i = 0; i < team.length; i++) {
			Programmer p = team[i];
			System.out.println(p.getMemberInfo());
		}
	}
	System.out.println("-------------------------------------------------");
	TSUtility.readReturn();
	
}

	//所有员工列表
	private void listAllEmployees(){
		Employee[] employees = listService.getEmployees();
		for (int i = 0; i < employees.length; i++) {
			Employee employee = employees[i];
			System.out.println(employee.toString());
		}
		
	}
	
	//添加团队成员
	private void addMember(){
		System.out.print("请输入要添加的员工ID：");
		int id = TSUtility.readInt();
		try {
			Employee employee = listService.getEmployee(id);//根据指定ID获取对应的员工
			teamService.addMember(employee);//如果没有抛异常的话  就说明添加成功
			System.out.println("添加成功");
		} catch (TeamException e) {
			System.out.println(e.getMessage());
		}
		TSUtility.readReturn();	
	}
	
	//删除团队成员
	private void deleteMember(){
		System.out.print("请输入要删除员工的TID：");
		int tid = TSUtility.readInt();
		System.out.println("确认是否删除(Y/N):");
		char selection = TSUtility.readConfirmSelection();
		if (selection == 'Y') {
			try {
				teamService.removeMember(tid);
				System.out.println("删除成功");//如果上面的代码没有抛异常，说明删除成功
			} catch (TeamException e) {
				System.out.println(e.getMessage());
			}
			TSUtility.readReturn();
		}
		
	}
	
	//主方法
	public static void main(String[] args) {
		new TeamView().enterMainMenu();
	}
}
