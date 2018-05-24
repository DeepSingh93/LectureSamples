package com.example.XMLExample;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer
{
	/*
	<!-- The customer making the purchase -->
	<Customer>
		<!-- The customer email address. -->
		<Email>rhawkey@dal.ca</Email>
		<!-- The customer credit card number  -->
		<CreditCard>4138389928849938</CreditCard>
	</Customer>
	*/

	String email;
	String creditCard;

	@XmlElement
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getEmail()
	{
		return email;
	}

	@XmlElement
	public void setCreditCard(String creditCard)
	{
		this.creditCard = creditCard;
	}
	public String getCreditCard()
	{
		return creditCard;
	}
}