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
	
	private String color;
	private String getColorCorrectedValue(String value) {
		if (value.equalsIgnoreCase("green") || value.equalsIgnoreCase("blue")) {
			return value;
		}
		return "Red";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=getColorCorrectedValue(color);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + length;
		result = prime * result + width;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (length != other.length)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	
}
