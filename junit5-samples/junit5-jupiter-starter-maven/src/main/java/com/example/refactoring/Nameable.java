package com.example.refactoring;

public abstract class Nameable
{
	protected String name;
	
	protected final void SetName(String name)
	{
		this.name = name;
	}
	
	protected final String GetName()
	{
		return name;
	}
}