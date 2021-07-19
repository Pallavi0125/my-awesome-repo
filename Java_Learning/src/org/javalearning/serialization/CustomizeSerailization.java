package org.javalearning.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CustomizeSerailization {

	private static final String DOG_CODE="DOG_AUST";
	
	public static void main(String[] args) throws Exception{
		Dog dog1 = new Dog("Bruno",new Breed("Husky","Australia"),23,DOG_CODE,432);
		FileOutputStream fos = new FileOutputStream("customized_dogs.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(dog1);//in case of customized serialization, the writeObject() method defined in the Dog class.
		
		oos.close();//closing the opened resources
	}

}
