package com.example.SOLID.InterfaceSegregationPrinciple;

public class Door
{
	public Car carDoorIsAttachedTo;
	public boolean isOpen;

	public Door(Car owner)
	{
		carDoorIsAttachedTo = owner;
		isOpen = false;
	}

	public void openDoor()
	{
		isOpen = true;
		boolean tiresAreSpinning = false;
		for (int i = 0; i < 4; i++)
		{
			if (carDoorIsAttachedTo.wheels[i].isSpinning)
			{
				tiresAreSpinning = true;
			}
		}
		if (carDoorIsAttachedTo.isMoving || tiresAreSpinning)
		{
			carDoorIsAttachedTo.turnOnDashboardLight("Door Ajar");
		}
	}
}