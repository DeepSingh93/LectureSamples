package com.example.designpatterns.behavioural.State;

public class StartState implements IState
{
	@Override
	public void Handle()
	{
		System.out.println("Starting state");
	}
}