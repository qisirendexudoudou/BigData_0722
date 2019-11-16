package com.atguigu.lgl;

import com.atguigu.lgl1.Customer;

public class Bank {

	Customer[] customer;
	int numberOfCustomer;
	
	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.customer = b1.getCustomer(5);
		b1.getNumberOfCustomer();
		
		
	}
	
	
	
	
	public void addCustomer(String f,String l){		
		for (int i = 0; i < customer.length; i++) {
			Customer c1 = new Customer(f, l);
			customer[i] = c1;
			Bank bank = new Bank();
			bank.numberOfCustomer = i+1;
		}
	}
	
	public Bank() {
	}
	public Customer[] getCustomer(int index) {
		return customer;
	}

	public int getNumberOfCustomer() {
		return numberOfCustomer;
	}

}
