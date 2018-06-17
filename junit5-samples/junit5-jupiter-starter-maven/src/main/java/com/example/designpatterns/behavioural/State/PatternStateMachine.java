package com.example.designpatterns.behavioural.State;

import java.util.ArrayList;
import java.util.ListIterator;

public class PatternStateMachine
{
	private final ArrayList<IState> stateMachine;
	
	public PatternStateMachine()
	{
		/*
			This is a lot more powerful than the EnumStateMachine for multiple reasons:
			- What gets done in the states is contained in their own classes
			- Defining the ordering of the state machine is much simpler and can be
			  changed at runtime even!
		*/
		stateMachine = new ArrayList<IState>();
		stateMachine.add(new StartState());
		stateMachine.add(new WorkState());
		stateMachine.add(new EndState());
	}
	
	public void RunStateMachine()
	{
		ListIterator<IState> iter = stateMachine.listIterator();
		while (iter.hasNext())
		{
			IState currentState = iter.next();
			currentState.Handle();
		}
	}
}