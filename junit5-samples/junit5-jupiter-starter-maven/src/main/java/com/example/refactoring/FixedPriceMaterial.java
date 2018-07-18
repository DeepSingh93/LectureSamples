package com.example.refactoring;

public class FixedPriceMaterial extends Material
{
	public FixedPriceMaterial(String name, float baseCost)
	{
		super(name, baseCost);
	}

	@Override
	public boolean IsDiscountable()
	{
		return false;
	}
}
