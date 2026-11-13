package strings;

import java.util.Scanner;

class string21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		System.out.println(isSwap(str));
	}
	
	public static String isSwap(String   str) {
		int f=0;
		char[] ch=str.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			if((i==0 && ch[i]!=' ')|| ch[i]!=' '&& ch[i-1]==' ')
				f=i;
			if(i==ch.length-1 || (ch[i]!=' ' && ch[i+1]==' '))
			{
				char temp=ch[i];
				ch[i]=ch[f];
				ch[f]=temp;
			}
		}
		return new String(ch);    //this is a predefined constructor in JAVA to convert char data to String data
	}
}
