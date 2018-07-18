package com.example.refactoring;

public abstract class Material implements IMaterial
{	
	private final float baseCost;
	private final String name;
	
	public Material(String name, float baseCost)
	{
		this.name = name;
		this.baseCost = baseCost;
	}

	@Override
	public String GetMaterialName()
	{
		return name;
	}

	@Override
	public float GetCost(int units)
	{
		return baseCost * units;
	}

	@Override
	public abstract boolean IsDiscountable();
}