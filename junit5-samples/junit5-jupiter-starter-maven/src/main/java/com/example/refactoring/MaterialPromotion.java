package com.example.refactoring;

public class MaterialPromotion implements IPromotion
{
	private final String materialName;
	
	public MaterialPromotion(String materialName)
	{
		this.materialName = materialName;
	}
	
	@Override
	public boolean AppliesToProduct(IProduct product)
	{
		IMaterial material = product.GetMaterialWithName(materialName);
		if (null != material)
		{
			if (material.IsDiscountable())
			{
				return true;
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