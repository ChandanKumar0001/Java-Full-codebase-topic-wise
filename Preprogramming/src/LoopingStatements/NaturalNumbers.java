// Define a method to print natural numbers using looping statement.

package LoopingStatements;
import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        printNaturalNumbers(n);
        scanner.close();
    }

    public static void printNaturalNumbers(int n) {
        if (n < 1) {
            System.out.println("Please enter a number greater than or equal to 1.");
            return;
        }
        
        System.out.println("Natural numbers up to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
