package org.javalearning.exceptionhandling;

/*Note:
  	Syntax:  try{
  					exceptional code;
  				} 
  			 catch(ExceptionName reference_variable)
  				{
  					Code to run if an exception is raised (alternate code);
  				}
  	Application with try-catch block: 
  	#1 Whenever the exception is raised in try block JVM won't terminate the program 
  	  and it will search for respective catch block.
  		1. If the catch block is matched with exception then that block will execute
  		   and rest of the code also execute and program will terminate normally.
  		2. If catch block doesn't match with exception then program will terminate abnormally.
   #2 If there is no exception in try block then corresponding catch block will not checked and 
   execute.
   #3 In exception handling, try block doesn't allowed without catch block or finally block.
   	 Any one is mandatory either try-catch or try-finally or try-catch-finally.
   #4 In between try-catch block it is not possible to write any code/statements, 
   if we write any statement between try-catch block,then compiler will generate error message. 
   #5 If exception raised in try block jvm will search for corresponding catch block,
   and if catch block or other than try-catch block also contains exception 
   then program will terminate abnormally.
   #6 If the exception raised in try block then rest code of try block won't be execute.
   Once the control came out of try block again it will never enter the try block.
   Don't write normal code in try block because there is no guarantee, 
   that all statement of try block will execute or not. (see TryCatchBlockExample2)
   #7 There is possible to write multiple catch blocks with single try block.
   because the way of handling the exception is varied from exception to the exception.
   (see TryCatchBlockExample3)
   #8 By using Exception class catch block can hold any type of exceptions.
   (see TryCatchBlockExample4)
   #9 If we declare multiple catch blocks then order must be child-parent,
   but if we are declaring parent to child, compiler will generate error message.
   (see TryCatchBlockExample5)
*/	
public class TryCatchBlockExample1 {

	public static void main(String[] args) {
		System.out.println("Java");
		try {
			System.out.println(10/0);
		}
		//System.out.println("Java");-->>Not possible to write statement between try-catch block(see #4)
		catch(ArithmeticException ae) 
		{ System.out.println(10/2); }
		 
		/*catch(NullPointerException ne) {
			System.out.println(10/2);
		}*/
		/*See #1 -- 2nd point
		 * In this catch block exception doen't matched hence it will terminate
		 * program abnormally and get exception.
		 * output: Exception in thread "main"
		 * Java java.lang.ArithmeticException: / by zero at
		 * org.javalearning.exceptionhandling.TryCatchBlockExample1.main(
		 * TryCatchBlockExample1.java:23)
		 */
		
		/* see #5
		 * catch(ArithmeticException ae) { System.out.println(10/0); }    
		 * catch block also contains exception, hence program will terminate abnormally.                      
		 */
		
		System.out.println("rest of the application");
	}
}
