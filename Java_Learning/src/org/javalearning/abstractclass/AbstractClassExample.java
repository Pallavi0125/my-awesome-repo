package org.javalearning.abstractclass;

/*Abstract class: 
 * Abstract class may contain abstract method or may not contain abstract methods
 * But object creation is not possible for the abstract class.
 * There is 2 types of class: 
 * 1. Normal class : Java ordinary class
 * 2. Abstract class
 * Normal method: It contains declaration as well as implementation.
 * Abstract method:  It contains only declaration and end with semicolon(;).
 * Note: 
 * 1. If any method inside the class is abstract then class must be abstract.
 * 2. Abstract modifier is applicable for methods and classes but not for variables.
 * 3. Abstract class without abstract modifier gives error.
 * 4. In abstract class we can add main method also.
 * 5. Inside abstract class, constructor, instance block & static block is possible to add.
*/	

public abstract class AbstractClassExample {

	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4() {System.out.println("m4 normal method");}

}
	