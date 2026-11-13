package strings;

import java.util.Scanner;

class string19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		boolean result=isAnagram(s1,s2);
		if(result == true)
			System.out.println("It is a Anagram String");
		else 
			System.out.println("It is not a Anagram String");
	}
	
	public static  boolean isAnagram(String s1, String s2) 
	{
		int[] c1 = countFrequency(s1);
		int[] c2 = countFrequency(s2);
		
		for(int i=0; i<c1.length; i++)
		{
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}
	
	private static int[] countFrequency(String str)
	{
		int[] count = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch>='A' && ch<='Z')
				count[ch-65]++;
			else if(ch>='a' && ch<='z')
				count[ch-97]++;
		}
		return count;
	}
		
}
