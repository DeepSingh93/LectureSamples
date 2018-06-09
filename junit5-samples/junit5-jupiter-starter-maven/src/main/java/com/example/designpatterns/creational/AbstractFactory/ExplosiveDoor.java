package com.example.designpatterns.creational.AbstractFactory;

import com.example.designpatterns.creational.*;
import java.util.Random;

public class ExplosiveDoor extends Door
{
	private final boolean isExplosive;
	
	public ExplosiveDoor(Room room1, Room room2)
	{
		super(room1, room2);
		Random random = new Random();
		// 5% of ExplosiveDoors are explosive!
		isExplosive = (random.nextFloat() <= 0.05f);
	}
	
	@Override
	public void Enter()
	{
		if (isExplosive && !isOpen)
		{
			System.out.println("EXPLOSIVE DOOR KABOOOMY!");
		}
		else
		{
			super.Enter();
		}
	}
}
