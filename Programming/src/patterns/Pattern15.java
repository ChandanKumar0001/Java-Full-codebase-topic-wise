package patterns;
import java.util.Scanner;
class Pattern15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=2*n-1;i++) {
			for(int j=1; j<=n;j++) {
				System.out.print(i>=j && i+j<=2*n? "*"+" " : " "+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
