package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {

	Board board;
	Cell[] cells;

	@BeforeEach
	void init() {
		board = new Board();
		cells = board.getCells();
	}

	@Test
	void test_allCellsEmpty() {
		boolean flag = true;
		for (Cell x : cells) {
			if (x.getMark() != MarkType.EMPTY) {
				flag = false;
				break;
			}
		}
		assertTrue(flag);
	}

	@Test
	void testSetCellMark_markAtLocation() {
		board.setCellMark(4, MarkType.X);
		assertEquals(MarkType.X, cells[4].getMark());
	}

	@Test
	void testSetCellMark_InvalidLocation() {
		assertThrows(InvalidLocationException.class, () -> board.setCellMark(10, MarkType.X));
	}
	
	@Test
	void testIsBoardFull() {
		for (int i=0; i<9;i++) {
			board.setCellMark(i, MarkType.X);
		}
		assertEquals(true, board.isBoardFull());
	}
	
	@Test
	void testSetCellMark_CellAlreadyMarkedException() {
		board.setCellMark(1, MarkType.X);
		assertThrows(CellAlreadyMarkedException.class, ()->board.setCellMark(1, MarkType.X));
	}

}
