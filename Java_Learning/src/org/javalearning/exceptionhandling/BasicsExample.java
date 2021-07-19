package org.javalearning.exceptionhandling;

/*Exception: 
 1. Exception means abnormal termination.
 2. An exception is an event which occurs during program execution 
 and terminate the flow of the program.
 3. If the program contains exception then it will terminate abnormally 
 and rest of the code will not execute.
 4. Exception can't be completely overcome but we can handle it.
 5. To handle exception we having 2 approach:
 		1. By using try/catch block
 		2. By using throws keyword
 # Exception handling: 
    It means we are proving alternative code to continue the execution of remaining code
    and to get normal termination of the application.
 NOTE: 
 Exception Handling is mainly used to handle the checked exceptions.
 If there occurs any unchecked exception such as NullPointerException, ArithmeticException etc..
 then it is programmers fault that he is not performing check up before the code being used.
 
 # Reason to occur exception: 
 	1. Developer mistakes
 	2. End-user mistakes
 	  	a. While proving input to the application
 	  	b. Whenever user enter invalid data, exception will occur
 	  	c. If the file need to be open can't found then exception occurs
 	  	d. Due to network issue in middle of work , exception occurs
 # Types of Exception:
 		1. Checked exception
 		2. Unchecked Exception
 		3. Error
 		
 # Checked Exception: 
    The exception which is checked by compiler at the time of compilation called as Checked exception.
     eg: IOException, SQLException, InterruptedException, ClassNotFoundException etc.
 # There is 2 ways to handle Checked Exception: 
 		1. By using try/catch block
 		2. By using throws keyword
 		
 # UnChecked Exception: 
    1. The exception which is not checked by compiler at the time of compilation and raised at runtime called as Unchecked exception.
     eg: ArithmeticException, ArrayIndexOutOfBoundsException, NumberFormatException etc.
    2. This exception is handled by JVM at runtime, because at run time it will give error for the occurred exception.
 # There is 2 ways to handle Checked Exception: 
 		1. By using try/catch block
 		2. By using throws keyword
 # Error:
 1. Exception occurs due to Developer mistake, end user input mistake, network problems.
    while Error occurs due to lack of system resources. 
    eg: StackOverFlowError, OutofMemoryError, AssertionError etc.
 2. We can handle exception by using try-catch block or throws keyword, 
    but Error can't be handled.
 3. Error is an unchecked type exception. 
 
 NOTE: 
 1. Exception always raised at runtime but not at compile time , 
    whether it's checked or unchecked exception.
 2. In Java both exceptions checked and unchecked exceptions must be handle by 
 using try-catch blocks or throws keyword to get normal termination 
 and to execute rest code of the application.
 3. For checked exception when we write try-catch block or throws keyword 
 then only code will compile but for unchecked exception try catch block or 
 throws keyword is optional.
 4. The root class of exception handling is Throwable class.
 5. If the root class & its all child class are checked exception 
 then that root class is called fully checked exception.
 6. If the root class contains some class with checked and some classes with unchecked exception 
 then that root class is called partially checked exception.
 
 Exception handling Keywords: 
 		1. try
 		2. catch
 		3. finally
 		4. throw
 		5. throws
*/	

public class BasicsExample {

	public static void main(String[] args) {

	}

}
