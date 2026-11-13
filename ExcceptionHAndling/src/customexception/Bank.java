package customexception;
import java.util.Scanner;

class Bank {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int balance = 5000;
		
		System.out.println("Enter amount to be withdrawn:");
		int amount = scan.nextInt();
		scan.close();
		
		if(amount <= balance) {
			System.out.println("Amount withdrawn Successfully");
		}
		else {
			try {
				throw new InsufficientBalanceException("Insufficient Balance");
			}
			catch(InsufficientBalanceException e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	}
}
