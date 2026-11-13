// Define a method to print odd number using looping statements.

package LoopingStatements;
import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        printOddNumbers(n);
        scanner.close();
    }

    public static void printOddNumbers(int n) {
        if (n < 1) {
            System.out.println("There are no odd numbers less than or equal to " + n);
            return;
        }
        
        System.out.println("Odd numbers up to " + n + ":");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}

