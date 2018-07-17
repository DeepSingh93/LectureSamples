package com.example.refactoring;

public interface IMaterial
{
	public String GetMaterialName();
	public float GetCost(int units);
	public boolean IsDiscountable();
}