package com.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteIn {

	
	public static void main(String[] args) {
		Vehicle car = new Vehicle("Car", 82959);
		Vehicle bike = new Vehicle("Bike",45660);
		
		File file = new File("vehicles.dat");
	    try
	    {
	    	file.createNewFile();
	    }
		catch (Exception e) {
			System.out.println("Error");
		}
	    
	    try(FileOutputStream fos = new FileOutputStream(file))
	    {
	    	try(ObjectOutputStream o = new ObjectOutputStream(fos))
	    	{
	    		o.writeObject(car);
	    		o.writeObject(bike);
	    		System.out.println("Object Written successfully");
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
