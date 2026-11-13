package number_series;
import java.util.Scanner;

class PrimePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sc.close();
        
        // Check if the number is both prime and palindrome
        if (isPrime(n) && isPalindrome(n)) {
            System.out.println("It is a Prime Palindrome number");
        } else {
            System.out.println("It is not a Prime Palindrome number");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        boolean flag = true;
        int i = 2;

        do {
            if (n % i == 0) {
                flag = false;
                break;
            }
            i++;
        } while (i < n); // Loop from 2 to n-1

        return flag;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n =n/ 10;
        }

        return original == reversed; // Compare original number with reversed
    }
}
