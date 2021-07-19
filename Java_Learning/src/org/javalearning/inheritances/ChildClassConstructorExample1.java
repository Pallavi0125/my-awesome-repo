package org.javalearning.inheritances;

public class ChildClassConstructorExample1 extends ParentClassConstructorExample1{
	ChildClassConstructorExample1(){
		this(10);
		System.out.println("Child class 0-arg constructor");
	}
	ChildClassConstructorExample1(int a){
		this(10,20);
		System.out.println("Child class 1-args constructor");
	}
	ChildClassConstructorExample1(int a, int b){
		super(10,20);
//If we don't call any parent class constructor 
//then compiler generates "super" keyword which always calling 0-arg constructor i.e: super().
		System.out.println("Child class 2-args constructor");
	}

	public static void main(String[] args) {
		new ChildClassConstructorExample1();
	}

}
