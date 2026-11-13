// Define a method to print natural numbers in reverse order using looping statement

package LoopingStatements;
import java.util.Scanner;

public class ReverseNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        printReverseNaturalNumbers(n);
        scanner.close();
    }

    public static void printReverseNaturalNumbers(int n) {
        if (n < 1) {
            System.out.println("Please enter a number greater than or equal to 1.");
            return;
        }
        
        System.out.println("Natural numbers in reverse order from " + n + " to 1:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}

