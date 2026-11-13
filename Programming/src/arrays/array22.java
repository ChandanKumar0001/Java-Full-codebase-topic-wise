package arrays;

class array22 {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		
		if (isPalindrome(ar)) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int[] ar) {
        
    	int start = 0;
        int end = ar.length - 1;

        while (start < end) {
            if (ar[start] != ar[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
	}
}
