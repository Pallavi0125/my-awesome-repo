package org.javalearning.exceptionhandling;

/*Case2. In program if we used System.exit(0), 
 then the JVM will shutdown and rest of the code will not execute.
*/
 
public class FinallyBlockCase2 {

	public static void main(String[] args) {
		try 
		{
			System.out.println("Try block");
			System.exit(0);
		}
		finally 
		{
			System.out.println("finally block");
		}
		System.out.println("rest of the code");
	}
}
