package com.example.designpatterns.behavioural.Command;

public class Bold extends Command
{
	public Bold(StringContainer receiver)
	{
		super(receiver);
	}

	@Override
	public void Execute()
	{
		receiver.theString = "<strong>" + receiver.theString + "</strong>";
	}

	@Override
	public void Undo()
	{
		receiver.theString = receiver.theString.substring(8, receiver.theString.length() - 9);
	}
}
