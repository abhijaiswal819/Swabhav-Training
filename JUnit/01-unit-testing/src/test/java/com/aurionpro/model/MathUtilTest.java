package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class MathUtilTest {
	MathUtil obj;// = new MathUtil();

	@BeforeEach
	void init() {
		obj = new MathUtil();
		System.out.println("Before Each");
	}

	@BeforeAll
	void beforeAll() {
		System.out.println("Before All");
	}

	@AfterEach
	void afterEach() {
		System.out.println("After Each");
	}

	@AfterAll
	void afterAll() {
		System.out.println("After All");
	}

	@Test
	void testAddition() {
		// assertEquals(40, obj.addition(10, 20));
		assertTrue(obj.addition(10, 20) == 30);
	}

	@Test
	void testDivision() {
		assertEquals(2, obj.division(10, 5));
	}

	@Test
	void testDivision_ArithmeticException() {
		assertThrows(ArithmeticException.class, () -> obj.division(5, 0));
	}

	@Test
	void testSortArray() {
		int[] arr = { 10, 40, 30, 2, 1 };
		int[] expected = { 1, 2, 10, 30, 40 };
		assertArrayEquals(expected, obj.sortArray(arr));
	}

}