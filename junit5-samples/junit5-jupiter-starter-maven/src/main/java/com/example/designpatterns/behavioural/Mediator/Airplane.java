package com.example.designpatterns.behavioural.Mediator;

public class Airplane implements IAircraft
{
	@Override
	public Boolean IsCapableOfLandingVertically()
	{
		return false;
	}

	@Override
	public void ProceedToRunway(String runway)
	{
		// Do landing!
		System.out.println("I'm a plane I need a runway");
		IAirTrafficControllerMediator atc = AirTrafficController.Instance();
		atc.Parked(this);
	}

	@Override
	public void MaintainHoldingPattern()
	{
		System.out.println("Can't land yet, got to fly around in circles.");
	}
	
	public void AttemptToLand()
	{
		IAirTrafficControllerMediator atc = AirTrafficController.Instance();
		atc.RequestRunway(this);
	}
}