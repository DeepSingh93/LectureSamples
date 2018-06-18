package com.example.designpatterns.behavioural.TemplateMethod;

import java.util.List;
import java.util.ArrayList;

public class Client
{
	public Client()
	{
		List<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("Fight Club"));
		movieList.add(new Movie("Star Wars"));
		movieList.add(new Movie("Air Force One"));
		movieList.add(new Movie("Back To The Future"));
		SortMoviesAlphabetically(movieList);
		for (int i = 0; i < movieList.size(); i++)
		{
			System.out.println(movieList.get(i).title);
		}
	}
	
	// Here I'll demonstrate how sorting would work internally
	// using the template method
	private void SortMoviesAlphabetically(List<Movie> movieList)
	{
		// Crappy bubble sort.
		for (int i = 0; i < movieList.size(); i++)
		{
			for (int j = 1; j < movieList.size() - i; j++)
			{
				int indexBeforeJ = j - 1;
				Movie o1 = movieList.get(indexBeforeJ);
				Movie o2 = movieList.get(j);
				// Here's the template method being used.
				if (o1.compare(o1, o2) > 0)
				{
					movieList.remove(indexBeforeJ);
					movieList.add(j, o1);
				}
			}
		}
	}
}