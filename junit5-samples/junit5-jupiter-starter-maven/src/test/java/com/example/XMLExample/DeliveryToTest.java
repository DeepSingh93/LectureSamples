package com.example.XMLExample;

import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class DeliveryToTest
{
	/*  In the CustomerTest class I showed how to serialize the Customer object into XML.
		In this test I will show deserializing XML into a DeliveryTo object, and we can then
		do some validation on that.
	*/
	@Test
	@DisplayName("DeliveryToTest - Testing deserializing the DeliveryTo object")
	void deliveryToDeSerializationTest()
	{
		/* This is how you would do it with a file:

		try
		{
			File file = new File("C:\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(DeliveryTo.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			DeliveryTo deliveryTo = (DeliveryTo) jaxbUnmarshaller.unmarshal(file);
			System.out.println(deliveryTo);

		} 
		catch (JAXBException e)
		{
			e.printStackTrace();
		}
		
		*/
		/* 	I don't want to rely on a file in my repo for unit tests, so I will just put
			the data below and use a stringreader.  

			WARNING WARNING WARNING:
			Note how the XML in my string constant suddenly is VERY particular about
			capitalization of elements.  This is because JABX uses Java's built in stuff
			to figure out the right class setters and getters to call during serialization
			and deserialization.  You can solve this problem three ways:
			- Follow this advice: https://stackoverflow.com/questions/4375176/how-to-ignore-casing-of-element-names-in-jaxb
			- Use Eclipse's moxy (I think that's what it's called) which has a nmarshallerProperties.UNMARSHALLING_CASE_INSENSITIVE property
			- Just string replace the incoming XML, looking for nodes like <deliveryto> and replace them with <deliveryTo>, i.e. force
			  the capitilization you require for all the open and close element tags in the XML.
		*/
		final String TEST_XML = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
								"<deliveryTo>" +
								"	<name>Mrs. Jane Smith</name>" +
								"	<street>35 Streetname</street>" +
								"	<city>Halifax</city>" +
								"	<province>NS</province>" +
								"	<postalCode>B2T1A4</postalCode>" +
								"</deliveryTo>";
		try
		{
			StringReader reader = new StringReader(TEST_XML);
			JAXBContext jaxbContext = JAXBContext.newInstance(DeliveryTo.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			DeliveryTo deliveryTo = (DeliveryTo) jaxbUnmarshaller.unmarshal(reader);
			assertEquals("Mrs. Jane Smith", deliveryTo.getName());
			assertEquals("35 Streetname", deliveryTo.getStreet());
			assertEquals("Halifax", deliveryTo.getCity());
			assertEquals("NS", deliveryTo.getProvince());
			assertEquals("B2T1A4", deliveryTo.getPostalCode());
		} 
		catch (JAXBException e)
		{
			e.printStackTrace();
		}
	}
}










