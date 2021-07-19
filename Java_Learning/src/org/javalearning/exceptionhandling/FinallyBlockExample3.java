package org.javalearning.exceptionhandling;

/*Note: 
If correct exception is not declare in catch block then catch block will not execute and control goes to finally block.
*/

public class FinallyBlockExample3 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(NullPointerException ne) {
			System.out.println("catch block");
		}
		finally {
			System.out.println("finally block");
		}

	}

}
