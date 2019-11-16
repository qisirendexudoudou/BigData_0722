package com.atguigu.team.domain;

public class Printer implements Equipment{
	
	// type: String
//	 name: String
	private String type;
	private String name;

	
	public Printer(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}


	@Override
	public String getDescription() {
		return name + "(" + type + ")";
	}

}
