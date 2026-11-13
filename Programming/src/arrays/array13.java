package arrays;
import java.util.Scanner;

class array13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();


		System.out.println("Enter the array elements");
		int[] ar = new int[size];

		//to take dynamic values form user
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}

		int fsmallest = ar[0];
		int ssmallest = ar[1];
		for(int j=0; j<ar.length; j++)
		{
			  if (ar[j] < fsmallest) {
	                ssmallest = fsmallest; 
	                fsmallest = ar[j];   
	            } 
			  
			// for duplicate of the second largest values returns once
			  else if (ar[j] < ssmallest && ar[j] != fsmallest) {
	                ssmallest = ar[j];     
	            }
	        }

		System.out.println("Second Smallest element in given array is: "+ssmallest);
		sc.close();
	}
}
