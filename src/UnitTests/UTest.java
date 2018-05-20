package UnitTests;

import UnitTests.LameStringClass;
import UnitTests.BusinessLogicFailure;

public class UTest
{
	public static void RunTests()
	{
		TestConcatenate();
		CalculateInsuranceRateTest();
	}

	public static void TestConcatenate()
	{
		LameStringClass stringClass = new LameStringClass();
		String returnVal = stringClass.concatenateString("A", "B");
		if (!returnVal.equals("AB"))
		{
			System.out.println("TestConcatenate() FAILURE");
		}
	}

	public static void CalculateInsuranceRateTest()
	{
		String[] factors = {"smoker"};
		int rate = BusinessLogicFailure.CalculateInsuranceRate(factors);
		if (rate != BusinessLogicFailure.HIGH)
		{
			System.out.println("CalculateInsuranceRateTest() FAILURE");
		}
		factors[0] = "diabetes";
		rate = BusinessLogicFailure.CalculateInsuranceRate(factors);
		if (rate != BusinessLogicFailure.MEDIUM)
		{
			System.out.println("CalculateInsuranceRateTest() FAILURE");
		}
		factors[0] = "over60";
		rate = BusinessLogicFailure.CalculateInsuranceRate(factors);
		if (rate != BusinessLogicFailure.HIGH)
		{
			System.out.println("CalculateInsuranceRateTest() FAILURE");
		}
		factors[0] = "under30";
		rate = BusinessLogicFailure.CalculateInsuranceRate(factors);
		if (rate != BusinessLogicFailure.LOW)
		{
			System.out.println("CalculateInsuranceRateTest() FAILURE");
		}
	}

	/*
	public static void MultipleFactorsCalculateInsuranceRateTest()
	{
		String[] factors = new String[3];
		factors[0] = "smoker";
		factors[1] = "diabetes";
		factors[2] = "under30";
		int rate = BusinessLogicFailure.CalculateInsuranceRate(factors);
		if (rate != BusinessLogicFailure.HIGH)
		{
			System.out.println("CalculateInsuranceRate() multiple factors FAILURE");
		}
	}
	*/
}







