package org.javalearning.inheritances;

/*Note: 
1. In parent and child relationship 1st parent class static block will execute
   then child class static blocks will execute. 
2. Parent and child class static block will execute after.class file loading.
*/	

public class ChildClassStaticBlockExample extends ParentClassStaticBlockExample{
	static {
		System.out.println("Child class Static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
