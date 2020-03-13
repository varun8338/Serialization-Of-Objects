package com.demo;

import java.io.Serializable;

public class Vehicle implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1481658533459191590L;
	private String name;
	private int number;
	public Vehicle(String name, int number) {
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", number=" + number + "]";
	}
	
	
}
