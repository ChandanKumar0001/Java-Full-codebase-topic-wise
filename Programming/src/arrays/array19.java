package arrays;

class array19 {
	public static void main(String[] args) {
		//first array
		int[] ar=ArrayOperations.readArray();
		twoEqualHalves(ar);
		
	}
	
	 public static void twoEqualHalves(int[] ar) {
	        if (ar.length % 2 == 0) {
	            // Splitting the array into two halves
	            int[] br = new int[ar.length / 2];
	            int[] cr = new int[ar.length / 2];

	            for (int i = 0; i < ar.length; i++) {
	                if (i < ar.length / 2)
	                    br[i] = ar[i];
	                else
	                    cr[i - ar.length / 2] = ar[i];
	            }

	            // Display the results
	            display(br);
	            display(cr);
	        } else {
	            System.out.println("Array size is not even");
	        }
	    }
	 
	 public static void display(int[] arr) {
	        System.out.print("[");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i]);
	            if (i < arr.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	    }
}
