package strings;

class string2 {
	public static void main(String[] args) {
		String str = "Welcome To JSpiders";
		int UCC = 0;
		int LCC = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
				UCC++;
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
				LCC++;
		}
		System.out.println("Uppercase Count: "+UCC);
		System.out.println("Lowercase Count: "+LCC);
	}
}
