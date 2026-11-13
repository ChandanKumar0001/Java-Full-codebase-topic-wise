package strings;

class string1 {
	public static void main(String[] args) {
		String str = "Programs";
		
		//Using charAt()
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i)+"--->"+i);
		}
		System.out.println("-----------------------");
		
		//Using toCharArray();
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			System.out.println(ch[i]+"---->"+i);
		}
	}
}