package com.example.refactoring;

import java.util.List;

public class PieProduct extends Product
{
	public PieProduct(String name, List<IMaterial> materialList, List<Integer> materialUnitCounts)
	{
		super(name, materialList, materialUnitCounts);
	}

	@Override
	public float GetCookingFee()
	{
		return 2.00f;
	}
}
