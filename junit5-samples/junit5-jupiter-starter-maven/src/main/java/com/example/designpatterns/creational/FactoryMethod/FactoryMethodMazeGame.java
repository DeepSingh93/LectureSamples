package com.example.designpatterns.creational.FactoryMethod;

import com.example.designpatterns.creational.*;

/*
	In the Factory Method diagram this would be the Creator
*/
public class FactoryMethodMazeGame
{
	private final Maze maze;
	
	public FactoryMethodMazeGame()
	{
		maze = CreateMaze();
	}

	// Default factory method for making Maze objects.
	protected Maze MakeMaze()
	{
		return new Maze();
	}
	
	// Default factory method for making Room objects.
	protected Room MakeRoom(int roomNumber)
	{
		return new Room(roomNumber);
	}
	
	// Default factory method for making Door objects.
	protected Door MakeDoor(Room room1, Room room2)
	{
		return new Door(room1, room2);
	}
	
	// Default factory method for making Wall objects.
	protected Wall MakeWall()
	{
		return new Wall();
	}
	
	private Maze CreateMaze()
	{
		// As it stands this doesn't look much different from the original
		// MazeGame class, just the new's have been moved into methods.
		// However the power of the pattern comes into play by extending this
		// class and overriding the factory methods. See the
		// FactoryMethodExplosiveMazeGame class.  This same method will create
		// a regular maze game or an explosive maze game depending on which
		// class the client instantiates.
		Maze m = MakeMaze();
		Room r1 = MakeRoom(1);
		Room r2 = MakeRoom(2);
		Door door = MakeDoor(r1, r2);

		m.AddRoom(r1);
		m.AddRoom(r2);

		r1.SetSide(Direction.NORTH, MakeWall());
		r1.SetSide(Direction.EAST, door);
		r1.SetSide(Direction.SOUTH, MakeWall());
		r1.SetSide(Direction.WEST, MakeWall());
		
		r2.SetSide(Direction.NORTH, MakeWall());
		r2.SetSide(Direction.EAST, MakeWall());
		r2.SetSide(Direction.SOUTH, MakeWall());
		r2.SetSide(Direction.WEST, door);
		
		return m;
	}
}