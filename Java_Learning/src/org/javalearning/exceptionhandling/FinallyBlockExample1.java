package org.javalearning.exceptionhandling;

/*Note: 
	If there is no exception in try block then catch block will not execute and control goes to finally block.
*/

public class FinallyBlockExample1 {

	public static void main(String[] args) {
		try {
			System.out.println("try block");
		}
		catch(ArithmeticException ae) {
			System.out.println("catch block");
		}
		finally {
			System.out.println("finally block");
		}
	}

}
