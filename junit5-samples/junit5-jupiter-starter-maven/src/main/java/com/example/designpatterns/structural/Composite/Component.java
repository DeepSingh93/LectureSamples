package com.example.designpatterns.structural.Composite;

import java.util.ArrayList;

/*
	The component interface is the key to the design pattern in that
	it is the mechanism whereby clients can treat all nodes in the
	hierarchical structure the same.
*/
public interface Component
{
	// This operation searches the hierarchy for all nodes matching a value.
	public ArrayList<Component> Operation();
	public void Add(Component child);
	public void Remove(Component child);
	public Component GetChild(int index);
}