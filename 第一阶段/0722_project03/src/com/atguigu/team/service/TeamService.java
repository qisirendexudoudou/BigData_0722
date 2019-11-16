package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;
import com.atguigu.team.domain.Status;
import com.atguigu.team.utils.TeamException;

/**
 * 用来保存团队成员
 *
 */
public class TeamService {

	/*
	 * - counter: int = 1
MAX_MEMBER: final int = 5
 team: Programmer[] = new Programmer[MAX_MEMBER];
- total: int = 0;

	 */
	
	private final int MAX_MEMBER = 5;
	private Programmer[] team = new Programmer[MAX_MEMBER];
	private static int counter = 1; //counter是用来给TID赋值的
	private int total = 0; //用来记录当前团队的人数
	
	
	/**
	 * 根据TID删除团队成员
	 * @param memberId
	 * @throws TeamException 
	 */
	public void removeMember(int memberId) throws TeamException{
		
		//思考 ： 整个循环结束如何判断找到还是没找到?
		int i = 0;
		//作用 ：是用来帮我们查找该员工是否存在。
		for (; i < total; i++) {
			if(team[i].getMemberId() == memberId){
				//修改当前员工的状态
				team[i].setStatus(Status.FREE);
				break;
			}
		}
		
		if(i >= total){//没找到啊
			throw new TeamException("删除失败");
		}else{//找到了 - 删除该成员
			for (int j = i; j < total - 1; j++) {
				//后一个成员覆盖前一个成员
				team[j] = team[j + 1];
			}
			team[total - 1] = null;//最后一个人设置成null
			total--;//总人数
		}
		
	}
	/**
	 * 添加团队成员
	 * @param e
	 * @throws TeamException 
	 */
	public void addMember(Employee e) throws TeamException{
//		成员已满，无法添加
		if(total >= team.length){
			throw new TeamException("成员已满，无法添加");
		}
//		该成员不是开发人员，无法添加
		if(!(e instanceof Programmer)){
			throw new TeamException("该成员不是开发人员，无法添加");
		}
//		该员已是团队成员 
		for (int i = 0; i < total; i++) {
			if(team[i].getId() == e.getId()){
				throw new TeamException("该员已是团队成员");
			}
		}
//		该员正在休假，无法添加
		Programmer p = (Programmer) e;
		if(p.getStatus() == Status.VOCATION){
			throw new TeamException("该员正在休假，无法添加");
		}
//		团队中只能有一名架构师
//		团队中只能有两名设计师
//		团队中只能有三名程序员
		//1.1先统计该团队中不同共种的员工的人数
		int arcCount = 0; //架构师的人数
		int desCount = 0; //设计师的人数
		int proCount = 0; //程序员的人数
		for (int i = 0; i < total; i++) {
			Programmer pro = team[i];
			//类型判断
			if(pro instanceof Architect){
				arcCount++;
			}else if(pro instanceof Designer){
				desCount++;
			}else if(pro instanceof Programmer){
				proCount++;
			}
		}
		//1.2判断添加的员工的类型
		if(e instanceof Architect){//团队中只能有一名架构师
			//判断团队中的人数
			if(arcCount >= 1){
				throw new TeamException("团队中只能有一名架构师");
			}
		}else if(e instanceof Designer){//团队中只能有两名设计师
			if(desCount >= 2){
				throw new TeamException("团队中只能有两名设计师");
			}
		}else if(e instanceof Programmer){//团队中只能有三名程序员
			if(proCount >= 3){
				throw new TeamException("团队中只能有三名程序员");
			}
		}
		
		//2.添加成员
		//设置TID
		p.setMemberId(counter++);
		//修改状态
		p.setStatus(Status.BUSY);
		team[total++] = p;

	}
	
	/**
	 * 获取所有的团队成员
	 * @return
	 */
	public Programmer[] getTeam(){
		//创建数组
		Programmer[] ps = new Programmer[total];
		//复制团队成员
		for (int i = 0; i < ps.length; i++) {
			ps[i] = team[i];
		}
		return ps;
	}
	
}
