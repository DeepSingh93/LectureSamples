package com.example.designpatterns.creational.FactoryMethod;

import com.example.designpatterns.creational.*;
import com.example.designpatterns.creational.AbstractFactory.*;

/*
	This class changes the behaviour of the game ONLY by overriding
	the factory methods!  All the rest of the functionality stays the
	same.  It doesn't even have to override ALL of the factory methods
	just the ones it needs to turn the game from a regular maze game
	to an explosive maze game.

	In the Factory Method diagram this would be the ConcreteCreator
	and the ExplosiveRoom, ExplosiveDoor and ExplosiveWall objects
	are the concrete products.
*/
public class FactoryMethodExplosiveMazeGame extends FactoryMethodMazeGame
{	
	// Factory method for making EXPLOSIVE Room objects.
	@Override
	protected Room MakeRoom(int roomNumber)
	{
		return new ExplosiveRoom(roomNumber);
	}
	
	// Factory method for making EXPLOSIVE Door objects.
	@Override
	protected Door MakeDoor(Room room1, Room room2)
	{
		return new ExplosiveDoor(room1, room2);
	}
	
	// Factory method for making EXPLOSIVE Wall objects.
	@Override
	protected Wall MakeWall()
	{
		return new ExplosiveWall();
	}
}