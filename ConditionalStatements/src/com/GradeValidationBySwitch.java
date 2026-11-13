package com;

public class GradeValidationBySwitch 
{
	public static void main(String[] args)
	{
		char grade = 'C';
		
		switch(grade)
		{
		case 'A':System.out.println("Excellent -> Distinction");
		break;
		
		case 'B':System.out.println("Good -> First Class");
		break;
		
		case 'C':System.out.println("Bad -> Fail");
		break;
		
		default :System.out.println("Invalid Grade");
		}
	}
}
