package arrays;
import java.util.Scanner;

class array14 {
	public static void main(String[] args) {
		
		//to read the size and array elements
		int[] ar = ArrayOperations.readArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index:");
		int index = sc.nextInt();
		
		isRemove(ar,index);
		sc.close();
	}
	
	public static void isRemove(int[] ar, int index) {
		int[] br = new int[ar.length-1];
		
		if(index<0 || index>br.length)
			System.out.println("Invalid Index");
		else
		{
			for(int i=0; i<br.length;i++)
			{
				if(i<index)
					br[i]=ar[i];
				else
					br[i]=ar[i+1];
			}
		}
		
		//to print the array elements
		ArrayOperations.display(br);
	}
}
