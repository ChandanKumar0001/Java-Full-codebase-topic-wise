// Define a method to reverse the given numbers

package org;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int reversedNumber = reverseNumber(number);
        System.out.println("The reversed number is: " + reversedNumber);
        scanner.close();
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        
        // Loop to reverse the digits of the number
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            reversed = reversed * 10 + digit;  // Add the digit to the reversed number
            number = number / 10;  // Remove the last digit
        }
        
        return reversed;
    }
}

