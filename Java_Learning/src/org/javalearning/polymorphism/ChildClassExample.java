package org.javalearning.polymorphism;

public class ChildClassExample extends ParentClassExample{

	void m1() {
		System.out.println("Child class m1() method");
	}
	
	void m2() {
		System.out.println("Child class m2() method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClassExample p = new ChildClassExample();
		p.m1(); 
// While compilation compiler will check m1()
//method in parent class then at runtime it will check method in child class.		
//p.m2(); -->> it will give compilation error 
//because we have created child object with the reference of parent class
//and m2() method is not present in parent class.
		/* not preferred
		 * ChildClassExample c = new ChildClassExample(); c.m2();
		 */
		ChildClassExample c = (ChildClassExample)p;
		c.m2();
	}

}
