package com;

class MainClass {
	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("-----------");
		
		String[] fruits = {"Apple", "Banana", "Mango", "Orange"};
		for(int i=0; i<fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		System.out.println("------------");
		
		double[] marks = {12.3, 45.3};
		for (int i=0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
	}
}
