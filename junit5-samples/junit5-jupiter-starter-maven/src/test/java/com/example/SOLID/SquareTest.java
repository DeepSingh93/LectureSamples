package com.example.SOLID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SquareTest
{
	@Test
	@DisplayName("SquareHeightAndWidthTests")
	void squareHeightAndWidthTests()
	{
		Square square = new Square();
		square.setHeight(10);
		square.setWidth(5);
		assertEquals(5, square.getHeight());
		assertEquals(5, square.getWidth());
		square.setWidth(9);
		square.setHeight(4);
		assertEquals(4, square.getHeight());
		assertEquals(4, square.getWidth());
	}

	@Test
	@DisplayName("SquareAreaTest")
	void squareAreaTest()
	{
		Square square = new Square();
		square.setHeight(5);
		square.setWidth(5);
		assertEquals(5, square.calculateArea() / 5);
	}

	@Test
	@DisplayName("LiskovSubstitutionPrincipleTest")
	void liskovSubstitutionPrincipleTest()
	{
		// Copy rectangleHeightAndWidthTests
		// but swap Rectangle() for Square()
	}
}