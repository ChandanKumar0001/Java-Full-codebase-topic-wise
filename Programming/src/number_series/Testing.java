package number_series;
import java.util.Scanner;

class Testing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age:");
		int a = sc.nextInt();
		String res = iseligible(a);
		System.out.println(res);
		
	}
	public static String iseligible(int a) {
		String res = a>=22&&a<=35?"Is Eligible":"Not Eligible";
		return res;
	}
}
