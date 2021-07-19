package org.javalearning.stringmanipulation;

/*NOTE:
  1. String Class overrides equals method of object class hence it performs content comparison.
  2. StringBuffer class doesn't override equals method of object class 
     hence it executes object class equals method and object class equals method performs reference comparison.
  3. To check Java Object class method Command is: 
    	javap java.lang.Object
*/
public class EqualsMethodExample {

	public EqualsMethodExample(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// String class overrides  and perform content comparison
		String s1 = "Pallavi";
		String s2 = "Pallavi";
		System.out.println(s1.equals(s2));
		
		//Object class----------> Reference - comparison
		EqualsMethodExample e1 = new EqualsMethodExample("Ajay");
		EqualsMethodExample e2 = new EqualsMethodExample("Ajay");
		System.out.println(e1.equals(e2));
		
		//StringBuffer class doesn't overriding -----> Reference - comparison
		StringBuffer sb1 = new StringBuffer("Anand");
		StringBuffer sb2 = new StringBuffer("Anand");
		System.out.println(sb1.equals(sb2));
	}
}

/*
 * class Object{
      public boolean equals(){
      	 returns "ref-com";
      } 
  }
  
   class String extends Object{
     // overriding the method
      public boolean equals(){
      	 returns "content-com";
      }  
   }
   
   class StringBuffer extends Object{
      doesn't override equals method hence Object class equals method will execute and 
      returns "ref-com". 
  }
 */












