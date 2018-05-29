package com.example.SOLID.OpenClosed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTest
{
	@Test
	@DisplayName("AreaTest")
	void areaTest()
	{
		RectangleOpen r1 = new RectangleOpen(10.0f, 10.0f);
		RectangleOpen r2 = new RectangleOpen(10.0f, 10.0f);
		RectangleOpen[] rectangles = new RectangleOpen[] {r1, r2};
		AreaCalculator calculator = new AreaCalculator();
		assertEquals(200.0f, calculator.Area(rectangles), 0.0001f);
	}
}