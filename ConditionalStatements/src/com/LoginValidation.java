package com;

public class LoginValidation {
	public static void main(String[] args)
	{
		String id = "admin";
		int password = 123;
		
		if(id == "admin")
		{
			System.out.println("User Id is Valid");
			
			if(password == 123)
			{
				System.out.println("Password is valid");
				System.out.println("Login Successful ");
			}
			else
			{
				System.out.println("Password is Invalid");
				System.out.println("Login Unsuccessful ");
			}
		}
		else
		{
			System.out.println("User Id is Invalid");
			System.out.println("Login Unsuccessful ");
		}
	}

}
