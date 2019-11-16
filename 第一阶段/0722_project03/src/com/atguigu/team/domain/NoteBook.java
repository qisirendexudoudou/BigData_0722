package com.atguigu.team.domain;

public class NoteBook implements Equipment {

	/*
	 * model: String price: double
	 */
	private String model;
	private double price;

	public NoteBook(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}

	@Override
	public String getDescription() {
		
		return model + "(" + price + ")";
	}

}
