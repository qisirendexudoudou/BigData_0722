package com.atguigu.team.domain;

public class PC implements Equipment{

	// model: String
//	 display: String
	
	private String model;
	private String display;
	
	

	public PC(String model, String display) {
		super();
		this.model = model;
		this.display = display;
	}



	@Override
	public String getDescription() {
		return model + "(" + display + ")";
	}

}
