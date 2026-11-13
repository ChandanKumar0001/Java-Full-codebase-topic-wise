package arrays;
import java.util.Scanner;

class array23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input character array from the user
		System.out.println("Enter the characters of the array (without spaces):");
		String input = sc.nextLine();
		char[] charArray = input.toCharArray();

		// Check if the character array is a Palindrome
		boolean isPalindrome = isPalindrome(charArray);

		// Display result
		if (isPalindrome) {
			System.out.println("The character array is a palindrome.");
		} else {
			System.out.println("The character array is not a palindrome.");
		}

		sc.close();
	}

	public static boolean isPalindrome(char[] charArray) {
		int start = 0;
		int end = charArray.length - 1;

		while (start < end) {
			if (charArray[start] != charArray[end]) {
				return false;
			}
			start++;
			end--;
		}

		return true;
	}
}
