public class Account {
	long accNum;
	String name;
	double balance;
	Account( long acn,String nm, double bal){
		this.accNum = acn;
		this.name = nm;
		this.balance = bal;
	}
	public static void main(String[] args) {
		Account a1 = new Account(110122,"Chandan",1000);
		System.out.println(a1.accNum+" "+a1.name+" "+a1.balance);
		Account a2 = new Account(116122,"Kumar",545000);
		System.out.println(a2.accNum+" "+a2.name+" "+a2.balance);
		Account a3 = new Account(118122,"Rohit",10320);
		System.out.println(a3.accNum+" "+a3.name+" "+a3.balance);
	}
}

/* Define a class Account
decleare 3 instance variables
accNum , name , balance
define a prarameterized custom constructor
initialize all instance variable
Must: use this keyword
define main method 
create at least 3 account objects
print instance variables. */
