package com.example.refactoring;

import java.util.List;
import java.util.ArrayList;

public class PromotionDatabaseMock implements IPromotionDatabase
{
	@Override
	public List<IPromotion> GetAllPromotions()
	{
		ArrayList<IPromotion> promotions = new ArrayList<>();
		ArrayList<String> productNames = new ArrayList<>();
		productNames.add("bread");
		promotions.add(new Promotion("bread sale", productNames, 0.10f));
		promotions.add(new MaterialPromotion("milk"));
		return promotions;
	}	
}