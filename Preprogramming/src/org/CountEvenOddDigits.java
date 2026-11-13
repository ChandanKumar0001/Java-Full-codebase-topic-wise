// Define a method to count even digit and odd digit of a given number.

package org;
import java.util.Scanner;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        countEvenOddDigits(number);
        scanner.close();
    }

    public static void countEvenOddDigits(int number) {
        // Handle negative numbers by converting to positive
        number = Math.abs(number); 

        int evenCount = 0;
        int oddCount = 0;
        
        // Loop to count even and odd digits
        while (number > 0) {
            int digit = number % 10;  // Extract the last digit

            if (digit % 2 == 0) {
                evenCount++;  // Increment even count if the digit is even
            } else {
                oddCount++;   // Increment odd count if the digit is odd
            }

            number = number / 10;  // Remove the last digit
        }
        
        System.out.println("Even digits count: " + evenCount);
        System.out.println("Odd digits count: " + oddCount);
    }
}

