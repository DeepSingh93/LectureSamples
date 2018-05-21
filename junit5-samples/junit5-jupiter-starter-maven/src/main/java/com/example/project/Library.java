package com.example.project;

import java.util.ArrayList;
import com.example.project.ILibraryLoader;
import com.example.project.Book;

// A class that would use a database to load books.
public class Library
{
	ArrayList<Book> libraryBooks;

	public Library(ILibraryLoader bookLoader)
	{
		bookLoader.LoadConnectionConfig();
		libraryBooks = bookLoader.LoadAllBooks();
	}

	public ArrayList<Book> GetBooksByGenre(String genre)
	{
		ArrayList<Book> genreBooks = new ArrayList<Book>();
		for (int i = 0; i < libraryBooks.size(); i++)
		{
			Book book = libraryBooks.get(i);
			boolean addBook = false;
			String[] genres = book.genre.toLowerCase().split(",");
			for (int j = 0; j < genres.length; j++)
			{
				if (genres[j].equals(genre.toLowerCase()))
				{
					addBook = true;
					break;
				}
			}
			if (addBook)
			{
				genreBooks.add(book);
			}
		}
		return genreBooks;
	}

	public ArrayList<Book> GetBooksByAuthor(String author)
	{
		ArrayList<Book> booksByAuthor = new ArrayList<Book>();
		for (int i = 0; i < libraryBooks.size(); i++)
		{
			Book book = libraryBooks.get(i);
			if (book.author.toLowerCase().equals(author.toLowerCase()))
			{
				booksByAuthor.add(book);
			}
		}
		return booksByAuthor;
	}

	public ArrayList<Book> GetBooksByKeyword(String keyword)
	{
		ArrayList<Book> booksByKeyword = new ArrayList<Book>();
		for (int i = 0; i < libraryBooks.size(); i++)
		{
			Book book = libraryBooks.get(i);
			boolean addBook = false;
			String[] keyWords = book.keywords.toLowerCase().split(",");
			for (int j = 0; j < keyWords.length; j++)
			{
				if (keyWords[j].equals(keyword.toLowerCase()))
				{
					addBook = true;
					break;
				}
			}
			if (addBook)
			{
				booksByKeyword.add(book);
			}
		}
		return booksByKeyword;
	}

	/*
	public ArrayList<Book> GetBooksByPublisher(String publisher)
	{
		ArrayList<Book> booksByPublisher = new ArrayList<Book>();
		for (int i = 0; i < libraryBooks.size(); i++)
		{
			Book book = libraryBooks.get(i);
			if (book.publisher.toLowerCase().equals(publisher.toLowerCase()))
			{
				booksByPublisher.add(book);
			}
		}
		return booksByPublisher;
	}
	*/

	public ArrayList<Book> GetBooksByPublisher(String publisher)
	{
		ArrayList<Book> booksByPublisher = new ArrayList<Book>();
		return booksByPublisher;
	}
}