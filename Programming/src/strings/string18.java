package strings;

import java.util.Scanner;

class string18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		boolean result = isPangram(str);
		
		if(result == true)
			System.out.println("It is a pangram string");
		else
			System.out.println("It is not pangram String");
	}
	
	public static boolean isPangram(String str) {
		int[] count = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z')
				count[ch-65]++;
			else if(ch>='a' && ch<='z')
				count[ch-97]++;
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i]==0)
				return false;
		}
		return true;
	}
}
