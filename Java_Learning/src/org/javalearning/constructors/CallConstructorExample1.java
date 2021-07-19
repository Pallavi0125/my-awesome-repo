package org.javalearning.constructors;

public class CallConstructorExample1 {
	
	CallConstructorExample1(){
		System.out.println("0-args constructor");
		
	}
	
	CallConstructorExample1(int a){
		System.out.println("1-args constructor");
		
	}
	
	CallConstructorExample1(int a, int b){
		System.out.println("2-args constructor");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallConstructorExample1 c1 = new CallConstructorExample1();
		CallConstructorExample1 c2 = new CallConstructorExample1(10);
		CallConstructorExample1 c3 = new CallConstructorExample1(10,20);


	}

}
