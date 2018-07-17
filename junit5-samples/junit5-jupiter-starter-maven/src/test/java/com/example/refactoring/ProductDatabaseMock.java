package com.example.refactoring;

import java.util.List;
import java.util.ArrayList;

public class ProductDatabaseMock implements IProductDatabase
{
	private final IMaterial flour = new Material("flour", 0.01f, Material.Discountable.YES);
	private final IMaterial salt = new Material("salt", 0.01f, Material.Discountable.YES);
	private final IMaterial yeast = new Material("yeast", 0.01f, Material.Discountable.YES);
	private final IMaterial milk = new Material("milk", 1.00f, Material.Discountable.YES);
	private final IMaterial egg = new Material("egg", 0.20f, Material.Discountable.YES);
	private final IMaterial potato = new Material("potato", 0.05f, Material.Discountable.YES);
	private final IMaterial oil = new Material("oil", 0.05f, Material.Discountable.YES);
	private final IMaterial apple = new Material("apple", 0.10f, Material.Discountable.NO);
	
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
		return new Product("bread", materials, materialUnitCounts);
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
		return new Product("apple pie", materials, materialUnitCounts);
	}
	
	
	private IProduct CreatePotatoChips()
	{
		List<IMaterial> materials = new ArrayList<>();
		List<Integer> materialUnitCounts = new ArrayList<>();
		materials.add(potato);
		materialUnitCounts.add(5);
		materials.add(oil);
		materialUnitCounts.add(1);
		return new Product("potato chips", materials, materialUnitCounts);
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