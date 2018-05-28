package com.example.SOLID;

public class Rectangle
{
	protected int height;
	protected int width;

	public void setHeight(int height)
	{
		this.height = height;
	}

	public int getHeight()
	{
		return height;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}

	public int getWidth()
	{
		return width;
	}

	public int calculateArea()
	{
		return height * width;
	}
}