// CheckPrime using do-while statement.

package number_series;
import java.util.Scanner;

class CheckPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		
		if (n <= 1) {
            System.out.println(n + " is not a prime number.");
            return;
        }

        boolean isPrime = true;
        int divisor = 2;

        // Start do-while loop to check divisors
        do {
            if (n % divisor == 0) {
                isPrime = false;
                break;
            }
            divisor++;
        } while (divisor <= n / 2);

        // Output the result
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}