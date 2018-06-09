package com.example.designpatterns.creational;

public class Room implements MapSite
{
	protected final MapSite[] sides;
	public final int roomNumber;
	
	public Room(int roomNumber)
	{
		 sides = new MapSite[Direction.NUM_DIRECTIONS];
		 this.roomNumber = roomNumber;
	}

	@Override
	public void Enter()
	{
		System.out.println("Entered room: " + Integer.toString(roomNumber));
	}
	
	public MapSite GetSide(int direction)
	{
		return sides[direction];
	}
	
	public void SetSide(int direction, MapSite site)
	{
		sides[direction] = site;
	}
}