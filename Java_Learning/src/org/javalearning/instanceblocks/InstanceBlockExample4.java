package org.javalearning.instanceblocks;

public class InstanceBlockExample4 {
	
	int eid;
	
	{
		eid = 111; // initializing the variable during object creation
	}
	
	void display()	{
		
		System.out.println("eid value is: " + eid);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InstanceBlockExample4().display();

	}

} 
//output: eid value is: 111

/* Without initializing variable 
 * public class InstanceBlockExample4 {
 * 
 * int eid;
 * 
 * void display() {
 * 
 * System.out.println("eid value is: " + eid);
 * 
 * } public static void main(String[] args) { // TODO Auto-generated method stub
 * new InstanceBlockExample4().display();
 * 
 * }
 * 
 * }
 * 
 * output: eid value is: 0-->> default value
 */
