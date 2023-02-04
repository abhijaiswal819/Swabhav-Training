package com.aurionpro.model;

public class Rectangle {
	
	private int length;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length=getCorrectedValue(length);
	}
	
	private int getCorrectedValue(int value) {
		if (value<1) {
			return 1;
		}
		if(value>100) {
			return 100;
		}
		return value;
	}

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width=getCorrectedValue(width);
	}
	private int width;
	
	private color color;
	
	public color getColor() {
		return color;
	}
	public void setColor(color color) {
		this.color=color;
	}
}
