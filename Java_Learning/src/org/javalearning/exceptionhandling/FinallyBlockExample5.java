package org.javalearning.exceptionhandling;

/*Note: 
If there is exception in finally block then finally block will not execute.
*/

public class FinallyBlockExample5 {

	public static void main(String[] args) {
		try {
			System.out.println("try block");
		}
		catch(ArithmeticException ae) {
			System.out.println("catch block");
		}
		finally {
			System.out.println(10/0);
		}

	}

}
