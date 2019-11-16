package com.atguigu.team.domain;

public class Programmer extends Employee {

	/*
	 * memberId : int
 status: Status
 equipment: Equipment

	 */
	
	private int memberId; //团队id
	private Status status = Status.FREE; //用来记录员工当前的状态
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


	/*
	 * (4	张三丰	24	7300.0	程序员	FREE			戴尔(三星 17寸)
	 */
	@Override
	public String toString() {
		return getEmployeeDes() + "\t程序员\t" + status + "\t\t\t" + equipment.getDescription();
	}
	
	/*
	 * 2/3	任我行	23	7000.0	程序员
	 */
	 public String showTeamInfo(){
		 return getMemberId() +"/" + getId() + "\t" 
				 + getName() + "\t" + getAge() + "\t" + getSalary()
				 + "\t程序员";
	 }
	
}
