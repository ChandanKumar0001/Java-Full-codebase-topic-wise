package arrays;

class array29 {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		
		
		int sum=0;
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]+ar[j]>sum)
				{
					sum=ar[i]+ar[j];
				}
			}
		}
		System.out.println("The greatest sum of 2 elements is: "+sum);
	}
}
