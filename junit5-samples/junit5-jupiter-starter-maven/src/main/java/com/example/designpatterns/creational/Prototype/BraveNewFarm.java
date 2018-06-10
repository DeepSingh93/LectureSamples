package com.example.designpatterns.creational.Prototype;

import java.util.ArrayList;

public class BraveNewFarm
{
	private IAnimalFactory factory;
	private ArrayList<Animal> farmAnimals;
	
	public void CreateCloneAPalooza(Sheep dolly, Pig oinkyoink)
	{
		factory = new CloneFactory(dolly);
		farmAnimals = new ArrayList<Animal>();
		// Create a million Sheep
		MakeOneMillionAnimals();
		// Create a million pigs
		factory = new CloneFactory(oinkyoink);
		MakeOneMillionAnimals();
	}
	
	public void MakeOneMillionAnimals()
	{
		// This will use a factory to make 1 million clones of whatever the
		// current exemplar object is.  Our planet is doomed!
		// Note:  This method has absolutely no idea what it is creating, it
		//        is completely decoupled from creational animal logic. We've lost
		//        our way and science has gone mad!
		for (int i = 0; i < 1000000; i++)
		{
			farmAnimals.add(factory.MakeAnimal());
		}
	}
}