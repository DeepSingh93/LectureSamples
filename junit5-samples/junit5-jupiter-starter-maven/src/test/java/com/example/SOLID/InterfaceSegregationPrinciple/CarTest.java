package com.example.SOLID.InterfaceSegregationPrinciple;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest
{
	@Test
	@DisplayName("CarTest")
	void carTest()
	{
		Car car = new Car();
		car.doors[0].openDoor();
		assertEquals(car.doors[0].isOpen, true);
	}

}
