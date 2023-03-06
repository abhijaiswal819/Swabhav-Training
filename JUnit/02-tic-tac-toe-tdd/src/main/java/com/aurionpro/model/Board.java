package com.aurionpro.model;

public class Board {

	private Cell[] cells = new Cell[9];

	public Board() {
		super();
		for (int i = 0; i < cells.length; i++) {
			cells[i] = new Cell();
		}
	}
	
	public Cell[] getCells() {
		return cells;
	}

	public boolean isBoardFull() {
		for (Cell x : cells) {
			if (x.getMark() == MarkType.EMPTY) {
				return false;
			}
		}
		return true;
	}

	public void setCellMark(int loc, MarkType mark) {
		if (loc<0 || loc > 8) {
			throw new InvalidLocationException("Invalid Location");
		}
		cells[loc].setMark(mark);
	}
}
