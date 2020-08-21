package com.myjava.java0402.ocp.lab07;

public class Tiger extends Cat {
 
	public Tiger(String name) {
            super(name);
	}
	 
	public void shout() {
            System.out.println("吼");
	}
	 
	public void hunt(String hunted) {
            System.out.println("獵殺"+hunted);
	}
	 
}
 
