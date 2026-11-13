// Define a method to do the summation of n natural number using for loop statement

package org;
import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int sum = sumNaturalNumbers(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        scanner.close();
    }

    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        
        // Using for loop to calculate the sum of the first n natural numbers
        for (int i = 1; i <= n; i++) {
            sum += i;  // Add current number to the sum
        }

        return sum;
    }
}
