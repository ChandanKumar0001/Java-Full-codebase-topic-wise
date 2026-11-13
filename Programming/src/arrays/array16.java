package arrays;
import java.util.Scanner;

class array16 {
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
		isInsertElement(ar,index,ele);
	}
	
	public static void isInsertElement(int[] ar,int index,int ele)
	{
		int j=ar.length-2;
		while(j>=index)
		{
			ar[j+1]=ar[j];
			j--;
		}
		ar[index]=ele;
		ArrayOperations.display(ar);
	}
}
