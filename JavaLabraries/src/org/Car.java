package org;

class Car {
	int cost;
	
	Car(int cost){
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Cost:" + cost;
	}
	
	public static void main(String[] args) {
		Car c1 = new Car(100);
		Car c2 = new Car(200);
		System.out.println(c1); // c1.toString() -> Cost:100
		System.out.println(c2); // c2.toString() -> Cost:200
		System.out.println(new Car(300)); // new Car(300).toString(); ->Cost 300s
	}
}
