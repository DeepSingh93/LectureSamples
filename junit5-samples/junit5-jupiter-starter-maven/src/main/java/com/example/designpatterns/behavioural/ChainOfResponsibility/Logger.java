package com.example.designpatterns.behavioural.ChainOfResponsibility;

public abstract class Logger
{
	public static int INFO = 0;	// General informational messages, mostly noise
	public static int WARN = 1;	// Sometimes semi-important
	public static int ERROR = 2;	// A very important message, something is wrong
	
	// My personal level of logging.
	protected int logLevel;
	
	// Next object in the chain of responsibility
	protected Logger nextLogger;
	
	public Logger(int level)
	{
		nextLogger = null;
		logLevel = level;
	}

   public void SetNextLogger(Logger nextLogger)
	{
      this.nextLogger = nextLogger;
   }

	// This is the "HandleRequest()" of the loggers, it determines whether
	// the concrete class should handle the message by logging it in whatever
	// its concrete way is
   public void Log(int level, String message)
	{
      if (logLevel == level)
		{
         LogMessage(message);
      }
      if (null != nextLogger)
		{
         nextLogger.Log(level, message);
      }
   }
	
	// Actually do the logging work.
	protected abstract void LogMessage(String message);
}