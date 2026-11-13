package switchstatement;

import java.util.Scanner;
public class EvenOddChecker {

    public static void checkEvenOdd(int number) {
        switch (number % 2) {
            case 0:
                System.out.println(number + " is even.");
                break;
            case 1:
            case -1: // This handles negative odd numbers
                System.out.println(number + " is odd.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        checkEvenOdd(number);
        scanner.close();
    }
}

