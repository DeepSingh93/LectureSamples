package com.example.designpatterns.structural.Decorator;

public class ForeignCurrencyBankAccountDecorator extends BankAccountDecorator
{
	private float exchangeRate;

	public ForeignCurrencyBankAccountDecorator(IBankAccount decoratedBankAccount, float exchangeRate)
	{
		super(decoratedBankAccount);
		this.exchangeRate = exchangeRate;
	}

	/*
		Note:
		We only need to override the Credit() and Debit() methods to implement the
		exchange rate functionality.  We can re-use the base BankAccountDecorator
		GetBalance() method.
	*/
	@Override
	public void Credit(float amount)
	{
		decoratedBankAccount.Credit(amount * exchangeRate);
	}
	
	@Override
	public void Debit(float amount)
	{
		decoratedBankAccount.Debit(amount * exchangeRate);
	}
}