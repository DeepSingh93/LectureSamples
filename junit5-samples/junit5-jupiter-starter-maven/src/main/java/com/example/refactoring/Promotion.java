package com.example.refactoring;

import java.util.List;
import java.util.ListIterator;

public class Promotion implements IPromotion
{
	private final String name;
	private final List<String> productNames;
	private final float discount;	

	public Promotion(String name, List<String> applicableProductNames, float discount)
	{
		this.name = name;
		this.productNames = applicableProductNames;
		this.discount = discount;
	}

	@Override
	public boolean AppliesToProduct(IProduct product)
	{
		ListIterator<String> iter = productNames.listIterator();
		while (iter.hasNext())
		{
			String productName = iter.next();
			if (productName.equalsIgnoreCase(product.GetProductName()))
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public float GetPercentageDiscount()
	{
		return discount;
	}	
}