package com.aurionpro.model;

public class ProxyEmployeeInternetAccess implements IAccess {
	private String employeeName;
	private EmployeeInternetAccess employeeInternetAccess;

	public ProxyEmployeeInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public void grantInternetAccessToEmployees() {
		if (getRole(employeeName) > 4) {
			employeeInternetAccess = new EmployeeInternetAccess(employeeName);
			employeeInternetAccess.grantInternetAccessToEmployees();
		} else {
			System.out.println("No Internet access granted. Your job level is below 5");
		}
	}

	public int getRole(String empName) {
		int count = empName.length();
		return count;
	}
}
