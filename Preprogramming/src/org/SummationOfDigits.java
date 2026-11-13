// Define a method to find summation of each digit in the given number.

package org;
import java.util.Scanner;

public class SummationOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = findSumOfDigits(number);
        System.out.println("The sum of digits in " + number + " is: " + sum);
        scanner.close();
    }

    public static int findSumOfDigits(int number) {
        // Handle negative numbers by converting to positive
        number = Math.abs(number); 

        int sum = 0;
        
        // Loop to extract each digit and add to the sum
        while (number > 0) {
            sum += number % 10;  // Add the last digit to sum
            number = number / 10;  // Remove the last digit
        }
        
        return sum;
    }
}

