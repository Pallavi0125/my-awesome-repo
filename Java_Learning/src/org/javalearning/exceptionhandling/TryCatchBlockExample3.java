package org.javalearning.exceptionhandling;

import java.util.Scanner;

/*
Note: #7 There is possible to write multiple catch blocks with single try block.
because the way of handling the exception is varied from exception to the exception.
*/	
public class TryCatchBlockExample3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		try {
			System.out.println(10/n);
			System.out.println("JavaLearning".charAt(12));
		}
		catch(ArithmeticException ae) {
			System.out.println("ArithmeticException found in try block");
		}
		catch(NullPointerException ne) {
			System.out.println("NullPointerException found in try block");
		}
		catch(StringIndexOutOfBoundsException se) {
			System.out.println("StringIndexOutOfBoundsException found in try block");
		}
		 
		System.out.println("Rest of code executed");
	}

}
