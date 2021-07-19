package org.javalearning.exceptionhandling;

import java.util.Scanner;

/*NOTE: 
	It is possible to write/declare more than one exception in single catch block. 
*/
public class MultipleExceptionInSingleCatchBlock {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		try {
			System.out.println(10/n);
			System.out.println("Java".charAt(5));
		}
		catch(ArithmeticException | NullPointerException e) {
			System.out.println("Exception info: " + e);
		}
		catch(StringIndexOutOfBoundsException | ClassCastException | NumberFormatException e) {
			System.out.println("Exception info: " + e);
		}
	}
}
