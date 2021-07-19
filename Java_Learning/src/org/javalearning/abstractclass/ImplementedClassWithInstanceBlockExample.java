package org.javalearning.abstractclass;

public class ImplementedClassWithInstanceBlockExample extends AbstractClassWithInstanceBlockExample{
	
	{
		System.out.println("Normal instance block");
	}
	void m1() {
		System.out.println("Normal m1()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClassWithInstanceBlockExample a = new ImplementedClassWithInstanceBlockExample();
		a.m1();
		new ImplementedClassWithInstanceBlockExample();
		new ImplementedClassWithInstanceBlockExample();
		new ImplementedClassWithInstanceBlockExample();
		new ImplementedClassWithInstanceBlockExample();
	}

}
