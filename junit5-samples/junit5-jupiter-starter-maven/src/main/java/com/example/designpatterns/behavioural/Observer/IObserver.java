package com.example.designpatterns.behavioural.Observer;

public interface IObserver
{
	// This is the method called by the subject when the subject is notified
	// It doesn't have to take no parameters, you could pass it state to act on
	// or whatever you like.
	public void Update();
}