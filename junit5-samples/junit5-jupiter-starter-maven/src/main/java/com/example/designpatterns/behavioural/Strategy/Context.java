package com.example.designpatterns.behavioural.Strategy;

public class Context
{
	private final IStrategy strategy;
	
	public Context(IStrategy strategy)
	{
		this.strategy = strategy;
	}
	
	public String ExecuteStrategy(String input)
	{
		return strategy.DoOperation(input);
	}
}