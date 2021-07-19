package org.javalearning.constructors;

public class ConstructorExample2 {
	
	int eid;
	String ename;
	float esal;
	
	// Constructor is used to initialize the instance variable during object creation.
	ConstructorExample2(){
		 eid = 111;
		 ename = "Emp";
		 esal = 20000.50f;
	}

	void display() {
		System.out.println(eid + " , " + ename + " , " + esal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample2 c = new ConstructorExample2();
		c.display();
	}

}

/* Without constructor block if method will execute in below eg, then default value will assign to the variables.
 * public class ConstructorExample2 {
 * 
 * int eid; String ename; float esal;
 * 
 * void m1() { System.out.println(eid + " , " + ename + " , " + esal); }
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * ConstructorExample2 c = new ConstructorExample2(); c.m1(); }
 * 
 * }
 * Output:  0 , null , 0.0
 */












