package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class LibraryTest
{
	private static Library library;

	// Load a mock library to test with.
	@BeforeAll
	static void initAll()
	{
		ILibraryLoader loader = new LibraryLoaderMock();
		library = new Library(loader);
	}


	@Test
	@DisplayName("GetBooksByGenre() test")
	void GetBooksByGenre()
	{
		ArrayList<Book> books = library.GetBooksByGenre("science fiction");
		assertEquals(books.size(), 1);
		assertEquals(books.get(0).title, "Flowers For Algernon");
		books = library.GetBooksByGenre("romance");
		assertEquals(books.size(), 0);
	}

	@Test
	@DisplayName("GetBooksByAuthor() test")
	void GetBooksByAuthor()
	{
		ArrayList<Book> books = library.GetBooksByAuthor("Ernest Hemingway");
		assertEquals(books.size(), 1);
		assertEquals(books.get(0).title, "Old Man And The Sea");
		books = library.GetBooksByAuthor("J.K. Rowling");
		assertEquals(books.size(), 0);
	}

	@Test
	@DisplayName("GetBooksByKeyword() test")
	void GetBooksByKeyword()
	{
		ArrayList<Book> books = library.GetBooksByKeyword("rabbits");
		assertEquals(books.size(), 1);
		assertEquals(books.get(0).title, "Of Mice And Men");
		books = library.GetBooksByKeyword("potato");
		assertEquals(books.size(), 0);
	}

	@Test
	@DisplayName("GetBooksByPublisher() test")
	void GetBooksByPublisher()
	{
		ArrayList<Book> books = library.GetBooksByPublisher("McGraw-Hill");
		assertEquals(books.size(), 3);
		for (int i = 0; i < books.size(); i++)
		{
			assertEquals(books.get(i).publisher.toLowerCase(), "mcgraw-hill");
		}
		books = library.GetBooksByPublisher("fakepublisher");
		assertEquals(books.size(), 0);
	}
}