package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ResultAnalyzerTest {
	ResultAnalyzer resultAnalyzer;
	Board board;

	@BeforeEach
	void init() {
		resultAnalyzer = new ResultAnalyzer();
		board = resultAnalyzer.getBoard();
	}

	@Test
	void testAnalyzeResult_CheckTestHorizontalWinRow1() throws CellAlreadyMarkedException {
		Cell[] cells = board.getCells();
		cells[0].setMark(MarkType.X);
		cells[1].setMark(MarkType.X);
		cells[2].setMark(MarkType.X);

		assertEquals(ResultType.WIN, resultAnalyzer.analyzeResult());

	}

	@Test
	void testAnalyzeResult_CheckTestHorizontalWinRow2() throws CellAlreadyMarkedException {
		Cell[] cells = board.getCells();
		cells[3].setMark(MarkType.X);
		cells[4].setMark(MarkType.X);
		cells[5].setMark(MarkType.X);

		assertEquals(ResultType.WIN, resultAnalyzer.analyzeResult());

	}

	@Test
	void testAnalyzeResult_CheckTestHorizontalWinRow3() throws CellAlreadyMarkedException {
		Cell[] cells = board.getCells();
		cells[6].setMark(MarkType.X);
		cells[7].setMark(MarkType.X);
		cells[8].setMark(MarkType.X);

		assertEquals(ResultType.WIN, resultAnalyzer.analyzeResult());

	}

	@Test
	void testAnalyzeResult_CheckTestVerticalWinCol1() throws CellAlreadyMarkedException {
		Cell[] cells = board.getCells();
		cells[0].setMark(MarkType.X);
		cells[3].setMark(MarkType.X);
		cells[6].setMark(MarkType.X);

		assertEquals(ResultType.WIN, resultAnalyzer.analyzeResult());

	}

	@Test
	void testAnalyzeResult_CheckTestVerticalWinCol2() throws CellAlreadyMarkedException {
		Cell[] cells = board.getCells();
		cells[1].setMark(MarkType.X);
		cells[4].setMark(MarkType.X);
		cells[7].setMark(MarkType.X);

		assertEquals(ResultType.WIN, resultAnalyzer.analyzeResult());

	}

	@Test
	void testAnalyzeResult_CheckTestVerticalWinCol3() throws CellAlreadyMarkedException {
		Cell[] cells = board.getCells();
		cells[2].setMark(MarkType.X);
		cells[5].setMark(MarkType.X);
		cells[8].setMark(MarkType.X);

		assertEquals(ResultType.WIN, resultAnalyzer.analyzeResult());

	}

	@Test
	void testAnalyzeResult_CheckTestDiagonal1() throws CellAlreadyMarkedException {
		Cell[] cells = board.getCells();
		cells[0].setMark(MarkType.X);
		cells[4].setMark(MarkType.X);
		cells[8].setMark(MarkType.X);

		assertEquals(ResultType.WIN, resultAnalyzer.analyzeResult());

	}

	@Test
	@DisplayName("Diagonal 2 win check")
	void testAnalyzeResult_CheckTestDiagonal2() throws CellAlreadyMarkedException {
		Cell[] cells = board.getCells();
		cells[2].setMark(MarkType.X);
		cells[4].setMark(MarkType.X);
		cells[6].setMark(MarkType.X);

		assertEquals(ResultType.WIN, resultAnalyzer.analyzeResult());

	}

	@Test
	void testAnalyzeResult_CheckTestDraw() throws CellAlreadyMarkedException {
		Cell[] cells = board.getCells();
		cells[0].setMark(MarkType.X);
		cells[1].setMark(MarkType.O);
		cells[2].setMark(MarkType.X);

		cells[3].setMark(MarkType.X);
		cells[4].setMark(MarkType.X);
		cells[5].setMark(MarkType.O);

		cells[6].setMark(MarkType.O);
		cells[7].setMark(MarkType.X);
		cells[8].setMark(MarkType.O);

		assertEquals(ResultType.DRAW, resultAnalyzer.analyzeResult());

	}

	@Test
	void testAnalyzeResult_CheckTestProgress() throws CellAlreadyMarkedException {
		Cell[] cells = board.getCells();
		cells[0].setMark(MarkType.X);
		cells[1].setMark(MarkType.O);
		cells[2].setMark(MarkType.X);

		cells[3].setMark(MarkType.X);
		cells[4].setMark(MarkType.X);
		cells[5].setMark(MarkType.O);

		assertEquals(ResultType.PROGRESS, resultAnalyzer.analyzeResult());

	}

}
