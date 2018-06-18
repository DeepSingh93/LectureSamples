package com.example.designpatterns.behavioural.Visitor;

// This is the visitor interface that handles known concrete element classes
public interface IDoctorVisitor
{
	public void VisitBrokenArmPatient(BrokenArmPatient patient);
	public void VisitCancerPatient(CancerPatient patient);
}