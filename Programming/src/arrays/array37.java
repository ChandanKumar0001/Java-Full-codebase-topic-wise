package arrays;

import java.util.Scanner;

class array37 {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements to be search:");
		int n = sc.nextInt();
		boolean flag=false;
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]==n)
			{
				flag=true;
				System.out.println("Element found at indes:"+i);
				break;
			}
		}
		if(flag==false)
			System.out.println("Element not found");
	}
}
