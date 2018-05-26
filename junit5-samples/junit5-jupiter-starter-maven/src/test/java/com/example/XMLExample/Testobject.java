package com.example.XMLExample;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Testobject
{
	String foo;
	String bar;

	public String getFoo()
	{
		return foo;
	}

	public void setFoo(String foo)
	{
		this.foo = foo;
	}

	public String getBar()
	{
		return bar;
	}

	public void setBar(String bar)
	{
		this.bar = bar;
	}
}