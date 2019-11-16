package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;
import com.atguigu.team.domain.Status;
import com.atguigu.team.utils.TeamException;

/*
 * 用来对团队成员进行操作 ： 展示 ，删除，填加 
 */
public class TeamService {

	/*
	 * - counter: int = 1 MAX_MEMBER: final int = 5 team: Programmer[] = new
	 * Programmer[MAX_MEMBER]; - total: int = 0;
	 * 
	 */

	// 自动生成团队成员Id
	private static int counter = 1;
	// 用来设置团队的最多人数
	private final int MAX_MEMBER = 5;
	// 创建数组用来存储团队成员
	private Programmer[] team = new Programmer[MAX_MEMBER];
	// 用来统计团队人数
	private int total = 0;

	/**
	 * 获取团队成员
	 * @return Programer[]
	 */
	public Programmer[] getTeam() {
		Programmer[] p = new Programmer[total];
		for (int i = 0; i < total; i++) {
			p[i] = team[i];
		}
		return p;
	}

	/**
	 * 添加团队成员
	 * @param e 需要添加的团队成员
	 * @throws TeamException 
	 */
	public void addMember(Employee e) throws TeamException {
		/*
		 * 步骤 ：
		 * 1.校验 
		 * 2.修改成员的状态
		 * 3.将成员添加到数组中
		 * 4.数量加1
		 * 5.memberID需要自增
		 */

//		         成员已满，无法添加
		if(total >= MAX_MEMBER){
			throw new TeamException(" 成员已满，无法添加");
		}
//			该成员不是开发人员，无法添加
		if(!(e instanceof Programmer)){
			throw new TeamException("该成员不是开发人员，无法添加");
		}
//			该员已是团队成员 
		/*
		for (int i = 0; i < total; i++) {
			Programer programer = team[i];
			if(programer.getId() == e.getId()){
				throw new TeamException("该员已是团队成员 ");
			}
		}
		*/
		//可以判断状态
		Programmer p = (Programmer) e;
		if(p.getStatus() == Status.BUSY){
			throw new TeamException("该员已是团队成员 ");
		}
//			该员正在休假，无法添加
		if(p.getStatus() == Status.VOCATION){
			throw new TeamException("该员正在休假，无法添加");
		}
//			团队中只能有一名架构师
//			团队中只能有两名设计师
//			团队中只能有三名程序员
		//统计团队成员职位的个数
		int arcCount = 0;
		int desCount = 0;
		int proCount = 0;
		for (int i = 0; i < total; i++) {
			Programmer programer = team[i];
			if(programer instanceof Architect){
				arcCount++;
			}else if(programer instanceof Designer){
				desCount++;
			}else if(programer instanceof Programmer){
				proCount++;
			}
		}
		
		//判断添加的成员是哪个工种的，再判断该工种的人数是否已经满员
		if(p instanceof Architect){
			if(arcCount >= 1){
				throw new TeamException("团队中只能有一名架构师");
			}
		}else if(p instanceof Designer){
			if(desCount >= 2){
				throw new TeamException("团队中只能有两名设计师");
			}
		}else if(p instanceof Programmer){
			if(proCount >= 3){
				throw new TeamException("团队中只能有三名程序员");
			}
		}
		 //修改成员状态
		 p.setStatus(Status.BUSY);
		 //修改成员的团队id
		 p.setMemberId(counter);
		 counter++;
		 //将成员添加到数组中
		 team[total] = p;
		 //团队人数加1
		 total++; 
	}

	/**
	 * 删除团队成员
	 * @param memberId 需要除删的成员的memberId
	 * @throws TeamException 
	 */
	public void removeMember(int memberId) throws TeamException {

		//查找成员是否存在
		int i = 0;
		for (; i < total; i++) {
			Programmer p = team[i];
			if(p.getMemberId() == memberId){ //找到了该成员
				//修改状诚
				p.setStatus(Status.FREE);
				break;
			}
		}
		
		if(i >= total){ //就说明没有找到
			throw new TeamException("没有找到该成员");
		}
		
		//找到了执行以下的人
		for (int j = i; j < total - 1; j++) {
			team[j] = team[j + 1];
		}
		
		team[total - 1] = null;
		total--;
	}

}
