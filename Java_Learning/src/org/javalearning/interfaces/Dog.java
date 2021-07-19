package org.javalearning.interfaces;

 class Dog implements Animal {

	@Override
	public void sound() {// Implementation method must be public
		System.out.println("Bark");
		
	}

	@Override
	public void eat() {
		System.out.println("Bones");
		
	}

	@Override
	public void sleep() {
		System.out.println("House");
		
	}

}
