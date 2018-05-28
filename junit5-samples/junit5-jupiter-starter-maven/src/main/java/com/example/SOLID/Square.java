package com.example.SOLID;

public class Square extends Rectangle
{
	public void setHeight(int height)
	{
		this.height = height;
		this.width = height;
	}

	public void setWidth(int width)
	{
		this.width = width;
		this.height = width;
	}
}
