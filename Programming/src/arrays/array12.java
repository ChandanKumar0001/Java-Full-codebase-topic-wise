package arrays;
import java.util.Scanner;

class array12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = ArrayOperations.readArray();
		
		System.out.println("Enter the index where you want to insert the element:");
		int index = sc.nextInt();
		
		System.out.println("Enter the element to be inserted:");
		int ele = sc.nextInt();
		isInsert(ar,index,ele);
		sc.close();
		
	}
	public static void isInsert(int[] ar, int index,int ele) {
		//new array
		int[] br = new int[ar.length+1];
		
		if(index<0 ||index>ar.length)
		{
			System.out.println("Index is invalid");
		}else
		{
			br[index]= ele;
			
			for(int i=0; i<ar.length; i++) {
				if(i<index)
					br[i] = ar[i];
				else
					br[i+1] = ar[i];
			}
			ArrayOperations.display(br);
		}
	}
}
