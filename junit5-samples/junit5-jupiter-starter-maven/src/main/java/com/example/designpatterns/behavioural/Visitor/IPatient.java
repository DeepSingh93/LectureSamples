package com.example.designpatterns.behavioural.Visitor;

// This is an element in the object structure that "accepts" a visitor.
public interface IPatient
{
	public void Accept(IDoctorVisitor visitor);
}