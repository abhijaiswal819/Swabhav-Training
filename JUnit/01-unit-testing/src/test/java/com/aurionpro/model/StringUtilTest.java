package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class StringUtilTest {

	StringUtil util;

	@BeforeAll
	void testBeforeAll() {
		util = new StringUtil();
	}

	@Test
	void testTruncateAInsecondIndex() {
		assertEquals("SD", util.truncateAInFirst2Place("AASD"));
	}

	@Test
	void testTruncateAInsecondIndex1() {
		assertEquals("SD", util.truncateAInFirst2Place("ASD"));
	}

	@Test
	void testTruncateAInsecondIndex2() {
		assertEquals("SDwe", util.truncateAInFirst2Place("SDwe"));
	}

	@Test
	void testTruncateAInsecondIndex3() {
		assertEquals("SDE", util.truncateAInFirst2Place("SADE"));
	}

	@Test
	void testcheckFirstandLast2Equal() {
		assertEquals(false, util.checkFirstandLast2Equal("ASA"));
	}

	@Test
	void testcheckFirstandLast2Equal1() {
		assertEquals(false, util.checkFirstandLast2Equal("ASDSA"));
	}

	@Test
	void testcheckFirstandLast2Equal2() {
		assertEquals(true, util.checkFirstandLast2Equal("ASDAS"));
	}

}
