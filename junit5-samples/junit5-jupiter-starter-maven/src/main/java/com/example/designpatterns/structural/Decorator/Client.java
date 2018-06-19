package com.example.designpatterns.structural.Decorator;

public class Client
{
	public Client()
	{
		/*
			Note:
			The following is a possible solution to Assignment 2 Question 4.
			In that question the USDollarAccount violated the Liskov Substitution Principle.
			It violated LSP because LSP states that instances of base classes must be substitutable
			with instances of subclasses without changing the program's behaviour.
			By changing the exchange rate logic to a decorator, rather than implementing it in a
			subclass of BankAccount we are not introducing any subclasses of BankAccount that
			change the behaviour of the BankAccount base class.  Instead we extend the functionality
			of BankAccount by adding the exchange rate logic on as a decorator.
		*/
		IBankAccount account = new BankAccount();
		account.Credit(200.0f);
		account.Debit(100.0f);
		System.out.println("Balance = " + account.GetBalance()); // Outputs 100.0
		account.Debit(100.0f);
		
		// Note how when we instantiate the decorator we always pass it an object to decorate.
		// We can swap between using the decorator or the original object when we want behaviour
		// to change.
		account = new ForeignCurrencyBankAccountDecorator(account, 0.75f);
		account.Credit(200.0f);
		account.Debit(100.0f);
		System.out.println("Balance = " + account.GetBalance()); // Outputs 75.0
	}
}