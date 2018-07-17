package com.example.refactoring;

public interface IPromotion
{
	public boolean AppliesToProduct(IProduct product);
	public float GetPercentageDiscount();
}