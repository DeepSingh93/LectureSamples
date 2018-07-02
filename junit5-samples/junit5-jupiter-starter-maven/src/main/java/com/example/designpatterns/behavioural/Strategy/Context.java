package com.example.designpatterns.behavioural.Strategy;

public class Context
{
	private IStrategy strategy;
	
	public Context(IStrategy strategy)
	{
		this.strategy = strategy;
	}
	
	public void ChangeStrategy(IStrategy strategy)
	{
		this.strategy = strategy;
	}
	
	public String ExecuteStrategy(String input)
	{
		return strategy.DoOperation(input);
	}
}