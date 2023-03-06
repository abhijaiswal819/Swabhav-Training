package com.aurionpro.model;

public class Cell {

	private MarkType mark;

	public Cell() {
		super();
		this.mark = MarkType.EMPTY;
	}

	public boolean isEmpty() {
		if (mark.equals(MarkType.EMPTY)) {
			return true;
		}
		return false;
	}

	public MarkType getMark() {
		return mark;
	}

	public void setMark(MarkType mark) {
		if (!isEmpty()) {
			throw new CellAlreadyMarkedException("Cell is already marked.");
		}
		this.mark = mark;
	}
}
