package org.javalearning.polymorphism;

public class PolymorphismConstructorOverloadingExample {
	PolymorphismConstructorOverloadingExample(int a){
		System.out.println("0 & int args constructor");
	}
	PolymorphismConstructorOverloadingExample(int a, int b){
		System.out.println("2 & int,int args constructor");
	}
	PolymorphismConstructorOverloadingExample(char ch){
		System.out.println("1 & char args constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PolymorphismConstructorOverloadingExample(10);
		new PolymorphismConstructorOverloadingExample(10,20);
		new PolymorphismConstructorOverloadingExample('c');

	}

}
