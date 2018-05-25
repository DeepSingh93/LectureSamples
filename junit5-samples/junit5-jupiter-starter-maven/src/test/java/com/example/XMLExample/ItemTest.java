package com.example.XMLExample;

import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/*
	With this test I'll demonstrate loading (deserializing) the object from XML and testing the object's
	validation method.
*/
public class ItemTest
{
	static final String VALID_TEST_XML = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
								   		 "<item>\n" +
								         "	<uniqueID>1234</uniqueID>\n" +
								         "	<quantity>2</quantity>\n" +
								         "</item>";
	static final String INVALID_UNIQUE_ID = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
								   		    "<item>\n" +
								            "	<uniqueID>A</uniqueID>\n" +
								            "	<quantity>2</quantity>\n" +
								            "</item>";
	static final String INVALID_QUANTITY = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
								   		   "<item>\n" +
								           "	<uniqueID>1234</uniqueID>\n" +
								           "	<quantity>A</quantity>\n" +
								           "</item>";
	static final String INVALID_QUANTITY_NEGATIVE = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
								   		   			"<item>\n" +
								           			"	<uniqueID>1234</uniqueID>\n" +
								           			"	<quantity>-1</quantity>\n" +
								           			"</item>";
	static final String INVALID_QUANTITY_ZERO = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
								   		   		"<item>\n" +
								           		"	<uniqueID>1234</uniqueID>\n" +
								           		"	<quantity>0</quantity>\n" +
								           		"</item>";
	static final String MISSING_UNIQUE_ID = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
								   		    "<item>\n" +
								            "	<quantity>2</quantity>\n" +
								            "</item>";
	static final String MISSING_QUANTITY = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
								   		   "<item>\n" +
								           "	<uniqueID>1234</uniqueID>\n" +
								           "</item>";

	// This is a helper method for the test to ensure I don't duplicate the XML deserialization
	// in every test.  Where else do you think this method should go?  There's a better place...
	// Remember this method when we learn about factories.
	private Item deserializeXMLToItemObject(String xml)
	{
		try
		{
			StringReader reader = new StringReader(xml);
			JAXBContext jaxbContext = JAXBContext.newInstance(Item.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Item item = (Item) jaxbUnmarshaller.unmarshal(reader);
			return item;
		} 
		catch (JAXBException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Test
	@DisplayName("ItemTest - Testing deserializing and validating a valid Item object")
	void itemTest()
	{
		Item item = deserializeXMLToItemObject(VALID_TEST_XML);
		assertNotNull(item);
		assertEquals("1234", item.getUniqueID());
		assertEquals("2", item.getQuantity());
	}

	@Test
	@DisplayName("InvalidItemUniqueID - Testing deserializing bad XML.")
	void invalidUniqueIDTest()
	{
		Item item = deserializeXMLToItemObject(INVALID_UNIQUE_ID);
		assertNotNull(item);
		assertTrue(!item.validate());
	}

	@Test
	@DisplayName("InvalidItemQuantity - Testing deserializing bad XML.")
	void invalidQuantityTest()
	{
		Item item = deserializeXMLToItemObject(INVALID_QUANTITY);
		assertNotNull(item);
		assertTrue(!item.validate());
	}

	@Test
	@DisplayName("InvalidItemQuantityNegative - Testing deserializing bad XML.")
	void invalidNegativeQuantity()
	{
		Item item = deserializeXMLToItemObject(INVALID_QUANTITY_NEGATIVE);
		assertNotNull(item);
		assertTrue(!item.validate());
	}

	@Test
	@DisplayName("InvalidItemQuanityZero - Testing deserializing bad XML.")
	void invalidZeroQuantity()
	{
		Item item = deserializeXMLToItemObject(INVALID_QUANTITY_ZERO);
		assertNotNull(item);
		assertTrue(!item.validate());
	}

	@Test
	@DisplayName("InvalidItemMissingUniqueID - Testing deserializing bad XML.")
	void invalidMissingUniqueID()
	{
		Item item = deserializeXMLToItemObject(MISSING_UNIQUE_ID);
		assertNotNull(item);
		assertTrue(!item.validate());
	}

	@Test
	@DisplayName("InvalidItemMissingQuantity - Testing deserializing bad XML.")
	void invalidMissingQuantity()
	{
		Item item = deserializeXMLToItemObject(MISSING_QUANTITY);
		assertNotNull(item);
		assertTrue(!item.validate());
	}
}





















