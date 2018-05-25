package com.example.XMLExample;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement
public class ShoppingCart
{
	@XmlElement(name="customer")
	public Customer customer;

	@XmlElementWrapper(name="cartitems")
	@XmlElement(name="item")
	public ArrayList<Item> cartItems;

	@XmlElement(name="deliveryTo")
	public DeliveryTo deliveryTo;

}