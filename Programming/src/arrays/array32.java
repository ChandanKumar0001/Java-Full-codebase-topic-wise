package arrays;

class array32 {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		
		for(int i=0; i<ar.length; i++)
		{
			int temp=0;
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[j]<0)
				{
					temp=ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
		ArrayOperations.display(ar);
	}
}
