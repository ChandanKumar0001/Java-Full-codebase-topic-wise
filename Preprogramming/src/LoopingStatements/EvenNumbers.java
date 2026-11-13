// Define a method to print even number using looping statements.

package LoopingStatements;
import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        printEvenNumbers(n);
        scanner.close();
    }

    public static void printEvenNumbers(int n) {
        if (n < 2) {
            System.out.println("There are no even numbers less than or equal to " + n);
            return;
        }
        
        System.out.println("Even numbers up to " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}

