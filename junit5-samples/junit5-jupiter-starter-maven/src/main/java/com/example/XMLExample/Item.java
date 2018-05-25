package com.example.XMLExample;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Item
{
	/*
	<!-- An item in the shopping cart. -->
	<Item>
		<!-- The item unique identifier in the sites database -->
		<UniqueID>1234</UniqueID>
		<!-- The quantity ordered. -->
		<Quantity>2</Quantity>
	</Item>
	*/
	String uniqueID;
	String quantity;

	@XmlElement
	void setUniqueID(String uniqueID)
	{
		this.uniqueID = uniqueID;
	}
	String getUniqueID()
	{
		return uniqueID;
	}

	@XmlElement
	void setQuantity(String quantity)
	{
		this.quantity = quantity;
	}
	String getQuantity()
	{
		return quantity;
	}

	/*
		To maintain the blackbox principle we will ask the Item object itself
		whether it is valid, this allows users of the class to be ignorant of the
		internal storage / implementation of the Item class.  For example, the Item
		class could store the uniqueid and quantity in a dictionary, as individual class
		members (as they are here), the details are private to Item.
	*/
	boolean validate()
	{
		// Items are valid if the uniqueID is an integer, quantity is an integer,
		// quantity is > 0.
		try
		{
			Integer.parseInt(uniqueID);
		}
		catch (NumberFormatException e)
		{
			// The uniqueID member variable is not an integer.
			return false;
		}
		catch (NullPointerException e)
		{
			// The uniqueID member variable is null.
			return false;
		}
		try
		{
			int quantityValue = Integer.parseInt(quantity);
			if (quantityValue <= 0)
			{
				return false;
			}
		}
		catch (NumberFormatException e)
		{
			// Quanity is not an integer.
			return false;
		}
		catch (NullPointerException e)
		{
			// Quantity is null.
			return false;
		}
		return true;
	}
}




