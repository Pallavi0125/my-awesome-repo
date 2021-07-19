package org.javalearning.staticblocks;

/*Static block:
 1. It is use to write logic which executes during .class file loading
 2. .class file loaded only one time hence static blocks are executed once per class.
 3. Static block depends on .class file loading while instance block depends on object creation.
 4. Static block executed before instance block and constructor. 
*/

public class StaticBlockExample1 {
	
	{
		System.out.println("Instance block-1");
	}
	
	{
		System.out.println("Instance block-2");
	}
	
	StaticBlockExample1(){
		System.out.println("0-args constructor");
	}
	
	StaticBlockExample1(int a){
		System.out.println("1-args constructor");
	}
	
	static {
		System.out.println("Static block-1");
	}

	static {
		System.out.println("Static block-2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StaticBlockExample1();
		new StaticBlockExample1(10);

	}

}
