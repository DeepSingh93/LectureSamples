package com.example.refactoring;

import java.util.List;
import java.util.ListIterator;

public class Store
{
	private final List<IProduct> allProducts;
	private final List<IPromotion> allPromotions;
	private static final float PROFIT_MARGIN = 0.30f;
	private final Address address;
	
	// INTRODUCE PARAMETER OBJECT
	public Store(IProductDatabase db, IPromotionDatabase promoDB, Address address)
	{
		allProducts = db.GetAllProducts();
		allPromotions = promoDB.GetAllPromotions();
		this.address = address;
	}
	
	public float CalculateValueAllStock()
	{
		float sum = 0.0f;
		ListIterator<IProduct> iter = allProducts.listIterator();
		while (iter.hasNext())
		{
			IProduct product = iter.next();
			sum += product.CalculateMaterialCost();
		}
		return sum;
	}
	
	private float GetProductDiscount(IProduct product)
	{
		float discount = 0.0f;
		ListIterator<IPromotion> promotionIter = allPromotions.listIterator();
		while (promotionIter.hasNext())
		{
			IPromotion promotion = promotionIter.next();
			if (promotion.AppliesToProduct(product))
			{
				discount = Math.max(discount, promotion.GetPercentageDiscount());
			}
		}
		return discount;
	}
	
	public float CalculateMarketValueAllStock()
	{
		float sum = 0.0f;
		ListIterator<IProduct> iter = allProducts.listIterator();
		while (iter.hasNext())
		{
			IProduct product = iter.next();
			float discount = GetProductDiscount(product);
			float baseCost = product.CalculateMaterialCost();
			float baseCostPlusProfitMargin = baseCost + (baseCost * PROFIT_MARGIN);
			sum += baseCostPlusProfitMargin - (baseCostPlusProfitMargin * discount);

			// REPLACE CONDITIONAL WITH POLYMORPHISM
			// Add cooking fee!
			float cookingFee = 0.0f;
			switch (product.GetProductName().toLowerCase())
			{
				case "bread":
				{
					cookingFee = 1.00f;
					break;
				}
				case "apple pie":
				{
					cookingFee = 2.00f;
					break;
				}
				case "potato chips":
				{
					cookingFee = 1.50f;
					break;
				}
			}
			sum += cookingFee - (cookingFee * discount);
		}
		return sum;
	}
	
	// EXTRACT CLASS
	public String GetContactInfo()
	{
		return address.BuildContactInfoString();
	}
}