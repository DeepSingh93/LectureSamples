package com.example.designpatterns.creational.Builder;

import com.example.designpatterns.creational.*;

/*
	Note the following:
	- MazeBuilder is not an interface, in Java it's an abstract class. In C++ it
	  would be a virtual class with some empty methods and one pure virtual method
	  so that it can't be instantiated.  The reason it's done this way is so that
	  concrete implementations do not have to implement empty methods if they want
	  to skip one of the steps or if they have nothing to do for one of the steps.
	- Subclasses (concrete builder objects) must adhere to the Liskov Substitution
	  Principle or the Director will break.
*/
abstract public class MazeBuilder
{
	public void BuildMaze()
	{	
	}
	
	public void BuildRoom(int roomNumber)
	{
	}
	
	public void BuildDoor(int roomFrom, int roomTo)
	{
	}
	
	abstract public Maze GetMaze();
}