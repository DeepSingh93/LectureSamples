package BrokenBuild;

public class BrokenBuild
{
	public static void DoSomethingBenign()
	{
		System.out.println("BrokenBuild! Pull request");
	}
	
	/*
	public static void DoSomethingToBreakTheBuild()
	{
		x
	}
	*/
	
	public static void DoSomethingToBreakRuntime()
	{
		int x = 4 / 0;
		System.out.println(Integer.toString(x));
	}
}
