package com.atguigu.lgl.domain;

public class NoteBook implements Equipment{

	private String model;
	private double price;
	
	
	
	public NoteBook(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}



	public NoteBook() {
		super();
	}



	@Override
	public String getDescription() {
		return model + "(" + price + ")";
	}
	/**
	 * model: String
 price: double

	 */

}
