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
		Movie.SortMovies(movieList);
		for (int i = 0; i < movieList.size(); i++)
		{
			System.out.println(movieList.get(i).title);
		}
	}
}