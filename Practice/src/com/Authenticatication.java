package com;
import java.util.Scanner;

class Authenticatication {
	static void login(int id) throws LoginException {
		if(id=2222) {
			System.out.println("Login Successfully!");
		}
		else {
			throw new LoginException ("Invalid OTP");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User ID: ");
		int id = sc.nextInt();
		
		try {
			login(id);
		}
		catch(LoginException e){
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
