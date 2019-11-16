package com.atguigu.lgl.domain;

public class Designer extends Programmer {

	//bonus : double

	private double bonus;

	public Designer() {
		super();
	}

	public Designer(int id, String name, int age, double salary, 
			Equipment equipment,double bonus) {
		super(id, name, age, salary, equipment);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String getMemberInfo(){
		return getMemberId() + "/" + getId() + "\t" 
					+ getName() + "\t" + getAge() + "\t" 
					+ getSalary() + "\t设计师\t" + getBonus();
	}
	
	@Override
	public String toString() {
		
		return super.getEmployeeDes() + "设计师" + "\t" + 
				getStatus() + "\t" + getBonus() +"\t\t" + getEquipment().getDescription();
	}
	
	
}
