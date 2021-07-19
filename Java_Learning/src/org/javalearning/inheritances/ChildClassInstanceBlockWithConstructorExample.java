package org.javalearning.inheritances;

/*Note: 
1. In parent-child relationship 1stly Parent instance block and constructor will execute 
   then child instance block and constructor will execute.
2. Parent and child class instance block and constructor execution will depends on object creation.
*/	

public class ChildClassInstanceBlockWithConstructorExample extends ParentClassInstanceBlockWithConstructorExample{
	{
		System.out.println("Child class instance block");
	}
	
	ChildClassInstanceBlockWithConstructorExample(){
		System.out.println("Child Class 0-arg Constructor");
	}
	ChildClassInstanceBlockWithConstructorExample(int a){
		super(10);
		System.out.println("Child Class 1-arg Constructor");
	}

	public static void main(String[] args) {
		new ChildClassInstanceBlockWithConstructorExample();
		new ChildClassInstanceBlockWithConstructorExample(10);
	}

}
