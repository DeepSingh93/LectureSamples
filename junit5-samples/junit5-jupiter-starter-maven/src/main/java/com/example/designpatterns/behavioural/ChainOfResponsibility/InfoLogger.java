package com.example.designpatterns.behavioural.ChainOfResponsibility;

// Here's a concrete handler
public class InfoLogger extends Logger
{
	public InfoLogger()
	{
		super(Logger.INFO);
	}

	@Override
	protected void LogMessage(String message)
	{
		// Info messages can just go to System.out
		System.out.println(message);
	}	
}