package com.example.designpatterns.behavioural.Memento;

public class Client
{
	public Client()
	{
		Invoker invoker = new Invoker();
		StringContainer container = new StringContainer("a string!");
		invoker.StoreCommand(new Italic(container));
		invoker.StoreCommand(new Bold(container));
		invoker.ProcessCommands();
		System.out.println(container.GetString()); // outputs "<strong><em>a string!</em></strong>"
		invoker.UndoCommands();
		System.out.println(container.GetString()); // outputs "a string!"
	}
}