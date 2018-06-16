package com.example.designpatterns.creational.Singleton;


public class SingletonUser
{
	public void UseSingleton()
	{
		ConfigurationLoader loder = ConfigurationLoader.Instance();
	}
}