package org.javalearning.exceptionhandling;

/*Note: 
If there is exception in catch block then also it will not execute and control goes to finally block.
*/

public class FinallyBlockExample4 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException ae) {
			System.out.println(10/0);
		}
		finally {
			System.out.println("finally block");
		}

	}

}
