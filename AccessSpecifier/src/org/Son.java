package org;

import com.Father;

// Accessing protected members in different package
class Son extends Father{
	
	public static void main(String[] args) {
		Son s= new Son();
		
		System.out.println(s.age);
		System.out.println(s.name);
	}
}
