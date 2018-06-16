package com.example.designpatterns.creational.Prototype;

public class Pig extends Animal implements ICloneable
{
	public Pig(String noise)
	{
		super("Oink");
	}

	@Override
	public Object Clone()
	{
		return new Pig(noiseIMake);
	}
}