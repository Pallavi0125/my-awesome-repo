package org.javalearning.stringmanipulation;

public class Example1 {
	
	/*
	 * Note:
	 *  
	 1. String and StringBuffer both are final classes and present in java.lang package.
	 * There is 2 approach to create object In String class:
	      1. WIthout using new operator    
	      2. By using new operator
	 * There is only one approach to create object in StringBuffer class. 
	     i.e By using new operator.
	 2. When we are creating object without new operator is stored in SCP area.
	 3. In SCP area always compiler will check whether same string is present in area or not.
	 4. If same string is not present then only it will store the string otherwise it will not store the duplicate string.
	 5. When we are creating object By using new operator is stored in heap area.
	 6. Heap area can store duplicate string also.
	 * In below example:
	 * s==s1 -->> True
	 * s==s2 -->> False
	 * s3==s4 -->> False
	 * s3==s5 -->> False
	 * 
	 */
	public static void main(String[] args) {
		String s = "Pallavi";
		System.out.println(s);
		String s1 = "Pallavi";
		System.out.println(s1); // here it prints the value but stores only one time.
		String s2 = "Anand";
		System.out.println(s2); 
		String s3 = new String("Ajay");
		System.out.println(s3);
		String s4 = new String("Ajay");// here it stores the string 2 times.
		System.out.println(s4);
		String s5 = new String("Juhi");
		System.out.println(s5);
		StringBuffer sb = new StringBuffer("Anand");
		System.out.println(sb);
	}

}
