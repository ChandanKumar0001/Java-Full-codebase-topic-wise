// Define a method to find Product of each digit in the given number.

package org;
import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int product = findProductOfDigits(number);
        System.out.println("The product of digits in " + number + " is: " + product);
        scanner.close();
    }

    public static int findProductOfDigits(int number) {
        // Handle negative numbers by converting to positive
        number = Math.abs(number);

        if (number == 0) {
            return 0;  // Special case: the product of digits of 0 is 0
        }

        int product = 1;
        
        // Loop to extract each digit and multiply to the product
        while (number > 0) {
            product *= number % 10;  // Multiply the last digit to product
            number = number / 10;    // Remove the last digit
        }
        
        return product;
    }
}

