package com.aurionpro.test;

import com.aurionpro.model.IAccess;
import com.aurionpro.model.ProxyEmployeeInternetAccess;

public class InternetTest {

	public static void main(String[] args) {
		IAccess internetAccess = new ProxyEmployeeInternetAccess("RAMAN");
        internetAccess.grantInternetAccessToEmployees();
	}

}
