package com.aurionpro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.aurionpro.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("select e from Employee e")
	List<Employee> findAllEmployee();

	// find employees by active state
//	@Query("select e from Employee e where e.active =:theActive")
//	List<Employee> findEmployeesByActiveState(@Param("theActive") Boolean activeState);
	// ORRRRRRRRRR
	@Query("select e from Employee e where e.active =?1")
	List<Employee> findEmployeesByActiveState(Boolean activeState);

	// find employees by designation
	@Query("select e from Employee e where e.designation in ?1")
	List<Employee> findEmployeesByDesignation(String role);

	// find employees by designation list
	@Query("select e from Employee e where e.designation in ?1")
	List<Employee> findEmployeesByDesignationList(List<String> roles);

	// find employees by designation list and active state
	@Query("select e from Employee e where e.designation in ?1 and e.active =?2")
	List<Employee> findEmployeesByDesignationListAndActiveState(List<String> roles, Boolean activeState);

	// find all employees having salary less than 50000
	@Query("select e from Employee e where e.salary >?1")
	List<Employee> findEmployeesHavingSalary(double salary);

	// find top 3 salaried employee
	@Query("select e from Employee e order by e.salary desc limit ?1")
	List<Employee> findTopEmployeesSalary(int count);

	// find Employee by name -> List
	@Query("select e from Employee e where e.name in ?1")
	List<Employee> findEmployeesByNameList(List<String> names);

	// Named queries we need to do in same project

	// One to One Mapping implement in new project
	// Both Unidirectional and Bidirectional
}