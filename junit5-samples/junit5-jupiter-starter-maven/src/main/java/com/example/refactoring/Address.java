package com.example.refactoring;

import java.lang.StringBuilder;

public class Address
{
	private final String street;
	private final String city;
	private final String province;
	private final String postalCode;
	
	public Address(String street, String city, String province, String postalCode)
	{
		this.street = street;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
	}

	public String BuildContactInfoString()
	{
		StringBuilder contactInfo = new StringBuilder();
		contactInfo.append(street);
		contactInfo.append("\n");
		contactInfo.append(city);
		contactInfo.append("\n");
		contactInfo.append(province);
		contactInfo.append("\n");
		contactInfo.append(postalCode);
		return contactInfo.toString();
	}
}