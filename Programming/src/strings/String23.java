//// For finding the largest word in the given Sentence

//package strings;
//import java.util.Scanner;
//
//public class String23 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Sentence: ");
//		String input = sc.nextLine();
//		sc.close();
//		
//		//splitting into into words
//		String[] words = input.split(" ");
//		
//		//find the largest word using array
//		String largestWord =" ";
//		for(String word : words)
//		{
//			if (word.length()>largestWord.length())
//			{
//				largestWord = word;
//			}
//		}
//		System.out.println("The largest word is: "+largestWord);
//	}
//}


// For finding the smallest word in the given Sentence

package strings;
import java.util.Scanner;

public class String23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String str = sc.nextLine();
		sc.close();
		
		//splitting into into words
		String[] s1 = str.split(" ");
		
		//find the smallest word using array
		String smallest = s1[0];
		for(int i=0; i<s1.length; i++)
		{
			if (s1[i].length()<smallest.length())
			{
				smallest = s1[i];
			}
		}
		System.out.println("The smallest word is: "+smallest);
	}
}
