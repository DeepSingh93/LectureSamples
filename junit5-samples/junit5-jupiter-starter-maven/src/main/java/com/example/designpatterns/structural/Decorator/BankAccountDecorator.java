package com.example.designpatterns.structural.Decorator;

// Note this class is abstract, it's not meant to be instantiated, but is
// written this way so that we can provide default implementations of methods
// so decorators only have to override the methods they want to.
public abstract class BankAccountDecorator implements IBankAccount
{
	protected IBankAccount decoratedBankAccount;
	
	public BankAccountDecorator(IBankAccount decoratedBankAccount)
	{
		this.decoratedBankAccount = decoratedBankAccount;
	}
	
	/*
		Note:
		We provide default implementations of each of the methods in the
		interface we are decorating, this allows concrete decorators to
		override only those things they want to modify.
	*/
	@Override
	public void Credit(float amount)
	{
		decoratedBankAccount.Credit(amount);
	}
	
	@Override
	public void Debit(float amount)
	{
		decoratedBankAccount.Debit(amount);
	}
	
	@Override
	public float GetBalance()
	{
		return decoratedBankAccount.GetBalance();
	}
}