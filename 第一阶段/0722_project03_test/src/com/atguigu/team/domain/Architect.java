package com.atguigu.team.domain;

public class Architect extends Designer{

	private int stock;

	public Architect() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Architect(int id, String name, int age, double salary, 
			Equipment equipment, double bonus,int stock) {
		super(id, name, age, salary, equipment, bonus);
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	/**
	 * 8	韦小宝	30	19800.0	架构师	FREE	15000.0	2500	爱普生20K(针式)
	 */
	@Override
	public String toString() {
		return getEmployeeDes() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" 
				+ getStock() + "\t"+ getEquipment().getDescription();
	}
	
	/*
	 * 1/2	令狐冲	32	18000.0	架构师	15000.0	2000
	 */
	@Override
	 public String showTeamInfo(){
		 return getMemberId() +"/" + getId() + "\t" 
				 + getName() + "\t" + getAge() + "\t" + getSalary()
				 + "\t架构师\t" + getBonus() + "\t" + getStock();
	 }
}
