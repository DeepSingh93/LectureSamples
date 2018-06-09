package com.example.designpatterns.creational;

public class Wall implements MapSite
{
	public Wall()
	{
		
	}
	
	@Override
	public void Enter()
	{
		System.out.println("Bonk!");
	}
}