package com.example.project;

import java.util.HashMap;

public class Book
{
	public String publisher;
	public String title;
	public String author;
	public String genre;
	public String keywords;

	public Book(HashMap<String, String> bookData)
	{
		publisher = bookData.get("publisher");
		title = bookData.get("title");
		author = bookData.get("author");
		genre = bookData.get("genre");
		keywords = bookData.get("keywords");
	}

	public String CitationString()
	{
		//return "\"" + title + "\"" + ", " + author + ", Publisher: " + publisher;
		return "\"" + "\"" + ", " + author + ", Publisher: " + publisher;
	}
}