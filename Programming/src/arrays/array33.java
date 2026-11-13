package arrays;
import java.util.Scanner;

class array33 {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value: ");
		int value=sc.nextInt();
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]+ar[j]==value)
				{
					System.out.println("["+ar[i]+","+ar[j]+"]");
				}
			}
		}
	}
}
