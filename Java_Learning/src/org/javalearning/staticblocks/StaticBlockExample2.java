package org.javalearning.staticblocks;

public class StaticBlockExample2 {
	
	static {
		System.out.println("Static block with main method class");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("Demo1");
		Class.forName("Demo2");
	}

}
