package com.myjava.java0402.ocp.lab07;

public class Animal {
 
	private String namee;
	 
	public  Animal() {
            namee = "動物";
	}
	 
	public  Animal(String name) {
            this.namee = name;
	}
	 
	public String getName() {
		return namee;
	}
	 
	public void shout() {
            System.out.println("叫");
	}
	 
}
 
