package com.aurionpro.model;

public abstract class Shape {

	// Composition - implementor
	protected IColor color;

	// constructor with implementor as input argument
	public Shape(IColor c) {
		this.color = c;
	}

	abstract public void applyColor();
}
