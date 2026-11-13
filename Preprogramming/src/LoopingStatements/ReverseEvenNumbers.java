// Define a method to print even number in reverse order using looping statements.

package LoopingStatements;
import java.util.Scanner;

public class ReverseEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        printReverseEvenNumbers(n);
        scanner.close();
    }

    public static void printReverseEvenNumbers(int n) {
        if (n < 2) {
            System.out.println("Please enter a number greater than or equal to 2.");
            return;
        }
        
        System.out.println("Even numbers in reverse order from " + n + " to 2:");
        for (int i = n; i >= 2; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
