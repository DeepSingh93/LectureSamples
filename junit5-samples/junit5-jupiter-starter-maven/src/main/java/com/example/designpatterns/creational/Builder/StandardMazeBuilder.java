package com.example.designpatterns.creational.Builder;

import com.example.designpatterns.creational.*;
import java.util.Random;

/*
	Take note that this StandardMazeBuilder has the freedom
	to choose what kind of Maze it builds, and how it builds it.
	It could build a maze with some regular rooms and some explosive
	rooms for example, it has complete power over the construction.
*/
public class StandardMazeBuilder extends MazeBuilder
{
	private Maze maze;
	
	public StandardMazeBuilder()
	{
		maze = null;
	}
	
	public void BuildMaze()
	{		
		maze = new Maze();
	}
	
	public void BuildRoom(int roomNumber)
	{
		// Make sure the maze has been built, and this room
		// hasn't already been added.
		assert(maze != null);
		assert(maze.GetRoom(roomNumber) == null);
		Room room = new Room(roomNumber);
		maze.AddRoom(room);
		// The room is walled off until the director builds doors.
		room.SetSide(Direction.NORTH, new Wall());
		room.SetSide(Direction.SOUTH, new Wall());
		room.SetSide(Direction.EAST, new Wall());
		room.SetSide(Direction.WEST, new Wall());
	}
	
	public void BuildDoor(int roomFrom, int roomTo)
	{
		assert(maze != null);
		Room room1 = maze.GetRoom(roomFrom);
		Room room2 = maze.GetRoom(roomTo);
		if (room1 != null && room2 != null)
		{
			Door door = new Door(room1, room2);
			// Pick a random side for the door.
			Random random = new Random();
			float rand = random.nextFloat();
			if (rand < 0.25f)
			{
				room1.SetSide(Direction.NORTH, door);
				room2.SetSide(Direction.SOUTH, door);		
			}
			else if (rand < 0.5f)
			{
				room1.SetSide(Direction.SOUTH, door);
				room2.SetSide(Direction.NORTH, door);		
			}
			else if (rand < 0.75f)
			{
				room1.SetSide(Direction.EAST, door);
				room2.SetSide(Direction.WEST, door);		
			}
			else
			{
				room1.SetSide(Direction.WEST, door);
				room2.SetSide(Direction.EAST, door);		
			}
		}
	}

	@Override
	public Maze GetMaze()
	{
		Maze maze = new Maze();
		return maze;
	}
	
	/*
			
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

	*/
}