package org.javalearning.constructors;

public class ConstructorExample4 {
	//instance variables
	int eid;
	String ename;
	float esal;
	
	/* Here "this" keyword converts local variable to instance variable 
	 * Without "this" keyword display method will print default value of variables because in constructor we are passing local variable in below eg.
	 * */
	ConstructorExample4(int eid, String ename, float esal) // local variable
	{
		// Here "this" keyword converts local variable to instance variable 
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	
	void display() {
		System.out.println(eid + " , " + ename + " , " + esal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample4 c1 = new ConstructorExample4(111, "Emp1", 20000.50f);
		c1.display();
		ConstructorExample4 c2 = new ConstructorExample4(222, "Emp2", 40000.50f);
		c2.display();

	}

}


/* Without "this" keyword 
 * public class ConstructorExample3 { //instance variables int eid; String
 * ename; float esal;
 * 
 * ConstructorExample3(int eid, String ename, float esal) // local variable {
 * 
 * }
 * 
 * void display() { System.out.println(eid + " , " + ename + " , " + esal); }
 * 
 * public static void main(String[] args) { 
 * ConstructorExample3 c1 = new ConstructorExample3(111, "Emp1", 20000.50f);
 * c1.display(); 
 * ConstructorExample3 c2 = new ConstructorExample3(222, "Emp2", 40000.50f); 
 * c2.display();
 * 
 * }
 * 
 * }
 * Output:  0 , null , 0.0
 *          0 , null , 0.0
 * 
 */














