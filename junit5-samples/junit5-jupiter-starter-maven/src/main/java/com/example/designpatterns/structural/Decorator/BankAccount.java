package com.example.designpatterns.structural.Decorator;

public class BankAccount implements IBankAccount
{
	private float balance;
	
	public BankAccount()
	{
		balance = 0.0f;
	}

	@Override
	public void Credit(float amount)
	{
		balance += amount;
	}

	@Override
	public void Debit(float amount)
	{
		balance -= amount;
	}

	@Override
	public float GetBalance()
	{
		return balance;
	}
}