package com.example.designpatterns.creational;

import java.util.ArrayList;

public class Maze
{
	protected ArrayList<Room> rooms;

	public Maze()
	{
		rooms = new ArrayList<Room>();
	}
	
	public void AddRoom(Room room)
	{
		rooms.add(room);
	}
	
	public Room GetRoom(int roomNumber)
	{
		for (int i = 0; i < rooms.size(); i++)
		{
			if (rooms.get(i).roomNumber == roomNumber)
			{
				return rooms.get(i);
			}
		}
		return null;
	}
}