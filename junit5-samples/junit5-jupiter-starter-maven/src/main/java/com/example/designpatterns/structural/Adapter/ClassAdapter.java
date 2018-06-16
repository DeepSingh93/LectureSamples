package com.example.designpatterns.structural.Adapter;

import java.util.ArrayList;

/*
	This is a very lame example:
	Imagine I had an old set of code that expects a list object that
	implements the IlistInterface.  The company found that they decided
	that writing our own list class was a dumb idea, so they instructed you
	to replace all use of the old list object with Java ArrayList.  You
	would then have a choice:  Go change all the code to use ArrayList, or
	write an adapter class or adapter object.  Here's an adapter class.
*/
public class ClassAdapter extends ArrayList implements IListInterface
{
	@Override
	public void AddToList(Object obj)
	{
		super.add(obj);
	}

	@Override
	public Object GetFromList(int index)
	{
		return super.get(index);
	}	
}