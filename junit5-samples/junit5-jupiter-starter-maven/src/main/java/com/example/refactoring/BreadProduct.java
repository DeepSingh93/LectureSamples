package com.example.refactoring;

import java.util.List;

public class BreadProduct extends Product
{
	public BreadProduct(String name, List<IMaterial> materialList, List<Integer> materialUnitCounts)
	{
		super(name, materialList, materialUnitCounts);
	}

	@Override
	public float GetCookingFee()
	{
		return 1.00f;
	}
}
