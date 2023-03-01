package com.aurionpro.model;

public interface IDaoAbstractFactory {

	IDao CreateDao(String type);
}
