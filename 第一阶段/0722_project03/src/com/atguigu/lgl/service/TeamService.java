package com.atguigu.lgl.service;

import java.lang.annotation.Target;

import com.atguigu.lgl.domain.Architect;
import com.atguigu.lgl.domain.Designer;
import com.atguigu.lgl.domain.Employee;
import com.atguigu.lgl.domain.Programmer;
import com.atguigu.lgl.domain.Status;
import com.atguigu.lgl.utils.TeamException;

public class TeamService {//保存团队成员信息
	
	private final int MAX_MEMBER = 5;
	private Programmer[] team = new Programmer[MAX_MEMBER];
	private static int counter = 1; //counter是用来给TID赋值的
	private int total = 0; //用来记录当前团队的人数
	
	/**
	 * removeMember(memberId: int)方法：从团队中删除成员
			参数：待删除成员的memberId
			异常：删除失败， TeamException中包含了失败原因
	 * @throws TeamException 
	 */
	
	public void removeMember(int memberId) throws TeamException{
		//判断要删除的员工是否存在
		//整个循环结束后，如果i=total,说明该员工不存在；如果不等于total，说明存在
		int i = 0;
		for (; i < total; i++) {
			if (team[i].getMemberId() == memberId) {//说明存在
				team[i].setStatus(Status.FREE);
				break;
			}
		}
		
		if (i >= total) {//说明没找到
			throw new TeamException("未找到该员工，删除失败");
		}else{//说明找到了
			for (int j = i; j < total - 1; j++) {
				team[j] = team[j+1];
			}
			team[total - 1] = null;
			total--;
		}
		
	}
	
	
	
	/**
	 * addMember(e: Employee)方法：向团队中添加成员
			参数：待添加成员的对象
			异常：添加失败， TeamException中包含了失败原因
	 * @param e
	 * @throws TeamException 
	 */
	public void addMember(Employee e) throws TeamException{
		//判断是否满了
		if (total > team.length) {
			throw new TeamException("成员已满，无法添加");
		}
		//判断是不是开发
		if (!(e instanceof Programmer)) {
			throw new TeamException("该成员不是开发，无法添加");
		}
		//该成员已经是团队成员
		for (int i = 0; i < total; i++) {
			if (team[i].getId() == e.getId()) {
				throw new TeamException("该成员已经是团队成员，无法再次添加");
			}
		}
		//该成员正在休假
		//向下转型
		Programmer p = (Programmer) e;
		if (p.getStatus() == Status.VOCATION) {
			throw new TeamException("该员工正在休假，无法添加");
		}
		
		/**
		 * 一名架构师 两名设计师 三名程序员
		 */
		int arcCount = 0;//架构师
		int desCount = 0;//设计师
		int proCount = 0;//程序员
		
		//判断每个员工的类型并分组
		for (int i = 0; i < total; i++) {
			Programmer pro = team[i];
			if (pro instanceof Architect) {
				arcCount++;
			}else if(pro instanceof Designer){
				desCount++;
			}else if(pro instanceof Programmer){
				proCount++;
			}
		}
		
		//判断添加的员工的类型
		if (e instanceof Architect) {
			if (arcCount >= 1) {
				throw new TeamException("团队中只能有一名架构师");
			}
		} else if(e instanceof Designer){
			if (desCount >= 2) {
				throw new TeamException("团队中只能有两名设计师");
			}
		}else if(e instanceof Programmer){
			if (proCount >= 3) {
				throw new TeamException("团队中只能有三名程序员");
			}
		}
		
		//添加成员
		p.setMemberId(counter++);
		p.setStatus(Status.BUSY);
		team[total++] = p;
//		total++;
	}

	//返回当前团队的所有成员
	public Programmer[] getTeam(){
		Programmer[] ps = new Programmer[total];
		for (int i = 0; i < ps.length; i++) {
			ps[i] = team[i];
		}
		return ps;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
