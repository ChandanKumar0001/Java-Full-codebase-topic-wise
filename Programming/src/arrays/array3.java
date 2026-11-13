package arrays;
import java.util.Scanner;

class array3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=sc.nextInt();
		
		System.out.println("Enter the array elements");
		String[] name = new String[size];
		
		// to take names from the user dynamically
		for(int i=0; i<name.length; i++)
		{
			name[i]=sc.next();
		}
		
		// to print the data
		System.out.println("------------------------");
		for(int j=0; j<name.length; j++)
		{
			System.out.println(name[j]);
		}
		sc.close();
	}
}
