package org.javalearning.stringmanipulation;

/*toString():
 1. This method present in object class and it returns a string object.(eg: classname@hashcode) 
 2. String/StringBuffer is child class of Object class and it is overriding toString()
    to return String object/StringBuffer object.
 NOTE:  Whenever we are printing any type of reference variable in java,
  		internally compiler called toString() method.
 */
public class toStringExample1 {

	public static void main(String[] args) {
		toStringExample1 t = new toStringExample1();
		System.out.println(t);// internally compiler will call toString() method.		
		// both syso are same.
		System.out.println(t.toString());

	}

}
