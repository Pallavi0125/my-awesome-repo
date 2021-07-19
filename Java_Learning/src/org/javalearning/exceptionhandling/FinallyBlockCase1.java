package org.javalearning.exceptionhandling;

/*NOTE: 
  	1. Finally block always execute irrespective of try-catch block.
  	2. It is used to provide clean-up code: 
  			a. Database connection closing   eg: Connection.close();
  			b. streams closing               eg: Scanner.close();
  			c. Object destruction            eg: Test t = new Test(); t = null;
  	3. It is not possible to write finally block alone: 
  			a. try-catch-finally -->> Valid
  			b. try-catch -->> Valid
  			c. try-catch-catch-finally -->>Valid
  			d. try-finally -->> Valid
  			e. catch-finally -->> Invalid
  			f. catch-catch-finally -->> Invalid
  			g. Try -->> Invalid
  			h. Catch -->> Invalid
  			i. Finally -->> Invalid
 
 Syntax:-
 			try
 			{  risky code;
 			}
 			catch()
 			{ code to be run if the exception raised (handling code);
 			}
 			finally
 			{ Clean-up code; (database connection closing , streams closing---- etc)
 			}
 			
 There is 2 cases in which finally block will not execute: 
 	Case1. Without try block finally block will not execute,
 	   whenever the control enter into try block then only finally block will execute.
 	Case2. In program if we used System.exit(0), 
 	   then the JVM will shutdown and rest of the code will not execute.
*/

public class FinallyBlockCase1 {
//Case1
	public static void main(String[] args) {
		System.out.println(10/0);
		try 
		{ 
			System.out.println("Try block");
		}
		finally 
		{
			System.out.println("finally block");
		}
		System.out.println("rest of the code");
	}

}
