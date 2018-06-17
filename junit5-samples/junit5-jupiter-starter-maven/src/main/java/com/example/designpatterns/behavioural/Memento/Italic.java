package com.example.designpatterns.behavioural.Memento;

public class Italic extends Command
{
	public Italic(StringContainer receiver)
	{
		super(receiver);
	}

	@Override
	public void Execute()
	{
		super.Execute();
		receiver.SetString("<em>" + receiver.GetString() + "</em>");
	}

	/*   Undo() isn't needed anymore, it's handled by the base class via a memento.
	@Override
	public void Undo()
	{
	}
	*/
}
