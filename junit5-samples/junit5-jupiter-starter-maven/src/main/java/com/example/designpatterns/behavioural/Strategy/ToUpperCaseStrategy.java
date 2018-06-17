package com.example.designpatterns.behavioural.Strategy;

public class ToUpperCaseStrategy implements IStrategy
{
	@Override
	public String DoOperation(String input)
	{
		return input.toUpperCase();
	}	
}