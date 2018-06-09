package com.example.designpatterns.creational;

public class MazeGame
{
	private final Maze maze;
	
	public MazeGame()
	{
		maze = CreateMaze();
	}
	
	private Maze CreateMaze()
	{
		// You can tell just by looking at this code that it smells right?
		Maze m = new Maze();
		Room r1 = new Room(1);
		Room r2 = new Room(2);
		Door door = new Door(r1, r2);

		m.AddRoom(r1);
		m.AddRoom(r2);

		r1.SetSide(Direction.NORTH, new Wall());
		r1.SetSide(Direction.EAST, door);
		r1.SetSide(Direction.SOUTH, new Wall());
		r1.SetSide(Direction.WEST, new Wall());
		
		r2.SetSide(Direction.NORTH, new Wall());
		r2.SetSide(Direction.EAST, new Wall());
		r2.SetSide(Direction.SOUTH, new Wall());
		r2.SetSide(Direction.WEST, door);
		
		return m;
	}
}