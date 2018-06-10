package com.example.designpatterns.creational.Prototype;

public class Sheep extends Animal implements ICloneable
{
	public Sheep(String noise)
	{
		super("Baaaah");
	}

	@Override
	public Object Clone()
	{
		return new Sheep(noiseIMake);
	}
}