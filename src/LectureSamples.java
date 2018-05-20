import BrokenBuild.BrokenBuild;
import UnitTests.UTest;
import JUnitExample.JUnitExample;

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
			else if (args[0].equals("junittest"))
			{
				System.out.println("Executing JUnit tests...");
				
			}
		}
		else
		{
			BrokenBuild.DoSomethingBenign();
			//BrokenBuild.DoSomethingToBreakRuntime();
		}
	}

}
