package com.example.designpatterns.behavioural.Memento;

public class Bold extends Command
{
	public Bold(StringContainer receiver)
	{
		super(receiver);
	}

	@Override
	public void Execute()
	{
		super.Execute();
		receiver.SetString("<strong>" + receiver.GetString() + "</strong>");
	}

	/*   Undo() isn't needed anymore, it's handled by the base class via a memento.
	@Override
	public void Undo()
	{
	}
	*/
}
