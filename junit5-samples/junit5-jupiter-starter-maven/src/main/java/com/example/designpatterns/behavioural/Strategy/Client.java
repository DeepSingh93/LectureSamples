package com.example.designpatterns.behavioural.Strategy;

public class Client
{
	public Client()
	{
		Context context = new Context(new ToUpperCaseStrategy());
		System.out.println("Here is an uppercase string: " + context.ExecuteStrategy("uppercase"));
		
		context.ChangeStrategy(new ToLowerCaseStrategy());
		System.out.println("Here is a lowercase string: " + context.ExecuteStrategy("LOWERCASE"));
	}
}