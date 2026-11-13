package strings;

import java.util.Scanner;

class string12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
		String s2 = ' '+s1;
		String s3 = "";
		
		for(int i=1; i<s2.length(); i++)
		{
			if(s2.charAt(i)!=' ' && s2.charAt(i-1)==' ')
				s3=s3+(char)(s2.charAt(i)-32);
			else
				s3=s3+s2.charAt(i);
		}
		System.out.println(s3);
		sc.close();
	}
}
