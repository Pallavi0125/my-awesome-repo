package org.javalearning.abstractclass;

public class ImplementedClassWithConstructorExample extends AbstractClassWithConstructorExample{
	
	void m1() {
		System.out.println("Normal m1()");
	}
	
	ImplementedClassWithConstructorExample(){
		super();
		System.out.println("Implemented 0-args constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClassWithConstructorExample a = new ImplementedClassWithConstructorExample();
		a.m1();

	}

}
