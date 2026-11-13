package TwoDArray;

public class OddAndEvenCount {
	public static void main(String[] args) {
		int[][] arr = ArrayOperations2d.readArray();
		
		int oc=0;
		int ec=0;
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j]%2==0)
					ec++;
				else
					oc++;
			}
		}
		System.out.println("Count of even numbers is: "+ec);
		System.out.println("Count of odd numbers is: "+oc);
	}
}
