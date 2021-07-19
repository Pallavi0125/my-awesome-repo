package org.javalearning.inheritances;

public class ParentClassInstanceBlockWithConstructorExample {
	{
		System.out.println("Parent class instance block");
	}
	
	ParentClassInstanceBlockWithConstructorExample(){
		System.out.println("Parent Class Constructor");
	}
	
	ParentClassInstanceBlockWithConstructorExample(int a){
		System.out.println("Parent Class 1-arg Constructor");
	}

}
