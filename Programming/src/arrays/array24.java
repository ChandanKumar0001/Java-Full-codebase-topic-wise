package arrays;

class array24 {
	public static void main(String[] args) {
		int arr[]=ArrayOperations.readArray();
		int ar[]=ArrayOperations.readArray();
		findCommonElement(arr,ar);
	}

	public static void findCommonElement(int[] arr,int[] ar) {
		for(int i=0; i<ar.length; i++) 
		{
			boolean flag=false;

			for(int j=0; j<ar.length; j++) {
				if(arr[i]==ar[j]) 
				{
					ar[j]=0;
					flag=true;
				}
			}
			if(flag==true)
				System.out.println(arr[i]);
		}
	}
}

