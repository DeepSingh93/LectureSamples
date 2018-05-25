package com.example.XMLExample;

// This interface is similar to the Security interface in the assignment.
// It defines some functions your code needs to call that don't have an implementation yet.
public interface ICreditCardProcessor
{
	// Determine whether the credit card number is valid.
	public boolean IsCreditCardValid(String creditCardNumber);

	// Charge the credit card.
	public boolean ChargeCreditCard(String creditCardNumber, float amount);
}