package com.example.designpatterns.behavioural.Observer;

import javax.swing.Timer;
import java.util.List;
import java.util.ArrayList;
import java.awt.event.*;
import java.util.ListIterator;

public class TimerSubject implements ISubject
{
	private List<IObserver> observers;
	
	/*
		This subject notifies it's observers once every second.
	*/
	public TimerSubject()
	{
		observers = new ArrayList<IObserver>();
		int delay = 1000; //milliseconds
		ActionListener taskPerformer = new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				Notify();
			}
		};
		new Timer(delay, taskPerformer).start();
	}

	@Override
	public void Attach(IObserver observer)
	{
		observers.add(observer);
	}

	@Override
	public void Detach(IObserver observer)
	{
		observers.remove(observer);
	}

	/*
		When the subject is notified it must iterate through its observers and
		send them all the update message.
	*/
	@Override
	public void Notify()
	{
		ListIterator<IObserver> iter = observers.listIterator();
		while (iter.hasNext())
		{
			iter.next().Update();
		}
	}
}