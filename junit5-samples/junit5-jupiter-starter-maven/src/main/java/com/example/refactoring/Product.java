package com.example.refactoring;

import java.util.List;

public class Product extends Nameable implements IProduct
{
	// REPLACE DATA VALUE WITH OBJECT (Materials + Unit Counts, replace with collection object)
	private final List<IMaterial> materials;
	private final List<Integer> materialUnitCounts;

	public Product(String name, List<IMaterial> materialList, List<Integer> materialUnitCounts)
	{
		// PULL UP FIELD
		SetName(name);
		this.materials = materialList;
		this.materialUnitCounts = materialUnitCounts;
	}
	
	@Override
	public float CalculateMaterialCost()
	{
		float sum = 0.0f;
		for (int i = 0; i < materials.size(); i++)
		{
			IMaterial material = materials.get(i);
			sum += material.GetCost(materialUnitCounts.get(i));
		}
		return sum;
	}

	@Override
	public String GetProductName()
	{
		// REMOVE MIDDLE MAN
		return GetName();
	}

	@Override
	public List<IMaterial> GetMaterials()
	{
		return materials;
	}
}