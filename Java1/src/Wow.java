class Wow{
	String msg = "hello";
	{
		String msg = "good evening";
		System.out.println(msg);
		System.out.println(this.msg);
	}
	public static void main (String[] args) {
		new Wow();
	}
}