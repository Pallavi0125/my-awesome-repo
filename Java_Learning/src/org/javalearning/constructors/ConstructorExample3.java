package org.javalearning.constructors;

/*Note: In this program issue is if we assign the values in constructor 
 * then whenever we will create object it will take same values.
 * To resolve this issue see next eg.ConstructorExample4
 * */
public class ConstructorExample3 {

	int eid; 
	String ename;
	float esal;
	
	ConstructorExample3(){
		 eid = 111; 
		 ename = "Emp";
		 esal = 20000.50f;
	}
	
	void display() {
		System.out.println(eid + " , " + ename + " , " + esal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample3 c1 = new ConstructorExample3();
		c1.display();
		ConstructorExample3 c2 = new ConstructorExample3();
		c2.display();

	}

}
