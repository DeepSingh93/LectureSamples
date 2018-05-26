package com.example.XMLExample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class LowercaseXMLElementStreamReaderTest
{
	@Test
	@DisplayName("LowercaseXMLElementStreamReaderTest")
	void lowercaseXMLElementStreamReaderTest()
	{
		try
		{
			//System.out.println("Working Directory = " + System.getProperty("user.dir"));
			LowercaseXMLElementStreamReader reader = new LowercaseXMLElementStreamReader("src/test/java/com/example/XMLExample/test.xml", Testobject.class);
			Testobject testObject = (Testobject) reader.DeserializeXMLIntoObject();
			assertEquals("foo", testObject.getFoo());
			assertEquals("bar", testObject.getBar());
		}
		catch (Exception e)
		{
			e.printStackTrace();
			fail("Failed to parse test.xml " + e);
		}
	}
}









