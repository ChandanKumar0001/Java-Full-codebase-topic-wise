package day5;

import java.util.Scanner;

//try,catch,finally,throw & throws
class Amazon {
	
	static void checkEligibilty(int marks) throws InvalidMarksException{ //throws 
		//if marks > 70 -> Print Apply for Amazon interview
			if(marks >70) {
				System.out.println("Apply for Amazon interview");
			}
		//else -> invoke InvalidMarksException object
			else {
				//Do not handle indicate caller to handle
				throw new InvalidMarksException("Not Eligible for Amazon Interview");
			}
		
		
	}
	
	public static void main(String[] args) {
		//Accept marks from user using Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks");
		int marks = sc.nextInt();
		
		//try & and catch block
			try {
				checkEligibilty(marks);
			}
			catch(InvalidMarksException e) {
				System.out.println(e.getMessage());
			}
			
		//finally close the Scanner object.
		finally{
			sc.close();
		}
	}
}

// In above program we use all concepts of Exception Handling.
