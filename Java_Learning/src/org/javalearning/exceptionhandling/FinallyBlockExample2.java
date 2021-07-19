package org.javalearning.exceptionhandling;

/*Note: 
If there is exception in try block then only catch block will execute and then control goes to finally block.
*/

public class FinallyBlockExample2 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException ae) {
			System.out.println("catch block");
		}
		finally {
			System.out.println("finally block");
		}

	}

}
