// Define a method to check the given number is a prime number or not.

package org;
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        boolean isPrime = checkPrime(number);
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        scanner.close();
    }

    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;  // 0 and 1 are not prime numbers
        }

        // Loop to check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // The number is divisible by i, so it's not prime
            }
        }

        return true;  // The number is prime
    }
}
