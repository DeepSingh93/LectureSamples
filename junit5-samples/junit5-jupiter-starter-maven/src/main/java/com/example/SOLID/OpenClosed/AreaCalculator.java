package com.example.SOLID.OpenClosed;

// Example from this website: http://joelabrahamsson.com/a-simple-example-of-the-openclosed-principle/

public class AreaCalculator
{
	public static float Area(RectangleOpen[] shapes)
	{
		float area = 0.0f;
		for (int i = 0; i < shapes.length; i++)
		{
			area += shapes[i].width * shapes[i].height;
		}
		return area;
	}
}

// if (obj instanceof RectangleOpen)