package org.javalearning.stringmanipulation;

/*Note:
  1. Strings are immutable in nature and changes in same object not allowed.
  2. StringBuffers are mutable in nature and change in same object is allowed.
  
*/
public class Example2 {

	public static void main(String[] args) {
		String s = "Pallavi";
		s.concat(" Anand"); // change not allowed due to Strings are immutable in nature.
		System.out.println(s);
		String s1 = s.concat(" Anand");
		System.out.println(s1);// now change will allow bcz value stored in new variable.
		StringBuffer sb = new StringBuffer("Ajay");
		sb.append(" Anand");
		System.out.println(sb);

	}

}
