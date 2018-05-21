package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

class BookTests
{
	@Test
	@DisplayName("Citation Test")
	void citationTest() {
		HashMap<String, String> bookSettings = new HashMap<String, String>();
		bookSettings.put("publisher", "publisher");
		bookSettings.put("title", "title");
		bookSettings.put("author", "author");
		bookSettings.put("genre", "fake genre");
		bookSettings.put("keywords", "one,two,three,four");
		Book book = new Book(bookSettings);
		assertEquals("\"title\", author, Publisher: publisher", book.CitationString());
	}

}