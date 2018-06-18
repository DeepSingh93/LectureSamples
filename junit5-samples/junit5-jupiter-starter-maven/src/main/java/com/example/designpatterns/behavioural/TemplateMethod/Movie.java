package com.example.designpatterns.behavioural.TemplateMethod;

import java.util.Comparator;

public class Movie implements Comparator<Movie>
{
	public String title;
	
	public Movie(String title)
	{
		this.title = title;
	}
	
	// The Comparator interface built into Java provides us a template method
	// any class can introduce to then make use of existing Java sort algorithms.
	// Those algorithms are fixed and never change, no matter what object is passed
	// to them, because they simply call the compare() template method on that object
	// knowing it must implement the Comparator interface.
	@Override
	public int compare(Movie o1, Movie o2)
	{
		return o1.title.compareToIgnoreCase(o2.title);
	}
}