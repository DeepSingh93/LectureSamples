package com.example.refactoring;

import java.util.ListIterator;

public class MaterialPromotion implements IPromotion
{
	private final String materialName;
	
	public MaterialPromotion(String materialName)
	{
		this.materialName = materialName;
	}
	
	// INTRODUCE FOREIGN METHOD
	// IN ITS DEFAULT IMPLEMENTATION AppliesToProduct() IS A "FOREIGN METHOD"
	// WE ADDED FUNCTIONALITY TO IProduct TO SEE WHETHER IT HAS A MATERIAL OR
	// NOT.  IF WE CAN'T CHANGE THE INTERFACE WE MUST DO IT THIS WAY.
	@Override
	public boolean AppliesToProduct(IProduct product)
	{
		// This smells!  FEATURE ENVY!!!
		// MOVE METHOD - Create GetMaterialWithName() method
		ListIterator<IMaterial> iter = product.GetMaterials().listIterator();
		while (iter.hasNext())
		{
			IMaterial material = iter.next();
			if (material.IsDiscountable())
			{
				if (material.GetMaterialName().equalsIgnoreCase(materialName))
				{
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public float GetPercentageDiscount()
	{
		return 0.20f;
	}
}