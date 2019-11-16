package com.atguigu.team.domain;

public class Programmer extends Employee {

	/*
	 * - memberId : int
 status: Status
 equipment: Equipment

	 */
	private int memberId; //TID
	private Status status = Status.FREE;//员工的状态
	private Equipment equipment; //设备 - 因为设备的种类很多，所以直接写设备的父类（接口）
	
	public Programmer() {
		super();
	}
	
	public Programmer(int id, String name, int age, double salary,Equipment equipment) {
		super(id, name, age, salary);
		this.equipment = equipment;
	}
	
	/**
	 * 输出团队成员的信息
	 * 	3/3	任我行	23	7000.0	程序员
	 */
	public String getMemberInfo(){
		return getMemberId() + "/" + getId() + "\t" 
					+ getName() + "\t" + getAge() + "\t" + getSalary() + "\t程序员";
	}
	
	/**
	 * 输出对象的信息
	 */
	//3	任我行	23	7000.0	程序员	FREE			戴尔(NEC17寸)
	@Override
	public String toString() {
		return super.getEmployeeDes()+ "程序员" + "\t" + getStatus() + "\t\t\t" + getEquipment().getDescription();
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
	
	
}
