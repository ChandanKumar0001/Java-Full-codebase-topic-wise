/* Define a method to check user enter character is Uppercase or Lowercase*/

package operators;
import java.util.Scanner;
class character {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char ch = sc.next().charAt(0);
		sc.close();
		Character(ch);
	}
	public static void Character(char ch)
	{
		if(ch>='a' && ch<='z') {
			System.out.println("Lower Case");
		}
		
		else if(ch>='A' && ch <= 'Z') {
			System.out.println("Upper Case");
		}
		else
			System.out.println("Invalid Character");
	}
}
