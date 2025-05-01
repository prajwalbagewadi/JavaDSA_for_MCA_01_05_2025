package com.prajwal.Springhello;

import com.prajwal.Springhello.Vehicle; 
public class Bike implements Vehicle{
	@Override
	public void drive() {
		System.out.println("bike running.");
	}
}
