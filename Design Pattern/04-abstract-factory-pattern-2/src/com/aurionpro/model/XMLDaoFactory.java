package com.aurionpro.model;

public class XMLDaoFactory implements IDaoAbstractFactory {

	@Override
	public IDao CreateDao(String type) {
		if(type.equalsIgnoreCase("emp")) {
			return new XMLEmpDao();
		}
		if(type.equalsIgnoreCase("dept")) {
			return new XMLDeptDao();
		}
		return null;
		
	}

}
