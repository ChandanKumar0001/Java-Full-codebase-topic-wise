package arrays;

class array20 {
	public static void main(String[] args)
	{
		int[] ar=ArrayOperations.readArray();
		
		int i=0;
		int j=ar.length-1;
		int temp=0;
		while(i<j)
		{
			temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			i++;
			j--;
		}
		ArrayOperations.display(ar);
	}
}
