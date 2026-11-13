package arrays;
import java.util.Scanner;

class array6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		
		System.out.println("Enter the integer values: ");
		int[] ar = new int[size];
		
		//to take the n integer values from the user 
		for (int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		//to print only even element in array
		for(int j=0; j<ar.length; j++)
		{
			if(ar[j]%2==0)
			{
				
				System.out.println(ar[j]);
			}
		}
		sc.close();
	}
}
