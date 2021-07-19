package org.javalearning.abstractclass;

public class ImplementedClassWithStaticBlockExample extends AbstractClassWithStaticBlockExample{
	static
	{
		System.out.println("Implemented static block");
	}
	
	void m1() {
		System.out.println("Normal m1()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImplementedClassWithStaticBlockExample().m1();

	}

}
