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

	public static enum CreditCardResults
	{
		INVALID_CREDIT_CARD,
		CREDIT_CARD_CHARGE_FAILURE,
		SUCCESS
	};

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

	// Charge the customer for the order.
	public CreditCardResults ChargeCreditCard(float amount, ICreditCardProcessor processor) throws Exception
	{
		try
		{
			if (processor.IsCreditCardValid(creditCard))
			{
				if (processor.ChargeCreditCard(creditCard, amount))
				{
					return CreditCardResults.SUCCESS;
				}
				else
				{
					return CreditCardResults.CREDIT_CARD_CHARGE_FAILURE;
				}
			}
			else
			{
				return CreditCardResults.INVALID_CREDIT_CARD;
			}

		}
		catch (Exception e)
		{
			System.out.println("Exception charging the credit card!");
			throw e;
		}
	}
}






