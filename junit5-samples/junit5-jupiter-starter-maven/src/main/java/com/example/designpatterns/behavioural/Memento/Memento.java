package com.example.designpatterns.behavioural.Memento;

public class Memento
{
	private String state;
	
	public Memento(String state)
	{
		this.state = state;
	}
	
	public String GetState()
	{
		return state;
	}
}