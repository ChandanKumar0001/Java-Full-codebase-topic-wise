// Define a method to print fabonacciSeries of given numbers.

package org;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        printFibonacciSeries(n);
        scanner.close();
    }

    public static void printFibonacciSeries(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");
        
        // Print the first n terms of the Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;  // Calculate the next Fibonacci number
            a = b;             // Update a to the previous b
            b = next;          // Update b to the next Fibonacci number
        }
    }
}
