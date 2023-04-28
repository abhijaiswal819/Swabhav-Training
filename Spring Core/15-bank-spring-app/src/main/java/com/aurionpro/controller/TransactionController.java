package com.aurionpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.entity.Customer;
import com.aurionpro.entity.Transaction;
import com.aurionpro.service.CustomerService;
import com.aurionpro.service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	private TransactionService transactionService;
	
	@PostMapping("/saveTransaction")
	public ResponseEntity<String> saveTransaction(@RequestBody Transaction transactionData){
		return transactionService.saveTransaction(transactionData);
	}
	
	@GetMapping("/getTransactionById/{transactionId}")
	public Transaction getTransactionById(@PathVariable Long transactionId){
		return transactionService.getTransactionById(transactionId);
	}
	
	@GetMapping("/getTransactions")
	public List<Transaction> getTransactions(){
		return transactionService.getTransactions();
	}
	
	@PutMapping("/updateTransactionDetails")
	public ResponseEntity<String> updateTransactionDetails(@RequestBody Transaction transactionData){
		return transactionService.updateTransactionDetails(transactionData);
	}
	
	@RequestMapping(value = "/transactions/{pageNumber}/{pageSize}", method = RequestMethod.GET)
	public Page<Transaction> transactionPagination(@PathVariable int pageNumber, @PathVariable int pageSize) {
		return transactionService.getTransactionPagination(pageNumber, pageSize);
	}

	@RequestMapping(value = "/transactions/{pageNumber}/{pageSize}/{sortProperty}", method = RequestMethod.GET)
	public Page<Transaction> transactionPaginationSort(@PathVariable int pageNumber, @PathVariable int pageSize,
			@PathVariable String sortProperty) {
		return transactionService.getTransactionPaginationInSort(pageNumber, pageSize, sortProperty);
	}

}
