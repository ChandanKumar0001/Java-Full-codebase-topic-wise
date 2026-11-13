/* Define a method to count number of digit in the given number using do while 
statement */

// Error when i enter more than 9 digit as input

package org;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        countDigits(number);
        scanner.close();
    }

    public static void countDigits(int number) {
        // Handle negative numbers by converting to positive
        number = Math.abs(number); 
        
        // Variable to count digits
        int count = 0;
        
        // Use a do-while loop to count the digits
        do {
            count++;
            number = number / 10;  // Remove the last digit
        } while (number != 0);

        // Display the result
        System.out.println("Number of digits: " + count);
    }
}
