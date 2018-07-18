package com.example.refactoring;

public class ProductMaterial
{
	public IMaterial material;
	public int count;
	
	public ProductMaterial(IMaterial material, int count)
	{
		this.material = material;
		this.count = count;
	}
}
