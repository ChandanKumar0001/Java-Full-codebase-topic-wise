// Define a method to find summation of first and last digit in the given number.(zylum numbers).

package org;
import java.util.Scanner;

public class ZylumNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = findSumOfFirstAndLastDigit(number);
        System.out.println("The sum of the first and last digits of " + number + " is: " + sum);
        scanner.close();
    }

    public static int findSumOfFirstAndLastDigit(int number) {
        // Handle negative numbers by converting to positive
        number = Math.abs(number); 
        
        // Get the last digit
        int lastDigit = number % 10;
        
        // Get the first digit (keep dividing the number by 10 until it becomes less than 10)
        while (number >= 10) {
            number = number / 10;
        }
        int firstDigit = number;
        
        // Return the sum of the first and last digits
        return firstDigit + lastDigit;
    }
}
