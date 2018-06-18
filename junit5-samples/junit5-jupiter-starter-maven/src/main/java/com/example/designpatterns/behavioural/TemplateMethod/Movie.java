package com.example.designpatterns.behavioural.TemplateMethod;

import java.util.Comparator;
import java.util.List;

public class Movie implements Comparator<Movie>
{
	public String title;
	
	public Movie(String title)
	{
		this.title = title;
	}
	
	// The Comparator interface built into Java provides us a primitive operation
	// any class can introduce to then make use of existing Java sort algorithms.
	// Those algorithms are fixed and never change, they are template methods,
	// no matter what object is passed to them they simply call the compare() 
	// method on that object knowing it must implement the Comparator interface.
	@Override
	public int compare(Movie o1, Movie o2)
	{
		return o1.title.compareToIgnoreCase(o2.title);
	}
	
	// Here is a template method.  The method defines an algorithm with a primitive
	// operation that can be overriden by subclasses to change the behaviour.
	public static final void SortMovies(List<Movie> movieList)
	{
		// Crappy bubble sort.
		for (int i = 0; i < movieList.size(); i++)
		{
			for (int j = 1; j < movieList.size() - i; j++)
			{
				int indexBeforeJ = j - 1;
				Movie o1 = movieList.get(indexBeforeJ);
				Movie o2 = movieList.get(j);
				// Here's the primitive operation that can be overriden.
				if (o1.compare(o1, o2) > 0)
				{
					movieList.remove(indexBeforeJ);
					movieList.add(j, o1);
				}
			}
		}
	}
}