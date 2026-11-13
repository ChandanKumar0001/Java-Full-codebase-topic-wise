package TwoDArray;

import java.util.Scanner;

public class ArrayOperations2d {
	
	//to read the values from the user and store the values of 2D array
	public static int[][] readArray(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size: ");
		int row = sc.nextInt();
		System.out.println("Enter the column size: ");
		int column = sc.nextInt();
		
		int[][] arr = new int [row][column];
		System.out.println("Enter the array values: ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		return arr;
	}
	
	
	//to print the values present in the 2D array
	public static void displayArray(int[][] arr) {
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
