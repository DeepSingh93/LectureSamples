package com.example.designpatterns.creational.AbstractFactory;

import com.example.designpatterns.creational.*;

public class ExplosiveMazeFactory implements IMazeFactory
{
	// The following class member variable and class method implement a Singleton.
	private static ExplosiveMazeFactory explosiveMazeFactorySingleton = null;
	
	public static IMazeFactory FactorySingleton()
	{
		if (explosiveMazeFactorySingleton == null)
		{
			explosiveMazeFactorySingleton = new ExplosiveMazeFactory();
		}
		return explosiveMazeFactorySingleton;
	}
	
	/*
		The following methods will be the ONLY place in the program where
		concrete classes are instantiated for the maze game.  This is where
		the good OOP design pattern magic is happening.
	*/
	@Override
	public Maze MakeMaze()
	{
		// I don't need a special Maze object, I'll just return the base one.
		return new Maze();
	}

	@Override
	public Room MakeRoom(int roomNumber)
	{
		return new ExplosiveRoom(roomNumber);
	}

	@Override
	public Door MakeDoor(Room room1, Room room2)
	{
		return new ExplosiveDoor(room1, room2);
	}

	@Override
	public Wall MakeWall()
	{
		return new ExplosiveWall();
	}
}