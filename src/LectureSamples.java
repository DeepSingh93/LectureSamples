import BrokenBuild.BrokenBuild;
import UnitTests.UTest;

public class LectureSamples
{

	public static void main(String[] args)
	{
		if (args.length > 0)
		{
			if (args[0].equals("unittest"))
			{
				System.out.println("Executing unit tests...");
				UTest.RunTests();
			}
		}
		else
		{
			BrokenBuild.DoSomethingBenign();
			//BrokenBuild.DoSomethingToBreakRuntime();
		}
	}

}
