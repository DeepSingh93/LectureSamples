package com.example.designpatterns.creational.Singleton;

import java.util.HashMap;

/*
	Here's a class you can steal for your projects.  You will have to implement
	the LoadConfig() method to load your actual config values from a file system
	but it's a good start.

	You probably only want to have ONE config per instance of your application
	right?  Singleton!
*/
public class ConfigurationLoader
{
	private HashMap<String, String> configurationMap;
	
	// This is the single instance of the class allowed in the application.
	// It defaults to null so we can take advantage of lazy initialization.
	private static ConfigurationLoader uniqueInstance = null;

	// This is the single access point the application should use to the one
	// instance of the Singleton.
	public static ConfigurationLoader Instance()
	{
		/*
			This is lazy initialization.  It's called lazy initialization because
			the instance is not created until the first time something in the
			application tries to use it.  This may not be the behaviour you want,
			especially if the work that happens during initialization is compute
			intensive or resource constrained.  You may want finer grained control
			over when that work is done than relying on the first random thing to
			use it, in which case when it's initialized could shift over time as
			new uses are added, changing the profile of your application.
		
			For example, video games abhor lazy initialization.  They can't abide
			unexpected spikes in CPU load or file system load, they need to be very
			organized about when they load things and when they perform heavy computing.
		*/
		if (uniqueInstance == null)
		{
			uniqueInstance = new ConfigurationLoader();
		}
		return uniqueInstance;
	}
	
	// Note the constructor for the class is PRIVATE.  This ensures that nobody
	// else in the application can instantiate the Singleton.  Since all of its
	// methods besides Instance() are object methods, this ensures all usage
	// in the app is via the Instance() object.
	private ConfigurationLoader()
	{
		configurationMap = new HashMap<String, String>();
		LoadConfiguration();
	}
	
	// The best way for you to use this class in your application is just to
	// create your own config class that extends this one, then simply override
	// this method to do the actual work of loading your specific config file
	// into the configurationMap HashMap.
	protected void LoadConfiguration()
	{
		// Do your work to load your config, however you have it stored.
		configurationMap.put("ClassAuthor", "Rob");
		configurationMap.put("TestValue", "4");
	}
	
	public String Value(String configKey)
	{
		if (configurationMap.containsKey(configKey))
		{
			return configurationMap.get(configKey);
		}
		return null;
	}
}

