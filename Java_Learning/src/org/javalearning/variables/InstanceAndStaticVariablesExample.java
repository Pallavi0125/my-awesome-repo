package org.javalearning.variables;

public class InstanceAndStaticVariablesExample {
	int eid;
	String ename;
	static String ecomp;
	// Ecomp name will same for all emp hence we will use static keyword. Because static variable contains single memory for all elements. 

	public void emp(int eid, String ename, String ecomp) {
		System.out.println(eid + " " + ename + " " + ecomp );
	}
	public static void main(String[] args) {
		InstanceAndStaticVariablesExample i1  = new InstanceAndStaticVariablesExample();
		i1.emp(111, "aaa", "TCS");
		i1.emp(222, "bbb", "TCS");
		i1.emp(333, "ccc", "TCS");
		i1.emp(444, "ddd", "TCS");

	} 

}
