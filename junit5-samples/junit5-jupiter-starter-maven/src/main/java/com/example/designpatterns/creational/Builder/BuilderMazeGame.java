package com.example.designpatterns.creational.Builder;

import com.example.designpatterns.creational.*;

/*
	In this package the BuilderMazeGame class is the "Director",
	we use dependency injection to inject the builder we want this
	class to use.
*/
public class BuilderMazeGame
{
	private final MazeBuilder builder;

	public BuilderMazeGame(MazeBuilder builder)
	{
		this.builder = builder;
	}
	
	public Maze CreateMaze()
	{
		// Compare and contrast this method with AbstractFactoryMazeGame.CreateMaze()
		// Notice how all the complexity involved in the internal construction of the
		// Maze object has been moved to the StandardMazeBuilder object.  We have
		// hidden the internal representation of the Maze object from this class.
		// This class has no idea that the Maze object has an AddRoom() method, or
		// that Rooms have a SetSide() method.  That is all the business of the builder.
		builder.BuildMaze();
		builder.BuildRoom(1);
		builder.BuildRoom(2);
		builder.BuildDoor(1, 2);
		return builder.GetMaze();
	}
	
	public Maze CreateLargeMaze(int numberOfRooms)
	{
		// Here the director is using its knowledge of the Builder interface
		// to construct a very large maze.  It can do this with the same builder
		// CreateMaze() uses because the interface is common and the rules have
		// not changed.
		builder.BuildMaze();
		int numIterations = numberOfRooms / 2;
		for (int i = 0; i < numIterations; i++)
		{
			int nextRoom = i + 1;
			builder.BuildRoom(i);
			builder.BuildRoom(nextRoom);
			builder.BuildDoor(i, nextRoom);
		}
		return builder.GetMaze();
	}
}