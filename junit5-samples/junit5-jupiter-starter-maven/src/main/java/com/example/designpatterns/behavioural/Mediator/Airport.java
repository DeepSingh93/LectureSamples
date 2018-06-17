package com.example.designpatterns.behavioural.Mediator;

import java.util.ArrayList;

/*
	This is one side of the application's problem, a complicated object with lots
	of methods that the aircraft need to use.
*/
public class Airport implements IAirport
{
	private final ArrayList<String> openRunways;
	private final ArrayList<String> runwaysInUse;
	private final ArrayList<String> openLandingPads;
	private final ArrayList<String> landingPadsInUse;

	public Airport()
	{
		openRunways = new ArrayList<String>();
		runwaysInUse = new ArrayList<String>();
		openLandingPads = new ArrayList<String>();
		landingPadsInUse = new ArrayList<String>();
		openRunways.add("Runway1");
		openRunways.add("Runway2");
		openLandingPads.add("LandingPad1");
		openLandingPads.add("LandingPad2");
	}
	
	@Override
	public String GetAvailableRunway(LandingMethod type)
	{
		if (LandingMethod.RUNWAY == type)
		{
			if (openRunways.size() > 0)
			{
				return openRunways.get(0);
			}
		}
		else if (LandingMethod.VERTICAL == type)
		{
			if (openLandingPads.size() > 0)
			{
				return openLandingPads.get(0);
			}
		}
		return null;
	}

	@Override
	public void AllocateRunway(String runway)
	{
		if (openRunways.contains(runway))
		{
			openRunways.remove(runway);
			runwaysInUse.add(runway);
		}
		else
		{
			openLandingPads.remove(runway);
			landingPadsInUse.add(runway);
		}
	}

	@Override
	public void ReleaseRunway(String runway)
	{
		if (runwaysInUse.contains(runway))
		{
			runwaysInUse.remove(runway);
			openRunways.add(runway);	
		}
		else
		{
			landingPadsInUse.remove(runway);
			openLandingPads.add(runway);
		}
	}
}