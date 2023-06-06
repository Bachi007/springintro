package com.springintro;

public class bike implements vehicle{

	private int id;
	private String name;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void drive() {
		System.out.println("I can go by Bike");
	}
	
}
