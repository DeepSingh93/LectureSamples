package UnitTests;

public class BusinessLogicFailure
{
	public static final int LOW = 1;
	public static final int MEDIUM = 3;
	public static final int HIGH = 6;

	public static int CalculateInsuranceRate(String[] factors)
	{
		int rate = LOW;
		for (int i = 0; i < factors.length; i++)
		{
			if (factors[i].equals("smoker"))
			{
				rate = HIGH;
			}
			else if (factors[i].equals("diabetes"))
			{
				rate = MEDIUM;
			}
			else if (factors[i].equals("over60"))
			{
				rate = HIGH;
			}
			else if (factors[i].equals("under30"))
			{
				rate = LOW;
			}
		}
		return rate;
	}
}