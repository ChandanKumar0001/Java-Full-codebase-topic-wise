package day5;

import java.util.Scanner;

class Gmail {
	static void login(int otp) throws InvalidOTPException {
		if(otp==1234) {
			System.out.println("Login Successfully!");
		}
		else {
			throw new InvalidOTPException("Invalid OTP");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the OTP: ");
		int otp = sc.nextInt();
		
		try {
			login(otp);
		}
		catch(InvalidOTPException e){
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
