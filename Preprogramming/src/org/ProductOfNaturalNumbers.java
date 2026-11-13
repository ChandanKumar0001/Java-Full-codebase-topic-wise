// Define a method to find the product of n natural number using for loop statement

package org;
import java.util.Scanner;

public class ProductOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        findProduct(n);
        scanner.close();
    }

    public static void findProduct(int n) {
        if (n < 1) {
            System.out.println("Please enter a positive number greater than or equal to 1.");
            return;
        }
        
        long product = 1;  // Using long to handle large results
        
        for (int i = 1; i <= n; i++) {
            product *= i;  // Multiply the product by the current number
        }
        
        System.out.println("The product of the first " + n + " natural numbers is: " + product);
    }
}

