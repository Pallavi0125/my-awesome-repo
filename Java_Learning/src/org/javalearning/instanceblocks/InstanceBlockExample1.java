package org.javalearning.instanceblocks;

/*Instance block: 
	1. It is used to write logic which executes during object creation
	2. initialize the instance variable during object creation
	3. It will execute just before constructor execution
	4. Instance block execution depends on object creation, 
	   hence after each object creation instance block will execute just before constructor.
*/

public class InstanceBlockExample1 {
	
	InstanceBlockExample1(){
		System.out.println("0-args constructor");
	}
	InstanceBlockExample1(int a){
		System.out.println("1-args constructor");
	}
	
	InstanceBlockExample1(int a, int b){
		System.out.println("2-args constructor");
	}
	
	{
		System.out.println("instance block executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// InstanceBlockExample i = new InstanceBlockExample(); //name object
		new InstanceBlockExample1(); // nameless object
		new InstanceBlockExample1(10);
		new InstanceBlockExample1(10,20);

	}

}
