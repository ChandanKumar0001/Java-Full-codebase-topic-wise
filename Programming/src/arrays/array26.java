package arrays;

class array26 {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]==ar[j])
					System.out.println(ar[i]);
			}
		}
	}
}
