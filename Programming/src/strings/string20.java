package strings;

import java.util.Scanner;

class string20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		isReverse(str);
	}
	
	public static void isReverse(String str)
	{
		String s1 = "";
		char[] ch = str.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
		{
			int l=i;
			while(i>=0 &&ch[i] !=' ')
			{
				i--;
			}
			
			int f=i+1;
			while(f<=l) {
				s1 = s1+ch[f];
				f++;
			}
			
			if(i>=0) {
				s1 = s1+' ';
			}
		}
		System.out.println(s1);
	}
}
