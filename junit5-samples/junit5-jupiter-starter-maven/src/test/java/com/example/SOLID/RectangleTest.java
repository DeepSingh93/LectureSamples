package com.example.SOLID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RectangleTest
{
	@Test
	@DisplayName("RectangleHeightAndWidthTests")
	void rectangleHeightAndWidthTests()
	{
		Rectangle rect = new Rectangle();
		rect.setHeight(10);
		rect.setWidth(5);
		assertEquals(10, rect.getHeight());
		assertEquals(5, rect.getWidth());
		Rectangle rect2 = new Rectangle();
		rect2.setWidth(5);
		rect2.setHeight(10);
		assertEquals(rect.getHeight(), rect2.getHeight());
		assertEquals(rect.getWidth(), rect2.getWidth());
	}

	@Test
	@DisplayName("RectangleAreaTest")
	void rectangleAreaTest()
	{
		Rectangle rect = new Rectangle();
		rect.setHeight(10);
		rect.setWidth(10);
		assertEquals(100, rect.calculateArea());
	}
}