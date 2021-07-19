package org.javalearning.constructors;

public class CallConstructorExample2 {
	//Call constructor inside constructor
	CallConstructorExample2(){
		this(10); // must be 1st statement
		System.out.println("0-args constructor");
		
	}
	
	CallConstructorExample2(int a){
		this(10,20);
		System.out.println("1-args constructor");
		
	}
	
	CallConstructorExample2(int a, int b){
		System.out.println("2-args constructor");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallConstructorExample2 c1 = new CallConstructorExample2();
	}

}
