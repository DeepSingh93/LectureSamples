package example.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main
{
	private static final Logger logger = LogManager.getLogger(Main.class);
	
	public static void main(String[] args)
	{
		System.out.println("Logging demo!");
		logger.info("This log level is informational, most likely you would filter it in production.");
		logger.warn("This log level is a warning, you might keep this in production if the module is very important.");
		logger.error("This log level is an error, you never want to filter those.");
		NormalClass obj = new NormalClass();
		obj.DoSomething();
		VeryImportantClass obj2 = new VeryImportantClass();
		obj2.DoSomething();
	}
}