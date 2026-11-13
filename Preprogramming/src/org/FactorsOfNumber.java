// Define a method to find factors of the given number.

package org;
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        findFactors(number);
        scanner.close();
    }

    public static void findFactors(int number) {
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {  // Check if i is a factor
                System.out.print(i + " ");
            }
        }
    }
}
