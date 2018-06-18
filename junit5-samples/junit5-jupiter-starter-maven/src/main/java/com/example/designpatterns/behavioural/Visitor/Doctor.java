package com.example.designpatterns.behavioural.Visitor;

// This is the concrete visitor object that does the work.  You could implement
// different visitors that do different things to the objects it visits.
public class Doctor implements IDoctorVisitor
{
	@Override
	public void VisitBrokenArmPatient(BrokenArmPatient patient)
	{
		// This doctor knows to put broken arms in a cast.
		patient.PutArmInCast();
	}

	@Override
	public void VisitCancerPatient(CancerPatient patient)
	{
		// This doctor knows to give cancer patients chemotherapy.
		patient.AdministerChemotherapy();
	}
}