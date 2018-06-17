package com.example.designpatterns.behavioural.State;

public class WorkState implements IState
{
	@Override
	public void Handle()
	{
		System.out.println("Working state");
	}
}