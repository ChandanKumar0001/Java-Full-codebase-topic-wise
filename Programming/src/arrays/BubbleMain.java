package arrays;

public class BubbleMain {
	public static void main(String[] args) {
		int[] arr=ArrayOperations.readArray();
		ArrayOperations.display(BubbleSort.sort2(arr));
	}
}


