package com.example.designpatterns.behavioural.Mediator;

/*
	The mediator helps our program allow aircraft to communicate (send messages)
	with airports without the aircraft having any idea how airports work and
	vice versa.  This would allow you to solve a coupling problem in your code.
*/
public interface IAirTrafficControllerMediator
{
	// Request a runway
	public void RequestRunway(IAircraft aircraft);
	
	// Tell the airport that an aircraft has parked.
	public void Parked(IAircraft aircraft);
}