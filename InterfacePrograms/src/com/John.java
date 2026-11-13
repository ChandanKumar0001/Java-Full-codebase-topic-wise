package com;

class John implements Flipkart{
	
	@Override
	public void buy() {
		System.out.println("Buying Laptop");
	}
	
	@Override
	public void pay() {
		System.out.println("Paying ₹60000"); // ctrl+ alt + 4 = ₹ ->Sfor getting ₹ (rupees)Symbol;
	}
	
	public static void main(String[] args) {
		John j = new John();
		j.buy();
		j.pay();
	}
}
