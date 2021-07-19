package org.javalearning.exceptionhandling;

import java.util.Scanner;

/*Note: 
	#9 If we declare multiple catch blocks then order must be child-parent,
	   but if we are declaring parent to child, compiler will generate error message.*/

public class TryCatchBlockExample5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		try {
			System.out.println(10/n);
			System.out.println("Java".charAt(10));
		}
		catch(ArithmeticException ae) //-->>ArithmeticException is Child class
		{
			System.out.println("ArithmeticException found");
		}
		//child-parent order-- no compilation error
		catch(Exception e) //-->> Exception is parent class
		{
			System.out.println("Other Exceptions found");
		}
		/*//Parent-child order -- hence compiler generate error
		  catch(NullPointerException ne) //-->> NullPointerException is Child class 
		  { System.out.println("NullPointerException found"); }
		 */
		System.out.println("rest of the code executed");
	}

}
