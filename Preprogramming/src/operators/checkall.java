/* Define a method to check user enter value is consonant or vowel in UpperCase
 * or lowerCase or Digit or Special Character */

package operators;
import java.util.Scanner;

class checkall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char ch = sc.next().charAt(0);
		sc.close();
		checkCharacter(ch);
	}

	public static void checkCharacter(char ch) {
		if (ch >= 'a' && ch <= 'z') {
			// Check if lowercase vowel or consonant
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println("Lower Case Vowel");
			} else {
				System.out.println("Lower Case Consonant");
			}
		} else if (ch >= 'A' && ch <= 'Z') {
			// Check if uppercase vowel or consonant
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println("Upper Case Vowel");
			} else {
				System.out.println("Upper Case Consonant");
			}
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("Digit");
		} else {
			System.out.println("Special Character");
		}
	}
}
