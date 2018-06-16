package com.example.designpatterns.structural.Composite;

import java.util.ArrayList;

public class Leaf implements Component
{
	private int myValue;
	
	public Leaf(int value)
	{
		myValue = value;
	}
	
	/*
		This is a silly example, I return this Leaf object in an array list by
		itself if the Leaf's value is even.
	*/
	@Override
	public ArrayList<Component> Operation()
	{
		if (myValue % 2 == 0)
		{
			ArrayList<Component> list = new ArrayList<Component>();
			list.add(this);
			return list;
		}
		return null;
	}

	@Override
	public void Add(Component child)
	{
		// Do nothing I'm a leaf node.
	}

	@Override
	public void Remove(Component child)
	{
		// Do nothing I'm a leaf node.
	}

	@Override
	public Component GetChild(int index)
	{
		// Return nothing, I'm a leaf node.
		return null;
	}
}