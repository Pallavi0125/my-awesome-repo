package org.javalearning.inheritances;

public class ParentClassConstructorExample1 {
	
	ParentClassConstructorExample1(){
		System.out.println("Parent class 0-arg constructor");
	}
	ParentClassConstructorExample1(int a){
		this();
		System.out.println("Parent class 1-args constructor");
	}
	ParentClassConstructorExample1(int a, int b){
		this(10);
		System.out.println("Parent class 2-args constructor");
	}

}
