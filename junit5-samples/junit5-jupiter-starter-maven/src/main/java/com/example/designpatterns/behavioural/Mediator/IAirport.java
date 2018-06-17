package com.example.designpatterns.behavioural.Mediator;

public interface IAirport
{
	public enum LandingMethod
	{
		VERTICAL,
		RUNWAY
	}
	public String GetAvailableRunway(LandingMethod type);
	public void AllocateRunway(String runway);
	public void ReleaseRunway(String runway);
}