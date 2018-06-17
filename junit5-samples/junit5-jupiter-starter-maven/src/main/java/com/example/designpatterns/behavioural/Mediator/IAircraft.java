package com.example.designpatterns.behavioural.Mediator;

public interface IAircraft
{
	public Boolean IsCapableOfLandingVertically();
	public void ProceedToRunway(String runway);
	public void MaintainHoldingPattern();
}