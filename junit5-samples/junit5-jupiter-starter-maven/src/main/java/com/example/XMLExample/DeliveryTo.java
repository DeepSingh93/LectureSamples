package com.example.XMLExample;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DeliveryTo
{
	/*
	<!-- The delivery address to send the order to. -->
	<DeliveryTo>
		<Name>Mrs. Jane Smith</Name>
		<Street>35 Streetname</Street>
		<City>Halifax</City>
		<Province>NS</Province>
		<PostalCode>B2T1A4</PostalCode>
	</DeliveryTo>
	*/
	String name;
	String street;
	String city;
	String province;
	String postalCode;

	@XmlElement
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

	@XmlElement
	public void setStreet(String street)
	{
		this.street = street;
	}
	public String getStreet()
	{
		return street;
	}

	@XmlElement
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getCity()
	{
		return city;
	}

	@XmlElement
	public void setProvince(String province)
	{
		this.province = province;
	}
	public String getProvince()
	{
		return province;
	}

	@XmlElement
	public void setPostalCode(String postalCode)
	{
		this.postalCode = postalCode;
	}
	public String getPostalCode()
	{
		return postalCode;
	}
}