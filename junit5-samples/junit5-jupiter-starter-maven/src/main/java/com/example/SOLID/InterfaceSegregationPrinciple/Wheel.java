package com.example.SOLID.InterfaceSegregationPrinciple;

public class Wheel
{
	public Car carWheelIsAttachedTo;
	public String brand;
	public float radius;
	public float airPressure;
	public boolean isSpinning;

	public Wheel(Car owner)
	{
		carWheelIsAttachedTo = owner;
		brand = "Michelin";
		radius = 24.0f;
		airPressure = 100.0f;
		isSpinning = false;
	}

	public void runOverNail()
	{
		airPressure = 0.0f;
		isSpinning = false;
		carWheelIsAttachedTo.turnOnDashboardLight("Flat Tire");
	}

}