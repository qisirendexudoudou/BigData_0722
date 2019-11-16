package com.atguigu.lgl.domain;

public class Architect  extends Designer{

	private int stock; //股票

	public Architect() {
		super();
	}

	public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus,int stock) {
		super(id, name, age, salary, equipment, bonus);
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	//团队成员信息
	@Override
	public String getMemberInfo(){
		return getMemberId() + "/" + getId() + "\t" 
					+ getName() + "\t" + getAge() + "\t" 
					+ getSalary() + "\t架构师\t" + getBonus() + "\t" + getStock();
	}
	
	//对象信息
	@Override
	public String toString() {
		
		return super.getEmployeeDes() + "架构师" + "\t" + 
					getStatus() + "\t" + getBonus() + "\t" + 
					getStock() + "\t" + getEquipment().getDescription();
	}

}
