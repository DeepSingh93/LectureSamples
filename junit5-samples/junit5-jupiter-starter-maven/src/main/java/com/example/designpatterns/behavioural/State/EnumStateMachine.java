package com.example.designpatterns.behavioural.State;

public class EnumStateMachine
{
	public enum States
	{
		START_STATE,
		WORK_STATE,
		END_STATE,
		FINISHED
	};
	
	private States currentState;
	
	public EnumStateMachine()
	{
		currentState = States.START_STATE;
	}
	
	public void RunStateMachine()
	{
		while (currentState != States.FINISHED)
		{
			switch (currentState)
			{
				case START_STATE:
				{
					DoStartState();
					currentState = States.WORK_STATE;
					break;
				}
				case WORK_STATE:
				{
					DoWorkState();
					currentState = States.END_STATE;
					break;
				}
				case END_STATE:
				{
					DoEndState();
					currentState = States.FINISHED;
					break;
				}
			}
		}
	}
	
	private void DoStartState()
	{
		System.out.println("Starting state");
	}
	
	private void DoWorkState()
	{
		System.out.println("Working state");
	}
	
	private void DoEndState()
	{
		System.out.println("End of state machine");
	}
}