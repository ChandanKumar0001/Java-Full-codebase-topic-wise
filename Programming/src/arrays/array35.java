package arrays;

import java.util.Scanner;

public class array35 {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Rotations:");
		int n = sc.nextInt();
		if(n%ar.length==0)
			ArrayOperations.display(ar);
		while(n!=0)
		{
			int temp=ar[ar.length-1];
			for(int i=ar.length-1;i>0;i--)
			{
				ar[i] = ar[i-1];
			}
			ar[0] = temp;
			n--;
		}
		ArrayOperations.display(ar);
	}
}
