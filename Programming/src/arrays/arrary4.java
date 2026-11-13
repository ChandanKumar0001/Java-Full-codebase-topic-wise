package arrays;
import java.util.Scanner;

public class arrary4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		
		System.out.println("Enter the Array elements in Character:");
		char[] ch = new char[size];
		
		//to take dynamic data from user
		for (int i=0; i<ch.length; i++)
		{
			ch[i] = sc.next().charAt(0);
		}
		
		System.out.println("----------------------------");
		//for printing the characters
		for(int i=0; i<ch.length; i++)
		{
			System.out.println(ch[i]);
		}
		sc.close();
	}
}
