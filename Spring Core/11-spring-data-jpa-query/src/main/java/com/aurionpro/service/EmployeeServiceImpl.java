package com.aurionpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.entity.Employee;
import com.aurionpro.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public List<Employee> findAllEmployees() {
		return repository.findAll();

	}

	@Override
	public List<Employee> addEmployees(List<Employee> employees) {
		// TODO Auto-generated method stub
		return repository.saveAll(employees);
	}

	@Override
	public List<Employee> findEmployeesByActiveState(Boolean activeState) {
		return repository.findEmployeesByActiveState(activeState);
	}

	@Override
	public List<Employee> findEmployeesByDesignation(String role) {
		return repository.findEmployeesByDesignation(role);
	}
	
	@Override
	public List<Employee> findEmployeesByDesignationList(List<String> roles) {
		return repository.findEmployeesByDesignationList(roles);
	}

	@Override
	public List<Employee> findEmployeesByDesignationListAndActiveState(List<String> roles, Boolean activeState) {
		return repository.findEmployeesByDesignationListAndActiveState(roles, activeState);
	}

	@Override
	public List<Employee> findEmployeesHavingSalary(double salary) {
		return repository.findEmployeesHavingSalary(salary);
	}

	@Override
	public List<Employee> findTopEmployeesSalary(int count) {
		return repository.findTopEmployeesSalary(count);
	}

	@Override
	public List<Employee> findEmployeesByNameList(List<String> names) {
		return repository.findEmployeesByNameList(names);
	}

	
}
