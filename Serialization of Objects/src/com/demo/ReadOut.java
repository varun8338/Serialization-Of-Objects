package com.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadOut {

	public static void main(String[] args) {
		
		
		try(FileInputStream fio = new FileInputStream("vehicles.dat")){
			try(ObjectInputStream o = new ObjectInputStream(fio))
			{
				try {
					Vehicle v1 = (Vehicle)o.readObject();
					Vehicle v2 = (Vehicle)o.readObject();
					System.out.println("Object of v1 is "+v1);
					System.out.println("Object of v2 is "+v2);
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
