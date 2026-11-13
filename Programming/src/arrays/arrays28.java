package arrays;
import java.util.Scanner;

class arrays28 {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Position:");
		int pos=sc.nextInt();
		
		pos=pos-1;
		int j=pos;
		while(j<ar.length-1)
		{
			ar[j]=ar[j+1];
			j++;
		}
		ar[j]=0;
		ArrayOperations.display(ar);
	}
}
