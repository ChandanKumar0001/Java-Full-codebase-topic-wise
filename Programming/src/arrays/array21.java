package arrays;

class array21 {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		
		for(int i=0; i<ar.length; i++)
		{
			ar[i]=isReverse(ar[i]);
		}
		ArrayOperations.display(ar);
	}
	
	public static int isReverse(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		return rev;
	}
}
