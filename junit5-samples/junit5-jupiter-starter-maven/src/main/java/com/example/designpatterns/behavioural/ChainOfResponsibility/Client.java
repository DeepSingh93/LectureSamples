package com.example.designpatterns.behavioural.ChainOfResponsibility;

public class Client
{
	private Logger logger;
	
	public Client()
	{
		// Instantiate two loggers and build a chain, if you wanted to get fancier
		// you should contain this logic inside a creational pattern like a singleton.
		logger = new InfoLogger();
		logger.SetNextLogger(new ErrorLogger());
		
		DoSomethingThatTriggersInfoMessages();
		DoSomethingThatTriggersErrorMessages();
	}
	
	private void DoSomethingThatTriggersInfoMessages()
	{
		logger.Log(Logger.INFO, "This is some info!");
	}
	
	private void DoSomethingThatTriggersErrorMessages()
	{
		try
		{
			int x = 1;
			int y = 0;
			x = x / y;
			System.out.println(x);
		}
		catch (Exception e)
		{
			logger.Log(Logger.ERROR, "ERROR!  Divide by zero in DoSomethingThatTriggersErrorMessages()!");
		}
	}
}