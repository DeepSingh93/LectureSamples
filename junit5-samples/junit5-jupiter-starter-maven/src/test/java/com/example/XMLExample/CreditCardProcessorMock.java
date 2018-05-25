package com.example.XMLExample;

import java.util.ArrayList;

public class CreditCardProcessorMock implements ICreditCardProcessor
{
	ArrayList<String> validCreditCardNumbers;

	public CreditCardProcessorMock(ArrayList<String> validCreditCardNumbers)
	{
		this.validCreditCardNumbers = validCreditCardNumbers;
	}

	// Determine whether the credit card number is valid.
	public boolean IsCreditCardValid(String creditCardNumber)
	{
		if (creditCardNumber == null || creditCardNumber.length() == 0)
		{
			return false;
		}
		for (int i = 0; i < validCreditCardNumbers.size(); i++)
		{
			if (validCreditCardNumbers.get(i).equals(creditCardNumber))
			{
				return true;
			}
		}
		return false;
	}

	// Charge the credit card.
	public boolean ChargeCreditCard(String creditCardNumber, float amount)
	{
		if (amount < 0.0f)
		{
			return false;
		}
		if (!IsCreditCardValid(creditCardNumber))
		{
			return false;
		}
		// For testing let's only authorize values over $100.00
		if (amount < 100.0f)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}