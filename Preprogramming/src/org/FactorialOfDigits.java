// Define a method to find factorial of each digit of the given number.

package org;
import java.util.Scanner;

public class FactorialOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        findFactorialOfDigits(number);
        scanner.close();
    }

    public static void findFactorialOfDigits(int number) {
        // Handle negative numbers by converting to positive
        number = Math.abs(number);

        System.out.print("Factorial of each digit: ");
        
        // Loop to process each digit
        while (number > 0) {
            int digit = number % 10;  // Extract the last digit
            int factorial = calculateFactorial(digit);  // Calculate the factorial of the digit
            System.out.print(factorial + " ");
            
            number = number / 10;  // Remove the last digit
        }
    }

    public static int calculateFactorial(int n) {
        int factorial = 1;
        // Calculate factorial of n
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
