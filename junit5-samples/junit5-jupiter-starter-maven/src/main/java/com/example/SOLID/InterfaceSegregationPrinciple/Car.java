package com.example.SOLID.InterfaceSegregationPrinciple;

public class Car
{
	public Wheel[] wheels;
	public Door[] doors;
	public boolean isMoving;

	public Car()
	{
		wheels = new Wheel[4];
		doors = new Door[4];
		for (int i = 0; i < 4; i++)
		{
			Wheel wheel = new Wheel(this);
			wheels[i] = wheel;
			Door door = new Door(this);
			doors[i] = door;
		}
		isMoving = true;
	}

	public void turnOnDashboardLight(String lightName)
	{
		// Turn on some light matching a name.
		System.out.println("Turning on " + lightName + " warning light.");
	}
}
