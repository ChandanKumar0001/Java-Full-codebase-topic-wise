package com;

class BankImpl implements Bank {
	
	int balance = 5000;
	
	@Override
	public void deposit(int amount) {
		System.out.println("Depositing ₹"+amount);  // Ctrl+alt+4= ₹ (symbol)
		balance = balance +amount;
		System.out.println("Amount Deposited Successfully");
	}
	
	@Override
	public void withdraw(int amount) {
		System.out.println("Withdraw ₹"+amount);
		balance = balance - amount;
		System.out.println("Amount Withdrawn Successfully");
	}
	
	@Override
	public void checkBalance() {
		System.out.println("Available Balance ₹"+balance);
	}
}
