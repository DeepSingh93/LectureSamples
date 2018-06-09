package com.example.designpatterns.creational.AbstractFactory;

import com.example.designpatterns.creational.*;

// Notice the following:
// - The factory interface is returning the generic Maze, Room, Door and Wall
//   objects, not specialized or concrete objects.  Abstract is a loose definition
//   here meaning either an interface or a base class.
// - This is the ONLY thing the client will depend on to create objects for the maze
public interface IMazeFactory
{
	public Maze makeMaze();
	public Room makeRoom(int roomNumber);
	public Door makeDoor(Room room1, Room room2);
	public Wall makeWall();
}