package com.example.designpatterns.behavioural.Command;

// I need this class because Java strings are immutable.  This class will be
// a mutable wrapper for the immutable string.
public class StringContainer
{
	public String theString;
	
	public StringContainer(String value)
	{
		theString = value;
	}
}