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

public class ShoppingCartTest
{
	/*
		Pay close attention to the capitilization of <shoppingCart>, you'll need to solve this
		in your code because you can't expect the XML the TA uses to have any particular capitlization.
	*/
	static final String SHOPPING_CART_XML = "<shoppingCart>\n" +
											"	<customer>\n" +
											"		<creditCard>4138389928849938</creditCard>\n" +
											"		<email>rhawkey@dal.ca</email>\n" +
											"	</customer>\n" +
											"	<cartitems>\n" +
											"		<item>\n" +
											"			<UniqueID>1234</UniqueID>\n" +
											"			<Quantity>2</Quantity>\n" +
											"		</item>\n" +
											"		<item>\n" +
											"			<UniqueID>5678</UniqueID>\n" +
											"			<Quantity>1</Quantity>\n" +
											"		</item>\n" +
											"	</cartitems>\n" +
											"	<deliveryTo>" +
											"		<name>Mrs. Jane Smith</name>" +
											"		<street>35 Streetname</street>" +
											"		<city>Halifax</city>" +
											"		<province>NS</province>" +
											"		<postalCode>B2T1A4</postalCode>" +
											"	</deliveryTo>"	+
											"</shoppingCart>";

	@Test
	@DisplayName("ShoppingCartTest")
	void shoppingCartTest()
	{
		try
		{
			StringReader reader = new StringReader(SHOPPING_CART_XML);
			JAXBContext jaxbContext = JAXBContext.newInstance(ShoppingCart.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			ShoppingCart cart = (ShoppingCart) jaxbUnmarshaller.unmarshal(reader);
			assertNotNull(cart);
			assertEquals("rhawkey@dal.ca", cart.customer.getEmail());
			assertEquals("4138389928849938", cart.customer.getCreditCard());
			assertEquals(2, cart.cartItems.size());
			assertEquals("Mrs. Jane Smith", cart.deliveryTo.getName());
			assertEquals("35 Streetname", cart.deliveryTo.getStreet());
			assertEquals("Halifax", cart.deliveryTo.getCity());
			assertEquals("NS", cart.deliveryTo.getProvince());
			assertEquals("B2T1A4", cart.deliveryTo.getPostalCode());
		} 
		catch (JAXBException e)
		{
			e.printStackTrace();
		}
	}

}