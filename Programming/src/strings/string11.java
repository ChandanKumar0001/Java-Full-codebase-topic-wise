package strings;

import java.util.Scanner;

class string11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
		String s2="";
		
		for(int i=0; i<s1.length(); i++)
		{
			if(i%2!=0)
			{
				s2=s2+(char)(s1.charAt(i)-32);
			}
			else
				s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
	}
}
