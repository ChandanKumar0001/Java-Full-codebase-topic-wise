package operators;

import java.util.Scanner;

class Character {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Character:");
		char ch1=sc.next().charAt(0);
		System.out.println("Enter the second Character:");
		char ch2=sc.next().charAt(0);
		
		System.out.println(ch1<ch2 && ch2==ch1);
		sc.close();
	}
}
