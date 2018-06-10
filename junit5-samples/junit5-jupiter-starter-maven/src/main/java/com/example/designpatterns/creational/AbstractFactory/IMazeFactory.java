package com.example.designpatterns.creational.AbstractFactory;

import com.example.designpatterns.creational.*;

// Notice the following:
// - The factory interface is returning the generic Maze, Room, Door and Wall
//   objects, not specialized or concrete objects.  Abstract is a loose definition
//   here meaning either an interface or a base class.
// - This is the ONLY thing the client will depend on to create objects for the maze
public interface IMazeFactory
{
	public Maze MakeMaze();
	public Room MakeRoom(int roomNumber);
	public Door MakeDoor(Room room1, Room room2);
	public Wall MakeWall();
}