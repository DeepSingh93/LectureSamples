package com.example.designpatterns.structural.Composite;

import java.util.ArrayList;

/*
	The Composite class is a container that holds many
	Component objects.  Operation() calls are done to every
	child in the container.
*/
public class Composite implements Component
{
	private ArrayList<Component> children;

	public Composite()
	{
		children = new ArrayList<Component>();
	}
	
	// The Composite operation here iterates through its children calling Operation()
	// to build a set of results from all its children.
	@Override
	public ArrayList<Component> Operation()
	{
		ArrayList<Component> results = new ArrayList<Component>();
		for (int i = 0; i < children.size(); i++)
		{
			Component child = GetChild(i);
			ArrayList<Component> childResults = child.Operation();
			if (null != childResults)
			{
				results.addAll(childResults);
			}
		}
		return results;
	}

	@Override
	public void Add(Component child)
	{
		children.add(child);
	}

	@Override
	public void Remove(Component child)
	{
		children.remove(child);
	}

	@Override
	public Component GetChild(int index)
	{
		return children.get(index);
	}
}