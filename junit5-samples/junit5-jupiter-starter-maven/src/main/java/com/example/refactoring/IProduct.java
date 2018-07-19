package com.example.refactoring;

import java.util.List;

public interface IProduct
{
	public float CalculateMaterialCost();
	public String GetProductName();
	public List<IMaterial> GetMaterials();
	public IMaterial GetMaterialWithName(String name);
	public float GetCookingFee();
}