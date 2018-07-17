package com.example.refactoring;

public class Material extends Nameable implements IMaterial
{
	// REPLACE TYPE CODE WITH CLASS (Make NonDiscountableMaterial class inherit Material and override IsDiscountable)
	public enum Discountable
	{
		YES,
		NO
	}
	
	private final float baseCost;
	private final Discountable canDiscount;
	
	public Material(String name, float baseCost, Discountable canDiscount)
	{
		// PULL UP FIELD
		SetName(name);
		this.baseCost = baseCost;
		this.canDiscount = canDiscount;
	}

	@Override
	public String GetMaterialName()
	{
		// REMOVE MIDDLE MAN
		return GetName();
	}

	@Override
	public float GetCost(int units)
	{
		return baseCost * units;
	}

	@Override
	public boolean IsDiscountable()
	{
		return Discountable.YES == canDiscount;
	}
}