package com.jorawar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Jorawar_Singh\\dev_practice\\java\\rminds\\SerializationThing\\SerialTest.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Employee e1 = new Employee(23,"Aman",23000,444);
			oos.writeObject(e1);
			oos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("C:\\\\Jorawar_Singh\\\\dev_practice\\\\java\\\\rminds\\\\SerializationThing\\\\SerialTest.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee readEmployee = (Employee) ois.readObject();
			
			ois.close();
			System.out.println(readEmployee.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
