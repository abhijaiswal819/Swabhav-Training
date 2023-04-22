package com.aurionpro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aurionpro.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	//@Modifying
//	@Query("update customer_table set first_last=?1,last_name=?2 where customer_id=?3")
//	//@Transactional
//	List<Customer> updateCustomer(String firstName, String lastName, Long customerId);
}
