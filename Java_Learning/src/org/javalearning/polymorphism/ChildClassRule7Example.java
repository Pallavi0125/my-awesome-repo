package org.javalearning.polymorphism;

public class ChildClassRule7Example extends ParentClassRule7Example{
	//Same level hence no error
	void m() {
		System.out.println("Child m()");
	}
	//Increasing the order hence no error
	// Public can access any package
	//Protected can access within package and outside of the package using parent-child relationship
	public void m1() {
		System.out.println("Child m1()");
	}
	/* Decreasing the order hence it will give compilation error
	 * protected void m2() { System.out.println("Child m2()"); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClassRule7Example p = new ChildClassRule7Example();
		p.m();
		p.m1();

	}

}
