package com.example.designpatterns.behavioural.Command;

public class Italic extends Command
{
	public Italic(StringContainer receiver)
	{
		super(receiver);
	}

	@Override
	public void Execute()
	{
		receiver.theString = "<em>" + receiver.theString + "</em>";
	}

	@Override
	public void Undo()
	{
		receiver.theString = receiver.theString.substring(4, receiver.theString.length() - 5);
	}
}
