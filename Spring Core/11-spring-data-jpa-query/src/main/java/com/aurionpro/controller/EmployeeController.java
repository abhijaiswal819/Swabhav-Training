package com.aurionpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.entity.Employee;
import com.aurionpro.service.EmployeeService;

@RestController
@RequestMapping("empapp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employee")
	public List<Employee> findAllEmployee() {
		return employeeService.findAllEmployees();

	}
	
	@GetMapping("/employees/active/{activeState}")
	public List<Employee> findEmployeesByActiveState(@PathVariable Boolean activeState){
		return employeeService.findEmployeesByActiveState(activeState);
	}
	
	@GetMapping("/employees/designation")
	public List<Employee> findEmployeesByDesignation(@RequestParam String role){
		return employeeService.findEmployeesByDesignation(role);
	}

	@GetMapping("/employees/designationList")
	public List<Employee> findEmployeesByDesignationList(@RequestParam List<String> roles){
		return employeeService.findEmployeesByDesignationList(roles);
	}
	
	@GetMapping("/employees/designationListAndActiveState")
	public List<Employee> findEmployeesByDesignationListAndActiveState(@RequestParam List<String> roles, Boolean activeState){
		return employeeService.findEmployeesByDesignationListAndActiveState(roles, activeState);
	}
	
	@PostMapping("/employee")
	public List<Employee> addMultipleEmployees(@RequestBody List<Employee> employees) {

		return employeeService.addEmployees(employees);
	}
	
	@GetMapping("/employees/salary/{salary}")
	public List<Employee> findEmployeesHavingSalary(@PathVariable double salary){
		return employeeService.findEmployeesHavingSalary(salary);
	}
	
	@GetMapping("/employees/topsalary/{count}")
	public List<Employee> findTopEmployeesSalary(@PathVariable int count){
		return employeeService.findTopEmployeesSalary(count);
	}
	
	@GetMapping("/employees/nameList")
	public List<Employee> findEmployeesByNameList(@RequestParam List<String> names){
		return employeeService.findEmployeesByNameList(names);
	}
}
