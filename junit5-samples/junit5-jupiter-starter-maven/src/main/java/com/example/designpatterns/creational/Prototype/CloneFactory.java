package com.example.designpatterns.creational.Prototype;

/*
	This Factory pattern uses a Prototype (Animal) to create new objects
	by cloning them in the MakeAnimal() method.
*/
public class CloneFactory implements IAnimalFactory
{
	private Animal originalExemplar;
	
	public CloneFactory(Animal exemplar)
	{
		originalExemplar = exemplar;
	}

	@Override
	public Animal MakeAnimal()
	{
		return (Animal)originalExemplar.Clone();
	}
}