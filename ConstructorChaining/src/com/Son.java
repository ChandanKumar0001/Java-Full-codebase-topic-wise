package com;

class Son extends Father {
	
	Son(){
		//super(); is used implicitly
		System.out.println(2);
	}
	public static void main(String[] args) {
		Son s = new Son();
	}
}
