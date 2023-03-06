package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CellTest {

	Cell cell;

	@BeforeEach
	void init() {
		cell= new Cell();
	}

	@Test
	void testGetMark_checkIsEmpty() {
		assertEquals(MarkType.EMPTY, cell.getMark());
	}
	
	@Test
	void testSetMark_setXOToACell() {
		cell.setMark(MarkType.X);
		assertEquals(MarkType.X, cell.getMark());
	}
	
	@Test
	void testSetMark_cellAlreadyMarkedException() {
		cell.setMark(MarkType.X);
		assertThrows(CellAlreadyMarkedException.class,()->cell.setMark(MarkType.X));
	}

}
