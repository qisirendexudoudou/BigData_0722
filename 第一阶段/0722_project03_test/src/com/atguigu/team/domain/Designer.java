package com.atguigu.team.domain;

public class Designer extends Programmer {

	private double bonus;

	public Designer() {
		super();
	}

	public Designer(int id, String name, int age, double salary, Equipment equipment,double bonus) {
		super(id, name, age, salary, equipment);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	/*
	 * 7	张无忌	29	10800.0	设计师	FREE	5200.0		华硕(三星 17寸)(non-Javadoc)
	 */
	@Override
	public String toString() {
		return getEmployeeDes() + "\t设计师\t" + getStatus() + "\t" + getBonus() + "\t\t" 
				+ getEquipment().getDescription();
	}
	
	/*
	 * 3/12	黄蓉	27	9600.0	设计师	4800.0
	 */
	@Override
	 public String showTeamInfo(){
		 return getMemberId() +"/" + getId() + "\t" 
				 + getName() + "\t" + getAge() + "\t" + getSalary()
				 + "\t设计师\t" + getBonus();
	 }
	
}
