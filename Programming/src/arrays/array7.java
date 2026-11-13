package arrays;
import java.util.Scanner;

class array7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int sum = 0;

        System.out.println("Enter the array elements: ");
        int[] ar = new int[size];

        // Take n integer values from the user
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println("-----------------------------");

        // Print the sum of even numbers using a loop
        for (int j = 0; j < ar.length; j++) {
            if (ar[j] % 2 == 0) { 
                sum = sum + ar[j];
            }
        }
        
        System.out.println("Sum of even numbers: " + sum); 
        sc.close();
    }
}
