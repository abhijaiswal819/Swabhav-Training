package com.aurionpro.test;

import com.aurionpro.model.AddOperation;
import com.aurionpro.model.MultiplyOperation;
import com.aurionpro.model.OperationStrategy;

public class StrategyTest {

	public static void main(String[] args) {
		OperationStrategy op=new OperationStrategy(new AddOperation());
		System.out.println("Addition is: "+op.doOperation(10, 20));
		op.setOperation(new MultiplyOperation());
		System.out.println("Multiplication is: "+op.doOperation(10,20));
	}

}
