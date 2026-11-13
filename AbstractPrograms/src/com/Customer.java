package com;

class Customer extends Amazon{
	
	@Override
	void buyProduct(String product) {
		System.out.println("Buying: "+product);
	}
	
	@Override
	void payAmount(int amount) {
		System.out.println("Paying Rs. "+amount);
	}
	
	public static void main(String[] args) {
		Customer c = new Customer();
		c.buyProduct("Watch");
		c.payAmount(2000);
	}
}
