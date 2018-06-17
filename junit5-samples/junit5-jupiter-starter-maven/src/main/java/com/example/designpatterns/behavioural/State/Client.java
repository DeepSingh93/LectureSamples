package com.example.designpatterns.behavioural.State;

public class Client
{
	public Client()
	{
		// These do the same thing, one just does it better.
		EnumStateMachine enumMachine = new EnumStateMachine();
		enumMachine.RunStateMachine();
		
		PatternStateMachine patternMachine = new PatternStateMachine();
		patternMachine.RunStateMachine();
	}
}