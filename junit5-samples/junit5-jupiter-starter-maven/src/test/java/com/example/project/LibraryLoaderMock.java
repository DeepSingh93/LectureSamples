package com.example.project;

import java.util.ArrayList;
import java.util.HashMap;

public class LibraryLoaderMock implements ILibraryLoader
{
	public void LoadConnectionConfig()
	{
		// The mock doesn't need to connect to anything.
	}

	public ArrayList<Book> LoadAllBooks()
	{
		// Return a bunch of fake books.
		ArrayList<Book> books = new ArrayList<Book>();
		HashMap<String, String> bookSettings = new HashMap<String, String>();
		bookSettings.put("publisher", "Penguin");
		bookSettings.put("title", "To Kill A Mockingbird");
		bookSettings.put("author", "Harper Lee");
		bookSettings.put("genre", "Southern Gothic,Coming-of-Age");
		bookSettings.put("keywords", "atticus,trial,finch,mockingbird");
		books.add(new Book(bookSettings));
		bookSettings = new HashMap<String, String>();
		bookSettings.put("publisher", "McGraw-Hill");
		bookSettings.put("title", "Old Man And The Sea");
		bookSettings.put("author", "Ernest Hemingway");
		bookSettings.put("genre", "fishing,allegorical");
		bookSettings.put("keywords", "fish,sea,jesus");
		books.add(new Book(bookSettings));
		bookSettings = new HashMap<String, String>();
		bookSettings.put("publisher", "ThomsonReuters");
		bookSettings.put("title", "Flowers For Algernon");
		bookSettings.put("author", "Daniel Keyes");
		bookSettings.put("genre", "Science Fiction");
		bookSettings.put("keywords", "experiment,brain,mouse,flowers");
		books.add(new Book(bookSettings));
		bookSettings = new HashMap<String, String>();
		bookSettings.put("publisher", "Penguin");
		bookSettings.put("title", "All Quiet On The Western Front");
		bookSettings.put("author", "Erich Maria Remarque");
		bookSettings.put("genre", "World War 1");
		bookSettings.put("keywords", "war,germany,artillery");
		books.add(new Book(bookSettings));
		bookSettings = new HashMap<String, String>();
		bookSettings.put("publisher", "McGraw-Hill");
		bookSettings.put("title", "Mother Knight");
		bookSettings.put("author", "Kurt Vonnegut");
		bookSettings.put("genre", "dark humour,metafiction");
		bookSettings.put("keywords", "israel,germany,world war 2,nazi");
		books.add(new Book(bookSettings));
		bookSettings = new HashMap<String, String>();
		bookSettings.put("publisher", "McGraw-Hill");
		bookSettings.put("title", "Of Mice And Men");
		bookSettings.put("author", "John Steinbeck");
		bookSettings.put("genre", "fiction,tragedy");
		bookSettings.put("keywords", "rabbits,lenny,george");
		books.add(new Book(bookSettings));
		return books;
	}
}