package com.example.designpatterns.behavioural.Observer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
	This is a simple observer that simply prints the current time when it is updated.
*/
public class OutputObserver implements IObserver
{
	@Override
	public void Update()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
	}
}
