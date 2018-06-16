package com.example.designpatterns.structural.Composite;

import java.util.Random;
import java.util.ArrayList;

public class Client
{
	private final Component hierarchy;
	private final Random rand;
	
	public Client()
	{
		hierarchy = new Composite();
		rand = new Random();
		AddRandomStuff(hierarchy);
		ArrayList<Component> leavesWithEvenValues = hierarchy.Operation();
		System.out.println("There were " + leavesWithEvenValues.size() + " even value leaves!");
	}
	
	private void AddRandomStuff(Component c)
	{
		AddRandomNumberLeaves(c);
		for (int i = 0; i < rand.nextInt(); i++)
		{
			Component child = new Composite();
			AddRandomStuff(child);
			c.Add(child);
		}
	}
	
	private void AddRandomNumberLeaves(Component c)
	{
		for (int i = 0; i < rand.nextInt(100); i++)
		{
			Leaf leaf = new Leaf(rand.nextInt());
			c.Add(leaf);	
		}
	}
}