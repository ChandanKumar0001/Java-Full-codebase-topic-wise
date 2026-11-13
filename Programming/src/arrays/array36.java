package arrays;

import java.util.Scanner;

class array36 {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Rotations:");
		int n = sc.nextInt();
		if(n%ar.length==0)
			ArrayOperations.display(ar);
		while(n!=0)
		{
			int temp=ar[0];
			for(int i=0;i<ar.length-1;i++)
			{
				ar[i] = ar[i+1];
			}
			ar[ar.length-1] = temp;
			n--;
		}
		ArrayOperations.display(ar);
	}
}
