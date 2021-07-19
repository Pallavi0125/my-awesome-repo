package org.javalearning.exceptionhandling;

/*Note: 
If try block doesn't have exception and 
catch block is not present then try block will execute and control goes to finally block.
*/

public class FinallyBlockExample6 {

	public static void main(String[] args) {
		try {
			System.out.println("Try block");
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("rest of the code");
	}

}
