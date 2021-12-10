package com.qa.enums;

public class Runner {

	public static void main(String[] args) {
		
		double earthGrav = Planet.EARTH.surfaceGravity();
		
//		System.out.println(earthGrav);
		
		for (Planet p : Planet.values()) {
			System.out.println("The mass of " + p + " is: " + p.getMass());
		}
	}
}
