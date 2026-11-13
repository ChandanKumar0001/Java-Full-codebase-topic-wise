package strings;

import java.util.Scanner;

class string8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();     //String should be in the lower case
		int vc=0;
		int cc=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i) <='z' || 
					str.charAt(i)>='A' && str.charAt(i) <='Z')
			{
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'
						||str.charAt(i)=='o'||str.charAt(i)=='u' //-->lowerCase vowels
						||str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'
						||str.charAt(i)=='o'||str.charAt(i)=='u') //-->UpperCase vowels
				{
					vc++;
				}
				else
					cc++;
			}
		}
		System.out.println("vowels count: "+vc);
		System.out.println("consonants count: "+cc);
		
	}
}
