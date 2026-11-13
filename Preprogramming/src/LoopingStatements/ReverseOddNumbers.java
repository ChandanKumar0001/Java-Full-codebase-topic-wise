// Define a method to print odd number in reverse order using looping statements.

package LoopingStatements;
import java.util.Scanner;

public class ReverseOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        printReverseOddNumbers(n);
        scanner.close();
    }

    public static void printReverseOddNumbers(int n) {
        if (n < 1) {
            System.out.println("Please enter a number greater than or equal to 1.");
            return;
        }
        
        System.out.println("Odd numbers in reverse order from " + n + " to 1:");
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

