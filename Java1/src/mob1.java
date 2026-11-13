class mob1 {
    // Constructor to print "Lunch" when an object is created
    mob1() {
        System.out.println("Lunch");
    }

    // Instance initializer block (optional, runs when an object is created)
    {
        System.out.println("Snacks");
    }
    
    public static void main(String[] args) {
        System.out.println("main");
        mob1 m = new mob1();  // Constructor will print "Lunch", initializer block will print "Snacks"
        System.out.println(m);
    }
}
