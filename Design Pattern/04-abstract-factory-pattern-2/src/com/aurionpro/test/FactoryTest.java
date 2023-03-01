package com.aurionpro.test;

import com.aurionpro.model.DaoFactoryProducer;
import com.aurionpro.model.IDao;
import com.aurionpro.model.IDaoAbstractFactory;

public class FactoryTest {

	public static void main(String[] args) {
		IDaoAbstractFactory daf =DaoFactoryProducer.getInstance().produce("db");
		IDao dao=daf.CreateDao("emp");
		dao.save();
		
//		DaoFactoryProducer daf1 = new DaoFactoryProducer();
//		IDaoAbstractFactory daf = daf1.produce("db");
//		IDao dao=daf.CreateDao("emp");
//		dao.save();
		
	}

}
