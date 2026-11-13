//prime program using do-while.

package number_series;
import java.util.Scanner;

class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sc.close();
        
        // Calling another method
        boolean result = isPrime(n);
        if (result == true)
            System.out.println("It is a Prime number");
        else
            System.out.println("It is not a Prime number");
    }

    public static boolean isPrime(int n) {
        boolean flag = true;

        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

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
}
