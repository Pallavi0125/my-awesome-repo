package org.javalearning.variables;

public class VariablesExample {

	/* Local variable--  scope within method
	 * Scope: Within method */
	/* Static variable--  scope within class outside methods, start with static modifier and can access using class name
	 * Scope: Within class
	 * Memory: Static variable consume single memory for the multiple variables*/
	/* Instance variable--  scope within class outside methods and can access using class object
	 * Scope: Within class
	 * Memory: It contains separate memory for each variables*/
	
	static String s = "This is Static variable";//static variable- memory allocated while .class loading, and memory released while .class unloading
	float f = 12.5f ;// instance variable - memory allocated while object creation
	
	//Instance method
	public void localVar() {
		//instance area
		int a = 10;//local variable
		int b = 20;//local variable
		System.out.println(a+b);
		System.out.println("Print float value in instance area : " + f);
		System.out.println("Print string value in instance area : " + s);
	}
	 
	//Static method
	public static void main(String[] args) {
		//static area
		VariablesExample v = new VariablesExample();
		v.localVar();
		System.out.println("Print string value in static area : " + VariablesExample.s);
		System.out.println("Print float value in static area : " + v.f);

	}

}
