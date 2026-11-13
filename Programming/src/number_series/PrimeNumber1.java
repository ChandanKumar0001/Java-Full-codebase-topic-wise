//Without return statement check prime or not using simple method

package number_series;
import java.util.Scanner;

class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sc.close();
        // Calling another method to check and print
        checkPrime(n);
    }
    
    // Method to check and print whether the number is prime
    public static void checkPrime(int n) {
        boolean flag = true;

        if (n <= 1) {
            System.out.println("It is not a Prime number");
            return;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("It is a Prime number");
        } else {
            System.out.println("It is not a Prime number");
        }
    }
}
