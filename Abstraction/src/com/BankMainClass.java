package com;

class BankMainClass {
	public static void main(String[] args) {
		Bank obj = new BankImpl();  // UpCasting
		
		obj.checkBalance();
		System.out.println("-------------------");
		
		obj.deposit(2000);
		obj.checkBalance();
		System.out.println("-------------------");
		
		obj.withdraw(4000);
		obj.checkBalance();
		
	}
}
