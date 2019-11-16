package com.atguigu.lgl.domain;

public class Programmer extends Employee {

	/**
	 * - memberId : int
 status: Status
 equipment: Equipment

	 */
	
	private int memberId;
	private Status status = Status.FREE;
	private Equipment equipment;
	
	
	public Programmer() {
		super();
	}


	public Programmer(int id, String name, int age, double salary,Equipment equipment) {
		super(id, name, age, salary);
		this.equipment = equipment;
	}


	public int getMemberId() {
		return memberId;
	}


	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public Equipment getEquipment() {
		return equipment;
	}


	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}


	public String getMemberInfo() {
		return getMemberId() + "/" + getId() + "\t" 
				+ getName() + "\t" + getAge() + "\t" + getSalary() + "\t程序员";
	}
	
	@Override
	public String toString() {
		return super.getEmployeeDes()+ "程序员" + "\t" + getStatus() + "\t\t\t" + getEquipment().getDescription();
	}
	
	
	
	
}
