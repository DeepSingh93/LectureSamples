package com.example.refactoring;

public class DiscountableMaterial extends Material
{
	public DiscountableMaterial(String name, float baseCost)
	{
		super(name, baseCost);
	}

	@Override
	public boolean IsDiscountable()
	{
		return true;
	}
}
