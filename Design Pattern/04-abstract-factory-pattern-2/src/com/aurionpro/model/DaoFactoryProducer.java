package com.aurionpro.model;

public class DaoFactoryProducer {
	
	static DaoFactoryProducer instance;

	private DaoFactoryProducer() {
	}
	
	public static DaoFactoryProducer getInstance() {
		if (instance == null) {
			instance = new DaoFactoryProducer();
		}
		return instance;
	}
		
	public IDaoAbstractFactory produce(String factoryType) {
		if (factoryType.equalsIgnoreCase("Xml"))
			return new XMLDaoFactory();
		else
			return new DBDaoFactory();
	}
	
//	public IDaoAbstractFactory produce(String factoryType) {
//		if (factoryType.equalsIgnoreCase("Xml"))
//			return new XMLDaoFactory();
//		else
//			return new DBDaoFactory();
//	}

}
