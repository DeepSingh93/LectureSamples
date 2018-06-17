package com.example.designpatterns.behavioural.Memento;

/*
	Here's where we'll implement the memento to allow simple undo capabilities.
	I'm making theString member variable private now.
*/
public class StringContainer
{
	private String theString;
	
	public StringContainer(String value)
	{
		theString = value;
	}
	
	public void SetString(String value)
	{
		theString = value;
	}
	
	public String GetString()
	{
		return theString;
	}
	
	public Memento GetMemento()
	{
		return new Memento(theString);
	}
	
	public void RestoreFromMemento(Memento memento)
	{
		theString = memento.GetState();
	}
}