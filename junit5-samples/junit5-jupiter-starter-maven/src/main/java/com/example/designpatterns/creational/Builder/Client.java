package com.example.designpatterns.creational.Builder;

import com.example.designpatterns.creational.*;

/*
	The Client class instantiates the Director class with the specific
	builder it wants the Director to use, then asks the Director
	to use the builder to build the kind of maze it wants.

	Pay attention to the fact that the Client has no idea how anything
	is done, all it knows is that it wants a certain kind of maze, and
	the director and Builder will take care of the details.
*/
public class Client
{
	private Maze maze;
	private MazeBuilder builder;
	private BuilderMazeGame game;

	public Client()
	{
		builder = new StandardMazeBuilder();
		game = new BuilderMazeGame(builder);
	}
	
	public void PlaySimpleGame()
	{
		// Build a simple maze
		maze = game.CreateMaze();
	}
	
	public void PlayDifficultGame()
	{
		// Now build a big maze!
		maze = game.CreateLargeMaze(10000);
	}
}