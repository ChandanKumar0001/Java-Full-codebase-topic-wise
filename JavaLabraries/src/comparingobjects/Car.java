package comparingobjects;

class Car {
	
	int cost;
	
	Car(int cost){
		this.cost = cost;
	}
	
	@Override
	public boolean equals(Object obj) {//1. UpCasting -> Object obj = new Car(100);
		if(obj instanceof Car) {    //2. Cheacking if the object having Car object
			Car c = (Car) obj;      //3. Downcasting to Car type
			return this.cost == c.cost; //4. Comparision logic -> c1.cost==c2.cost;
		}
		return false;                  //5. returning false for negative scenario
	}
	
	public static void main(String[] args) {
		
		Car c1 = new Car(100);
		Car c2 = new Car(200);
		System.out.println(c1.equals(c2));  //c1.equals(new Car(200));
		
	}
}

//c1 -> this
//c2 -> obj (upcasted reference) -> c (downcasted reference)
