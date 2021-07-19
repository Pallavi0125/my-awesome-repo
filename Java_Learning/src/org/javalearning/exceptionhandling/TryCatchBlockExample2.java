package org.javalearning.exceptionhandling;

/*Note :
#6 If the exception raised in try block then rest code of try block won't be execute.
Once the control came out of try block again it will never enter the try block.
Don't write normal code in try block because there is no guarantee, 
that all statement of try block will execute or not.*/

public class TryCatchBlockExample2 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
	//exception raised in the 1st line. hence next lines of try block won't be execute.
			System.out.println("Java");
			System.out.println("Python");
		}
		catch(ArithmeticException ae) {
			System.out.println(10/5);
		}
		System.out.println("rest of the code executed");
	}

}
