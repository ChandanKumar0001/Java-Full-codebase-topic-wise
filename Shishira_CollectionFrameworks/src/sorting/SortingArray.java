package sorting;
import java.util.Arrays;
import java.util.Collections;
class SortingArray {
	public static void main(String[] args) {
		String[] arr ={"mango","kiwi","apple","banana","Orange"};
		
		for(String fruit:arr)
		{
			System.out.println(fruit);
		}
		
		System.out.println("------------------------------");
		
		Arrays.sort(arr);
		for(String fruit:arr)
		{
			System.out.println(fruit);
		}
		
		System.out.println("---------------------------------");
		
		Arrays.sort(arr,Collections.reverseOrder());
		for(String fruit:arr)
		{
			System.out.println(fruit);
		}
	}
}

/* Output:-

mango
kiwi
apple
banana
Orange
------------------------------
Orange
apple
banana
kiwi
mango
---------------------------------
mango
kiwi
banana
apple
Orange

*/
