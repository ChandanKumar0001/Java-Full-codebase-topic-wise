package strings;

import java.util.Scanner;

class string22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        isLargest(str);
        sc.close();
    }

    public static void isLargest(String str) {
        String big = ""; // To store the longest word
        String currentWord = ""; // To build the current word
        char[] ch = str.toCharArray(); // Convert the input string to a character array

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') { // If the character is not a space, add it to the current word
                currentWord += ch[i];
            } else {
                // If a space is encountered, compare the current word with the longest word
                if (currentWord.length() > big.length()) {
                    big = currentWord;
                }
                currentWord = ""; // Reset currentWord for the next word
            }
        }

        // Compare the last word (in case there is no trailing space)
        if (currentWord.length() > big.length()) {
            big = currentWord;
        }

        System.out.println("The Longest word is: " + big);
    }
}
