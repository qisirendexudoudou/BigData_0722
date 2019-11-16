package com.atguigu.team.domain;

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
	
	
	/**
	 * 输出团队成员的信息
	 * 	4/7	张无忌	29	10800.0	设计师	5200.0
	 */
	@Override
	public String getMemberInfo(){
		return getMemberId() + "/" + getId() + "\t" 
					+ getName() + "\t" + getAge() + "\t" 
					+ getSalary() + "\t设计师\t" + getBonus();
	}
	
	/**
	 * 输出对象的信息
	 */
	//5	周芷若	28	10000.0	设计师	FREE	5000.0		激光(佳能 2900)
	@Override
	public String toString() {
		
		return super.getEmployeeDes() + "设计师" + "\t" + 
				getStatus() + "\t" + getBonus() +"\t\t" + getEquipment().getDescription();
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	
}
