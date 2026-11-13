package com;

public class MarksValidation 
{
	public static void main(String[] args)
	{
		int marks = 55;
		
		if(marks>=81 && marks<=100)
		{
			System.out.println("Distinction");
		}
		else if(marks>=35 && marks<=80)
		{
			System.out.println("First Class");
		}
		else if(marks>=0 && marks<=34)
		{
			System.out.println("Fail, Study well!!");
		}
		else
		{
			System.out.println("Invalid Marks");
		}
	}

}
