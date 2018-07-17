package com.example.refactoring;

import java.util.List;
import java.util.ListIterator;
import java.lang.StringBuilder;

public class Store
{
	private final List<IProduct> allProducts;
	private final List<IPromotion> allPromotions;
	private static final float PROFIT_MARGIN = 0.30f;
	private final String street;
	private final String city;
	private final String province;
	private final String postalCode;
	
	// INTRODUCE PARAMETER OBJECT
	public Store(IProductDatabase db, IPromotionDatabase promoDB, String street, String city, String province, String postalCode)
	{
		allProducts = db.GetAllProducts();
		allPromotions = promoDB.GetAllPromotions();
		// EXTRACT CLASS
		this.street = street;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
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
	
	public float CalculateMarketValueAllStock()
	{
		float sum = 0.0f;
		ListIterator<IProduct> iter = allProducts.listIterator();
		while (iter.hasNext())
		{
			IProduct product = iter.next();
			// EXTRACT METHOD(S)
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
			// INTRODUCE EXPLAINING VARIABLE
			// The market value for a product is the material cost + profit margin - any discounts applied.
			sum += (product.CalculateMaterialCost() + (product.CalculateMaterialCost() * PROFIT_MARGIN)) - ((product.CalculateMaterialCost() + (product.CalculateMaterialCost() * PROFIT_MARGIN)) * discount);

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
		StringBuilder contactInfo = new StringBuilder();
		contactInfo.append(street);
		contactInfo.append("\n");
		contactInfo.append(city);
		contactInfo.append("\n");
		contactInfo.append(province);
		contactInfo.append("\n");
		contactInfo.append(postalCode);
		return contactInfo.toString();
	}
}