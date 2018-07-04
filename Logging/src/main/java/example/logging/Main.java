package example.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main
{	
	
	public static void main(String[] args)
	{
		// Override the default global exception handler for the main thread.
		GlobalHandler handler = new GlobalHandler();
		Thread.setDefaultUncaughtExceptionHandler(handler);
		
		Logger logger = LogManager.getLogger(Main.class);
		logger.info("This log level is informational, most likely you would filter it in production.");
		logger.warn("This log level is a warning, you might keep this in production if the module is very important.");
		logger.error("This log level is an error, you never want to filter those.");
		NormalClass obj = new NormalClass();
		obj.DoSomething();
		VeryImportantClass obj2 = new VeryImportantClass();
		obj2.DoSomething();
		
		ErrorHandling error = new ErrorHandling();
		error.StepThroughYourCode();
		
		/*
		ErrorHandling error = new ErrorHandling();
		error.DoSomethingYouCanRecoverFrom("testfile.txt");
		try
		{
			error.DoSomethingLessFatal(0);		
		}
		catch (IllegalArgumentException e)
		{
			logger.fatal("Bah I tried to pass zero.", e);
		}
		error.DoSomethingFatal();
		*/
	}
}