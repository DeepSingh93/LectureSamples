package com.example.designpatterns.creational.Prototype;

public class Animal implements ICloneable
{
	protected String noiseIMake;
	
	public Animal(String noise)
	{
		noiseIMake = noise;
	}
	
	public void MakeNoise()
	{
		System.out.println(noiseIMake);
	}

	@Override
	public Object Clone()
	{
		// Since Strings are immutable in Java (you can't change them, you get a new
		// object when you do, they are safe to copy and not worry about shallow
		// vs. deep copying.
		return new Animal(noiseIMake);
	}	
}