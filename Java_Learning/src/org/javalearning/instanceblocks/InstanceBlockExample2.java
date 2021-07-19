package org.javalearning.instanceblocks;

public class InstanceBlockExample2 {
	
	InstanceBlockExample2(){
		System.out.println("0-args constructor");
	}
	InstanceBlockExample2(int a){
		System.out.println("1-args constructor");
	}
		
	{
		System.out.println("1st instance block executed");
	}
	
	{
		System.out.println("2nd instance block executed");
	}

	public static void main(String[] args) {
		new InstanceBlockExample2();
		new InstanceBlockExample2(10);

	}

}
