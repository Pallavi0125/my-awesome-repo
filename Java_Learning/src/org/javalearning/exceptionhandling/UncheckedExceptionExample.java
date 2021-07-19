package org.javalearning.exceptionhandling;

/*# UnChecked Exception: 
    1. The exception which is not checked by compiler at the time of compilation and raised at runtime called as Unchecked exception.
     eg: ArithmeticException, ArrayIndexOutOfBoundsException, NumberFormatException etc.
    2. This exception is handled by JVM at runtime, because at run time it will give error for the occurred exception.
 # There is 2 ways to handle Checked Exception: 
 		1. By using try/catch block
 		2. By using throws keyword*/

public class UncheckedExceptionExample {

	public static void main(String[] args) {
		//System.out.println(10/0); // ArithmeticException
		
		/*
		 * int arr[] = {10,20,30,40}; 
		 * System.out.println(arr[2]);
		 * System.out.println(arr[10]); // ArrayIndexOutOfBoundsException
		 */
		
		String str = "Pallavi";
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(10)); //StringIndexOutOfBoundsException
		System.out.println("rest of the code executed");

	}

}
