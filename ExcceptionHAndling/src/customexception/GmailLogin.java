package customexception;
import java.util.Scanner;

class GmailLogin {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Password: ");
		int password = scan.nextInt();
		scan.close();
		
		if(password == 123) {
			System.out.println("Login Successfull!!");
		}
		else {
			try {
				throw new InvalidPasswordException("Invalid Password Entered!");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
}

// UpCasting Or Generalization;
// Exception e = new InvalidPasswordException("Invalid Password Entered");
