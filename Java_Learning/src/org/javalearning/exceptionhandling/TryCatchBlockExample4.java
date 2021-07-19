package org.javalearning.exceptionhandling;

import java.util.Scanner;

/*Note:
	#8 By using Exception class catch block can hold any type of exceptions.*/

public class TryCatchBlockExample4 {

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		int n = s.nextInt();
		try {
			System.out.println(10/n);
			System.out.println("Java".charAt(6));
		}
		catch(Exception e){
			System.out.println("ArithmeticException or StringIndexOutOfBoundsException found in try block");
		}
		
		System.out.println("Rest of the code executed");

	}

}
