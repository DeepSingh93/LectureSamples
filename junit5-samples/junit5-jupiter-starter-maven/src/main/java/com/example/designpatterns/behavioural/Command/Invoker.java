package com.example.designpatterns.behavioural.Command;

import java.util.ArrayList;

public class Invoker
{
	private ArrayList<Command> commands;
	
	public Invoker()
	{
		commands = new ArrayList<Command>();
	}
	
	public void StoreCommand(Command command)
	{
		commands.add(command);
	}
	
	public void ProcessCommands()
	{
		for (int i = 0; i < commands.size(); i++)
		{
			Command command = commands.get(i);
			command.Execute();
		}
	}
	
	public void UndoCommands()
	{
		for (int i = commands.size() - 1; i > -1; i--)
		{
			Command command = commands.get(i);
			command.Undo();
		}
		commands.clear();
	}
}
