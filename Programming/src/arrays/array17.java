package arrays;
import java.util.Scanner;

class array17 {
	public static void main(String[] args) {
		int[] ar= ArrayOperations.readArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index:");
		int index=sc.nextInt();
		isRemove(ar,index);
		sc.close();
	}
	
	public static void isRemove(int[] ar,int index)
	{
		int j=index;
		while(j<ar.length-1)
		{
			ar[j]=ar[j+1];
			j++;
		}
		ar[j]=0;
		ArrayOperations.display(ar);
	}
}
