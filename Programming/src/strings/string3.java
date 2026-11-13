package strings;

import java.util.Scanner;

class string3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		int ucc=0;
		int lcc=0;
		int dc=0;
		int scc=0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
				ucc++;
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
				lcc++;
			else if (str.charAt(i)>='0' && str.charAt(i)<='9')
				dc++;
			else 
				scc++;
		}
		System.out.println("Uppercase count: "+ucc);
		System.out.println("Lowercase count: "+lcc);
		System.out.println("Digits count: "+dc);
		System.out.println("Special character count: "+scc);
	}
}
