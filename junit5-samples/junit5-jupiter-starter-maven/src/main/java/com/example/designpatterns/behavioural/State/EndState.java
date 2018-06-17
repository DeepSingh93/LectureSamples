package com.example.designpatterns.behavioural.State;

// The final state
public class EndState implements IState
{
	@Override
	public void Handle()
	{
		System.out.println("End of state machine");
	}
}