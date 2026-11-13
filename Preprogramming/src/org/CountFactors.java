// Define a method to find numbers of factors of given numbers.

package org;
import java.util.Scanner;

public class CountFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int numberOfFactors = findNumberOfFactors(number);
        System.out.println("Number of factors of " + number + " is: " + numberOfFactors);
        scanner.close();
    }

    public static int findNumberOfFactors(int number) {
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return 0;
        }
        
        int count = 0;
        
        // Loop to count the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {  // If i is a factor of number
                count++;
            }
        }
        
        return count;  // Return the total number of factors
    }
}
