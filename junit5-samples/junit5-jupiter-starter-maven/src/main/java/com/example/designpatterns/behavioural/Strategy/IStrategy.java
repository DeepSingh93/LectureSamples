package com.example.designpatterns.behavioural.Strategy;

public interface IStrategy
{
	// The operation all algorithms perform.
	// Here I'm defining an operation that does something to a string and returns
	// a string, but this can be anything.
	public String DoOperation(String input);
}