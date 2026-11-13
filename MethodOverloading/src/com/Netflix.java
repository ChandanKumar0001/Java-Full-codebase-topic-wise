package com;

class Netflix {
	static void login(String email, int password) {
		System.out.println("Logged in using email id & Password");
	}
	
	static void login(int contactNo, int otp) {
		System.out.println("Logged in using contact no & OTP");
	}
	
	public static void main(String[] args) {
		login("tom@gmail.com",123);
		System.out.println("----------------");
		Netflix.login(98796588, 12245);
	}
}
