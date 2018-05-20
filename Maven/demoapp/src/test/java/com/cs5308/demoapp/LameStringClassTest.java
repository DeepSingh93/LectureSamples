import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.cs5308.demoapp.LameStringClass;

public class LameStringClassTest
{
	@Test
	void ConcatenateStringTest()
	{
		LameStringClass l = new LameStringClass();
		assertEquals(l.ConcatenateString("A", "B"), "AB");
	}
}
