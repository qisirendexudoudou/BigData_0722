package com.atguigu.team.domain;

public class Architect extends Designer {

	private int stock; //股票

	public Architect() {
		super();
	}

	public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus,int stock) {
		super(id, name, age, salary, equipment, bonus);
		this.stock = stock;
	}
	
	/**
	 * 输出团队成员的信息
	 * 	2/2	令狐冲	32	18000.0	架构师	15000.0	2000
	 */
	@Override
	public String getMemberInfo(){
		return getMemberId() + "/" + getId() + "\t" 
					+ getName() + "\t" + getAge() + "\t" 
					+ getSalary() + "\t架构师\t" + getBonus() + "\t" + getStock();
	}
	
	/**
	 * 输出对象的信息
	 */
	//2	令狐冲	32	18000.0	架构师	FREE	15000.0	2000	联想T4(6000.0)
	@Override
	public String toString() {
		
		return super.getEmployeeDes() + "架构师" + "\t" + 
					getStatus() + "\t" + getBonus() + "\t" + 
					getStock() + "\t" + getEquipment().getDescription();
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	
}
