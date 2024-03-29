package com.atguigu.team.domain;

public class Printer implements Equipment {
	
	/*
	 *  type: String
 name: String

	 */
	
    private String type;
    private String name;
    
    

	public Printer(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}



	@Override
	public String getDescription() {
		return name + "("  + type + ")";
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	

	
}
