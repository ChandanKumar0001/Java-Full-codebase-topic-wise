package sorting;

class Demo {
	public static void main(String[] args) {
		int d1=37;
		int d2=37;
		int d3=100;
		int d4=12;
		
		
		Integer data1=d1;  //Auto-boxing
		System.out.println(data1.compareTo(d2));  //0
		System.out.println(data1.compareTo(d3));  //-1
		System.out.println(data1.compareTo(d4));  //1
	}
}
