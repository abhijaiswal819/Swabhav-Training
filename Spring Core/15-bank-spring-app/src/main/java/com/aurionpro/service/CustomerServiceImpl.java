package com.aurionpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.aurionpro.entity.Accounts;
import com.aurionpro.entity.Customer;
import com.aurionpro.repository.AccountsRepository;
import com.aurionpro.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private AccountsRepository accountsRepository;
	
	@Override
	public ResponseEntity<String> saveCustomer(Customer customerData) {
		Customer dbData = customerRepository.save(customerData);
		totalBalance(dbData);
		return ResponseEntity.ok("Customer data saved");
	}

	private void totalBalance(Customer dbData) {
		
		Customer customer = customerRepository.findById(dbData.getCustomerId()).get();
		List<Accounts> accounts = customer.getAccounts();
		double totalBalance = 0;
		for(Accounts x : accounts) {
			double bal = x.getBalance();
			totalBalance+=bal;
		}
		dbData.setTotalBalance(totalBalance);
		dbData.setCustomerId(dbData.getCustomerId());
		customerRepository.save(dbData);
		System.out.println("Current Total Balance is "+totalBalance);
	}

	@Override
	public Customer getCustomerById(Long customerId) {
		return customerRepository.findById(customerId).get();
	}

	@Override
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	//@Bean
	@Override
	public ResponseEntity<String> updateCustomerDetails(Customer customerData) {
		//customerRepository.save(customerData);
		Customer customer = customerRepository.findById(customerData.getCustomerId()).get();
		customer.setFirstName(customerData.getFirstName());
		customer.setLastName(customer.getLastName());
		customerRepository.save(customer);
//		customerRepository.updateCustomer(customerData.getFirstName(), customerData.getLastName(), customerData.getCustomerId());
		return ResponseEntity.ok("Customer data updated");
	}

	@Override
	public ResponseEntity<String> createAccount(Customer accountData) {
		Customer customer = customerRepository.findById(accountData.getCustomerId()).get();
		List<Accounts> accountList = customer.getAccounts();
		accountList.addAll(accountData.getAccounts());
		customer.setAccounts(accountList);
		Customer dbData = customerRepository.save(customer);
		totalBalance(dbData);
		return ResponseEntity.ok("Account created");
	}

}
