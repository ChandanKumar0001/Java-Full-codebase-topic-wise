package strings;

import java.util.Arrays;
import java.util.Scanner;

class string15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		char[] ch = new char[str.length()];
		
		//to char array
		for(int i=0; i<str.length(); i++)
		{
			ch[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(ch));
	}
}
