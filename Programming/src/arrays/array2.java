package arrays;
import java.util.Scanner;

class array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements:");
		double[] d = new double[5];

		for (int i = 0; i < d.length; i++) {
			d[i] = sc.nextDouble();

		}

		System.out.println("-------------------");
		for (int j = 0; j < d.length; j++) {
			System.out.println(d[j]);
		}
		
		sc.close();
	}
}
