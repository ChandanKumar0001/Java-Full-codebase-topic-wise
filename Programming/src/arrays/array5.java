package arrays;
import java.util.Scanner;

class array5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		
		//String array
		System.out.println("Enter the names:");
		String[] str = new String[size];
		
		//to take the name
		for (int i=0; i<str.length; i++)
		{
			str[i] = sc.next();
		}
		
		System.out.println("----------------------------");
		//to extract first character from the name
		for(int j=0; j<str.length; j++)
		{
			System.out.println(str[j].charAt(0));
		}
		sc.close();
	}
}

