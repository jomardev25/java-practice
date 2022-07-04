package com.howtodoinjava.creational.singleton;

import java.io.ObjectOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.howtodoinjava.creational.singleton.problem.DemoSingleton;

public class Main {

	static DemoSingleton instanceOne = DemoSingleton.getInstance();

	public static void main(String[] args) {

		try {
			String workingDir = System.getProperty("user.dir");
			// Serialize to a file
			File file = new File(workingDir + "/resources/DemoSingleton.ser");
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream(file));
			out.writeObject(instanceOne);
			out.close();

			instanceOne.setI(20);

			// De-serialize to a file
			ObjectInput in = new ObjectInputStream(new FileInputStream(file));
			DemoSingleton instanceTwo = (DemoSingleton) in.readObject();
			in.close();

			System.out.println(instanceOne.getI());
			System.out.println(instanceTwo.getI());

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
