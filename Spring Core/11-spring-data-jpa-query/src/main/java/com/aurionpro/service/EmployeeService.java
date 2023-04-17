package com.aurionpro.service;

import java.util.List;

import com.aurionpro.entity.Employee;

public interface EmployeeService {

	List<Employee> findAllEmployees();

	List<Employee> addEmployees(List<Employee> employees);

	List<Employee> findEmployeesByActiveState(Boolean activeState);

	List<Employee> findEmployeesByDesignation(String role);
	
	List<Employee> findEmployeesByDesignationList(List<String> roles);

	List<Employee> findEmployeesByDesignationListAndActiveState(List<String> roles, Boolean activeState);

	List<Employee> findEmployeesHavingSalary(double salary);

	List<Employee> findTopEmployeesSalary(int count);

	List<Employee> findEmployeesByNameList(List<String> names);

	List<Employee> getAllEmployees();

	

}
