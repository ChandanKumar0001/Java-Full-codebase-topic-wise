/* Define a method to display each digit in the given number is like input=1245 
then output is = 1, 2, 4, 5 using while statement */

package org;
import java.util.Scanner;

public class DisplayDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        displayDigits(number);
        scanner.close();
    }

    public static void displayDigits(int number) {
        // Check if the number is positive
        if (number < 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        System.out.println("Digits in the number " + number + ":");
        // Process each digit of the number
        while (number > 0) {
            int digit = number % 10;  // Get the last digit
            System.out.print(digit + " ");
            number = number / 10;  // Remove the last digit
        }
    }
}
