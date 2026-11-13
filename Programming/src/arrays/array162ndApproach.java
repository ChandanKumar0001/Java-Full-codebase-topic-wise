package arrays;
import java.util.Scanner;

class array162ndApproach {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		System.out.println("Insert values in array: ");
		int[] ar = new int[size+1];
		
		for(int i=0; i<ar.length-1; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("Enter the index");
		int index=sc.nextInt();
		System.out.println("Enter the element:");
		int ele=sc.nextInt();
		isInsert(ar,index,ele);
	}
	
	public static void isInsert(int[] ar,int index,int ele)
	{
		int j=ar.length-1;
		while(j>index)
		{
			ar[j]=ar[j-1];
			j--;
		}
		ar[index]=ele;
		ArrayOperations.display(ar);
	}
}

