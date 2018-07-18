package com.example.refactoring;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class Product implements IProduct
{
	// REPLACE DATA VALUE WITH OBJECT (Materials + Unit Counts, replace with collection object)
	private final List<ProductMaterial> materials;
	private final String name;

	public Product(String name, List<IMaterial> materialList, List<Integer> materialUnitCounts)
	{
		this.name = name;
		materials = new ArrayList<>();
		for (int i = 0; i < materialList.size(); i++)
		{
			ProductMaterial material = new ProductMaterial(materialList.get(i), materialUnitCounts.get(i));
			materials.add(material);
		}
	}
	
	@Override
	public float CalculateMaterialCost()
	{
		float sum = 0.0f;
		for (int i = 0; i < materials.size(); i++)
		{
			ProductMaterial material = materials.get(i);
			sum += material.material.GetCost(material.count);
		}
		return sum;
	}

	@Override
	public String GetProductName()
	{
		return name;
	}

	@Override
	public List<IMaterial> GetMaterials()
	{
		List<IMaterial> list = new ArrayList<>();
		ListIterator<ProductMaterial> iter = materials.listIterator();
		while (iter.hasNext())
		{
			ProductMaterial material = iter.next();
			list.add(material.material);
		}
		return list;
	}

	@Override
	public IMaterial GetMaterialWithName(String name)
	{
		ListIterator<ProductMaterial> iter = materials.listIterator();
		while (iter.hasNext())
		{
			ProductMaterial material = iter.next();
			if (material.material.GetMaterialName().equalsIgnoreCase(name))
			{
				return material.material;
			}
		}
		return null;
	}

	@Override
	public float GetCookingFee()
	{
		return 0.0f;
	}
}