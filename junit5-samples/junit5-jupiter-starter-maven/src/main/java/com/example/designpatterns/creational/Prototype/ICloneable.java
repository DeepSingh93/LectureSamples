package com.example.designpatterns.creational.Prototype;

// Technically I don't need to write this interface because in Java
// the Object class has a clone() method you can override, however I want to
// explicitly specify what I'm done and the Object clone() method is a shallow
// copy and I want to do deep copies.
public interface ICloneable
{
	public Object Clone();
}