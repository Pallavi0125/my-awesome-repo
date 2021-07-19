package org.javalearning.interfaces;

 class Lion implements Animal {

	@Override
	public void sound() {
		System.out.println("Roar");
		
	}

	@Override
	public void eat() {
		System.out.println("Non-veg");
		
	}

	@Override
	public void sleep() {
		System.out.println("Den");
		
	}

}
