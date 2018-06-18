package com.example.designpatterns.behavioural.Visitor;

// This is a concrete element in the object structure that can be visited
// by a visitor object.
public class BrokenArmPatient implements IPatient
{
	public void PutArmInCast()
	{
		System.out.println("Yay I'm all better!");
	}

	@Override
	public void Accept(IDoctorVisitor visitor)
	{
		visitor.VisitBrokenArmPatient(this);
	}
}