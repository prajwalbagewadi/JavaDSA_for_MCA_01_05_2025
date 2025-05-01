package com.prajwal.Springhello;
import com.prajwal.Springhello.Vehicle;

public class Car implements Vehicle{
	@Override
	public void drive() {
		System.out.println("Car running.");
	}
}
