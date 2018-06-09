package com.example.designpatterns.creational.AbstractFactory;

import com.example.designpatterns.creational.*;
import java.util.Random;

public class ExplosiveWall extends Wall
{
	private final boolean isExplosive;

	public ExplosiveWall()
	{
		super();
		Random random = new Random();
		// 1% of ExplosiveRooms are explosive!
		isExplosive = (random.nextFloat() <= 0.01f);
	}
	
	@Override
	public void Enter()
	{
		if (isExplosive)
		{
			System.out.println("EXPLOSIVE WALL KABOOOOM!");
		}
		else
		{
			super.Enter();
		}
	}
}