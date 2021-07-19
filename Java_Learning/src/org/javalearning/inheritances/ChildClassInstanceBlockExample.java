package org.javalearning.inheritances;

/*Note: 
   1. In parent and child relationship 1st parent class instance block will execute
      then child class instance blocks will execute. 
   2. Parent and child class instance block execution will depends on object creation.
*/	
public class ChildClassInstanceBlockExample extends ParentClassInstanceBlockExample {
	{
		System.out.println("Child class instance block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new ChildClassInstanceBlockExample();
		 new ChildClassInstanceBlockExample();
	}

}
