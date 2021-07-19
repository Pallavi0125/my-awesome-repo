package org.javalearning.inheritances;

public class ParentClassWithStaticBlocInstanceBlockAndConstaructorExample {
	{
		System.out.println("Parent class instance block");
	}
	
	static {
		System.out.println("Parent class Static block");
	}
	
	ParentClassWithStaticBlocInstanceBlockAndConstaructorExample(){
		System.out.println("Parent Class Constructor");
	}
	
	ParentClassWithStaticBlocInstanceBlockAndConstaructorExample(int a){
		System.out.println("Parent Class 1-arg Constructor");
	}

}
