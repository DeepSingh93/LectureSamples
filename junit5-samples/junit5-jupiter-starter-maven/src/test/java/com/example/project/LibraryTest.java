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
		ArrayList<Book> books = library.GetBooksByGenre("SCIENCE fiction");
		assertEquals(1, books.size());
		assertEquals("Flowers For Algernon", books.get(0).title);
		books = library.GetBooksByGenre("romance");
		assertEquals(0, books.size());
	}

	@Test
	@DisplayName("GetBooksByAuthor() test")
	void GetBooksByAuthor()
	{

		ArrayList<Book> books = library.GetBooksByAuthor("Ernest Hemingway");
		assertEquals(1, books.size());
		assertEquals("Old Man And The Sea", books.get(0).title);
		books = library.GetBooksByAuthor("J.K. Rowling");
		assertEquals(0, books.size());
	}

	@Test
	@DisplayName("GetBooksByKeyword() test")
	void GetBooksByKeyword()
	{
		ArrayList<Book> books = library.GetBooksByKeyword("rabbits");
		assertEquals(1, books.size());
		assertEquals("Of Mice And Men", books.get(0).title);
		books = library.GetBooksByKeyword("potato");
		assertEquals(0, books.size());
	}

	@Test
	@DisplayName("GetBooksByPublisher() test")
	void GetBooksByPublisher()
	{
		ArrayList<Book> books = library.GetBooksByPublisher("McGraw-Hill");
		assertEquals(3, books.size());
		for (int i = 0; i < books.size(); i++)
		{
			assertEquals("mcgraw-hill", books.get(i).publisher.toLowerCase());
		}
		books = library.GetBooksByPublisher("fakepublisher");
		assertEquals(0, books.size());
	}
}