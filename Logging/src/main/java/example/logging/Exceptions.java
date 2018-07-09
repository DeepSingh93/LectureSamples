package example.logging;

public class Exceptions
{
	public void DoSomething()
	{
		/*
			Don't divide your exceptions unless you are wrapping code that could trigger
			specific exceptions you want to handle in different ways.  Do this:
		*/
		try
		{
			DoA();
			DoB();
			DoC();
			DoD();
			DoE();
		}
		catch (Exception ex)
		{
			System.out.println("Exception thrown:" + ex.getMessage());
		}
		
		// Not this:
		try
		{
			DoA();
		}
		catch (Exception ex)
		{
			System.out.println("Exception thrown:" + ex.getMessage());
		}
		try
		{
			DoB();
		}
		catch (Exception ex)
		{
			System.out.println("Exception thrown:" + ex.getMessage());
		}
		try
		{
			DoC();
		}
		catch (Exception ex)
		{
			System.out.println("Exception thrown:" + ex.getMessage());
		}
		try
		{
			DoD();
		}
		catch (Exception ex)
		{
			System.out.println("Exception thrown:" + ex.getMessage());
		}
		try
		{
			DoE();
		}
		catch (Exception ex)
		{
			System.out.println("Exception thrown:" + ex.getMessage());
		}
	}
	
	public void DoSomething2() throws Exception
	{
		// Do not throw out the original exception when you are considering
		// throwing a new exception or adding to the exception.  For example
		// do not do this:
		try
		{
			DoA();
		}
		catch (Exception ex)
		{
			throw new Exception("An exception happened in DoSomething2(): " + ex.getMessage());
		}
		
		// If you want to add to an exception make sure you preserve the original
		// exception as an inner exception so that all the error information is
		// preserved:
		try
		{
			DoA();
		}
		catch (Exception ex)
		{
			// Notice how I'm passing the exception to the constructor, this sets it
			// as the inner exception and makes it visible if we're debugging or if
			// we decide to log it later on.
			throw new Exception("An exception happened in DoSomething2(): " + ex.getMessage(), ex);
		}
	}
	
	public void DoA() throws Exception { throw new Exception("DoA() error"); }
	public void DoB() {}
	public void DoC() {}
	public void DoD() {}
	public void DoE() {}
}