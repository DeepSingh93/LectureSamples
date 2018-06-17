package com.example.designpatterns.behavioural.Strategy;

public class ToLowerCaseStrategy implements IStrategy
{
	@Override
	public String DoOperation(String input)
	{
		return input.toLowerCase();
	}	
}