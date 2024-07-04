package com.example.demo.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;


class ProductTest {

	@Test
	void buyProductTest() {
		Product prod = new Product(12.5, 10);
		double cost = prod.buyProduct(2);
		assertEquals(cost, 2*12.5);
		assertEquals(8,prod.getInven());
		cost = prod.buyProduct(3);
		assertEquals(cost, 3*12.5);
		assertEquals(5,prod.getInven());
		
	}

	@Test
	void purchaseNegativeProducts() {
		try {
			Product prod = new Product(12.5, 10);
			prod.buyProduct(-2);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("negative value", e.getMessage());
		}
		
	}

}

