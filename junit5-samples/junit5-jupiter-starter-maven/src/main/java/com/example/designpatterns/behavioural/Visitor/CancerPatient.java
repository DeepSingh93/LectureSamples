package com.example.designpatterns.behavioural.Visitor;

// This is a concrete element in the object structure that can be visited
// by the visitor object.
public class CancerPatient implements IPatient
{
	public void AdministerChemotherapy()
	{
		System.out.println("Yay I'm all better!");
	}

	@Override
	public void Accept(IDoctorVisitor visitor)
	{
		visitor.VisitCancerPatient(this);
	}
}