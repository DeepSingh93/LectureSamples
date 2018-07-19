package com.example.refactoring;

import java.util.List;
import java.util.ArrayList;

public class ProductDatabaseMock implements IProductDatabase
{
	private final IMaterial flour = new DiscountableMaterial("flour", 0.01f);
	private final IMaterial salt = new DiscountableMaterial("salt", 0.01f);
	private final IMaterial yeast = new DiscountableMaterial("yeast", 0.01f);
	private final IMaterial milk = new DiscountableMaterial("milk", 1.00f);
	private final IMaterial egg = new DiscountableMaterial("egg", 0.20f);
	private final IMaterial potato = new DiscountableMaterial("potato", 0.05f);
	private final IMaterial oil = new DiscountableMaterial("oil", 0.05f);
	private final IMaterial apple = new FixedPriceMaterial("apple", 0.10f);
	
	private IProduct CreateBread()
	{
		List<IMaterial> materials = new ArrayList<>();
		List<Integer> materialUnitCounts = new ArrayList<>();
		materials.add(flour);
		materialUnitCounts.add(2);
		materials.add(salt);
		materialUnitCounts.add(1);
		materials.add(yeast);
		materialUnitCounts.add(1);
		materials.add(milk);
		materialUnitCounts.add(2);
		materials.add(egg);
		materialUnitCounts.add(1);
		return new BreadProduct("bread", materials, materialUnitCounts);
	}
	
	private IProduct CreateApplePie()
	{
		List<IMaterial> materials = new ArrayList<>();
		List<Integer> materialUnitCounts = new ArrayList<>();
		materials.add(flour);
		materialUnitCounts.add(1);
		materials.add(salt);
		materialUnitCounts.add(1);
		materials.add(milk);
		materialUnitCounts.add(1);
		materials.add(egg);
		materialUnitCounts.add(2);
		materials.add(apple);
		materialUnitCounts.add(5);
		return new PieProduct("apple pie", materials, materialUnitCounts);
	}
	
	
	private IProduct CreatePotatoChips()
	{
		List<IMaterial> materials = new ArrayList<>();
		List<Integer> materialUnitCounts = new ArrayList<>();
		materials.add(potato);
		materialUnitCounts.add(5);
		materials.add(oil);
		materialUnitCounts.add(1);
		return new ChipsProduct("potato chips", materials, materialUnitCounts);
	}
	
	private IProduct CreateMilk()
	{
		List<IMaterial> materials = new ArrayList<>();
		List<Integer> materialUnitCounts = new ArrayList<>();
		materials.add(milk);
		materialUnitCounts.add(1);
		return new Product("milk", materials, materialUnitCounts);
	}
	
	@Override
	public List<IProduct> GetAllProducts()
	{
		List<IProduct> products = new ArrayList<>();
		products.add(CreateBread());
		products.add(CreateApplePie());
		products.add(CreatePotatoChips());
		products.add(CreateMilk());
		return products;
	}
}