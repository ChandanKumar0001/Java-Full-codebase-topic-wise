package com;

public class ForLoopDemo {
	public static void main(String[] args)
	{
		// Using for loop print Hello 5 times
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hello");
		}
		
		System.out.println("---------------------------");
		
		// using for loop print 1 to 10
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		System.out.println("---------------------------");
		
		// print 146 to 150
		for(int x=146; x<=150; x++)
		{
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		
		// 5 4 3 2 1
		for(int i=5; i>=1; i--)
		{
			System.out.println(i);
		}
		
		System.out.println("---------------------------");
		
		// 1 3 5 7 9
		for(int i=1; i<=10; i=i+2)
		{
			System.out.println(i);
		}
		
		
	}

}
