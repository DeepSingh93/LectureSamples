package com.example.designpatterns.creational;

public class Door implements MapSite
{
	protected final Room room1;
	protected final Room room2;
	public boolean isOpen;
	
	public Door(Room room1, Room room2)
	{
		this.room1 = room1;
		this.room2 = room2;
		isOpen = false;
	}
	
	@Override
	public void Enter()
	{
		if (!isOpen)
		{
			System.out.println("Bonk!");
		}
	}
	
	public Room OtherSideFrom(Room room)
	{
		if (room.roomNumber == room1.roomNumber)
		{
			return room2;
		}
		else if (room.roomNumber == room2.roomNumber)
		{
			return room1;
		}
		return null;
	}
}