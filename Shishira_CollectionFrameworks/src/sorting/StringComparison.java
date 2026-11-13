package sorting;

class StringComparison {
	public static void main(String[] args) {
		String data1="Orange";
		String data2="apple";
		String data3="mango";
		String data4="Orange";
		
		System.out.println(data1.compareTo(data2));  //-18
		System.out.println(data1.compareTo(data3));  //-30
		System.out.println(data1.compareTo(data4));  //0
	}
}
