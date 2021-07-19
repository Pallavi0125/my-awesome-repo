package org.javalearning.exceptionhandling;

import java.util.Scanner;

/*Note: 
	There are 3 methods to print exception information:
		1. toString() : present in object class and returns hashcode.
		2. getMessage() : get() holds the values and set() assign the values
		3. printStackTrace() : called as IO exception
		Internally JVM uses printStackTrace() to print exception information.
*/
public class ExceptionInformationExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		try {
			System.out.println(10/n);
		}
		catch(ArithmeticException ae) {
			
			  System.out.println("Print exception using toString()" + ae.toString());
			  System.out.println("Print exception using getMessage()" + ae.getMessage());
			  ae.printStackTrace();
		}
		System.out.println("rest of the code executed");
	}

}

/* input: 0
   output:
	Print exception using toString()java.lang.ArithmeticException: / by zero
	Print exception using getMessage()/ by zero
	java.lang.ArithmeticException: / by zero -->> print by printStackTrace()
	rest of the code executed
	at org.javalearning.exceptionhandling.ExceptionInformationExample1.main(ExceptionInformationExample1.java:18)
 */
