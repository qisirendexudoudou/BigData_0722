package com.atguigu.lgl;

public class Order {
	
	public static void main(String[] args) {

		Order o1 = new Order(13, "hehe");
		Order o2 = new Order(13, "hehe");
		Order o3 = o2;
		System.out.println(o1.equals(o2));
		System.out.println(o3.equals(o2));
		
		
		
	}
	
	int orderld;
	String orderName;
	
	public boolean equals(Order o2) {
		if(this == o2){
			return true;
		}else
			return false;
	}

//	public boolean equals(Order o1,Order o2) {
//			return o1.equals(o2);
//	}
	
	public Order() {
		super();
	}
	
	public Order(int orderld, String orderName) {
		super();
		this.orderld = orderld;
		this.orderName = orderName;
	}
	public int getOrderld() {
		return orderld;
	}
	public void setOrderld(int orderld) {
		this.orderld = orderld;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	
	

}
