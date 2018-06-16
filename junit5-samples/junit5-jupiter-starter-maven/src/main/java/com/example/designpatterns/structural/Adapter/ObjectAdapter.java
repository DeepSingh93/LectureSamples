package com.example.designpatterns.structural.Adapter;

import java.util.ArrayList;

/*
	This is a very lame example:
	Imagine I had an old set of code that expects a list object that
	implements the IlistInterface.  The company found that they decided
	that writing our own list class was a dumb idea, so they instructed you
	to replace all use of the old list object with Java ArrayList.  You
	would then have a choice:  Go change all the code to use ArrayList, or
	write an adapter class or adapter object.  Here's an example of
	an adapter object.
*/
class ObjectAdapter<T> implements IListInterface
{
	private ArrayList<T> adapterObject;
	
	public ObjectAdapter()
	{
		adapterObject = new ArrayList<T>();
	}
	
	@Override
	public void AddToList(Object obj)
	{
		adapterObject.add((T)obj);
	}

	@Override
	public Object GetFromList(int index)
	{
		return adapterObject.get(index);
	}	
}