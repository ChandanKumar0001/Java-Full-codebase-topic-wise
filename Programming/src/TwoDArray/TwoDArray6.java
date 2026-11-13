package TwoDArray;

public class TwoDArray6 {
	public static void main(String[] args) {
		int[][] arr = ArrayOperations2d.readArray();
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				sum += arr[i][j];
			}
		}
		System.out.println("The sum of the matrix is: "+sum);
	}
}
