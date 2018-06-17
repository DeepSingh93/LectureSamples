package com.example.designpatterns.behavioural.Memento;

// The interface all commands implement.
public abstract class Command
{
	// To support undo we store the state of the receiver before executing commands.
	private Memento preState;

	// This is the object on whom we will execute the command.
	// The receiving object could be anything, and the command
	// we execute could be anything.
	protected StringContainer receiver;
	
	public Command(StringContainer receiver)
	{
		this.receiver = receiver;
		preState = null;
	}
	
	public void Execute()
	{
		// To support undo I create a memento of the state before executing the command.
		preState = new Memento(receiver.GetString());
	}
	
	public void Undo()
	{
		// To perform undo I simply restore from my preState memento.
		// Every command now can re-use this undo because the actual work the
		// command does is irrelevant, the memento knows what to save and how
		// to restore what was saved.
		receiver.RestoreFromMemento(preState);
	}
}