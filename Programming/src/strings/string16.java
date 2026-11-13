package strings;

import java.util.Scanner;

class string16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		boolean flag = false;
		
		for(int i=0; i<ch1.length; i++)
		{
			if(ch1[i]!=ch2[i])
			{
				flag = true;
				break;
			}
		}
		if(flag==true)
			System.out.println("Not equals");
		else
			System.out.println("equals");
	}
}
