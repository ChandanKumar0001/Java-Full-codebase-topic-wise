package arrays;

import java.util.Scanner;

class array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three arrary value: ");
		int[] ar = new int[3];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();

		}

		System.out.println("Printing the data from array");

		for (int j = 0; j < ar.length; j++) {
			System.out.println(ar[j]);
		}

		sc.close();
	}
}
