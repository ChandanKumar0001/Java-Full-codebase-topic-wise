package arrays;

import java.util.Scanner;

class array27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=sc.nextInt();
		
		//to create an array of size +1
		int[] ar=new int[size+1];
		
		//to store elements
		for(int i=0; i<size; i++)
		{
			ar[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Position: ");
		int pos=sc.nextInt();
		
		System.out.println("Enter the Element: ");
		int ele=sc.nextInt();
		
		int j=ar.length-1;
		while(j>=pos)
		{
			ar[j]=ar[j-1];
			j--;
		}
		ar[j]=ele;
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.println(ar[i]+" ");
		}
	}
}
