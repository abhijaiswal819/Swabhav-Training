package com.aurionpro.model;

public class OperationStrategy {
	IOperation operation;
	
	public void setOperation(IOperation operation) {
		this.operation = operation;
	}

	public OperationStrategy(IOperation operation) {
		super();
		this.operation = operation;
	}

	public int doOperation(int a, int b) {
		return operation.doOperation(a, b);
	}
}
