package com;

public class Operators 
{
	
	public static void main(String[] args)
	{
		/* Arithmetic Operators */
		
		int a = 5;
		int b = 10;
		int sum = a+b;
		
		System.out.println("Sum: "+sum);
		System.out.println(a-2);
		System.out.println(4*b);
		System.out.println(10/5);
		System.out.println(10%2);
		
		System.out.println("------------------------------");
		
		/* Assignment Operators */
		
		int x = 10;
		System.out.println("value of x = "+x);
		
		x+=20; // x = x+20;
		System.out.println("Value of x = "+x);
		
		int i = 45;
		System.out.println("Value of i = "+i);
		
		i -= 13;
		System.out.println("Value of i = "+i);
		
		System.out.println("------------------------------");
		
		/* Comparison Operators */
		
		int c = 10;
		int d = 20;
		
		System.out.println(c<d); //true
		System.out.println(c<=5); //false
		
		System.out.println("------------------------------");
		
		System.out.println(d>50); //false
		System.out.println(d>=20); //true
		
		System.out.println("------------------------------");
		
		System.out.println(c==d); //false
		System.out.println(c!=d); //true
		System.out.println(c==10); //true
		System.out.println(c!=10); //false
		
		System.out.println("==============================");
		
		/* Logical Operators */
		
		int e = 1;
		int f = 2;
		boolean result = e<f && e==1;
		
		System.out.println(result); //true
		System.out.println(e<=4 && e==f); //false
		
		System.out.println("------------------------------");
		
		System.out.println(e<5 || f==5); //true
		System.out.println(e==f || f!=2); //false
		
		System.out.println("------------------------------");
		
		System.out.println(!true); //false
		System.out.println(!false); //true
		
		System.out.println(!(1<2)); //false
		System.out.println(!(20<5)); //true
		
		System.out.println("------------------------------");
		
		int g = 5;
		System.out.println("g: "+g); //5
		
		g++;
		System.out.println("g: "+g); //6
		
		g++;
		System.out.println("g: "+g); //7
		
		g--;
		System.out.println("g: "+g); //6
		
		g--;
		System.out.println("g: "+g); //5
		
		System.out.println("==============================");
		
		/* Pre & post Increment & decrement */
		
		int k = 40;
		int l = k++; //Post Increment -> First Assign, Then Increment
		
		System.out.println(k+" "+l); // 41 40
		
		System.out.println("------------------------------");
		
		int m = 5;
		int n = --m; // pre decrement -> first decrement, then assign
		
		System.out.println(m+" "+n); // 4 4
		
		System.out.println("==============================");
		
		/* Ternary Operators */
		
		int p = 10;
		int q = 5;
		
		int max = p>q ? p : q;
		
		System.out.println("Maximum of "+p+" & "+q+" is "+max);
		
		System.out.println("-------------------------------");
		
		/* Bitwise Operators */
		
		
	}
}
