package strings;

import java.util.Scanner;

class string4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.next();
		String s1 = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			s1 = s1+str.charAt(i);
		}
		System.out.println("Reversed Strig is: "+s1);
	}
}
