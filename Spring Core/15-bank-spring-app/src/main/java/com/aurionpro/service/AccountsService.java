package com.aurionpro.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import com.aurionpro.entity.Accounts;

public interface AccountsService {

	ResponseEntity<String> saveAccount(Accounts accountData);

	Accounts getAccountById(Long accountId);

	List<Accounts> getAccounts();

	ResponseEntity<String> updateAccountDetails(Accounts accountData);
	
	Page<Accounts> getAccountPagination(int pageNumber, int pageSize);

	Page<Accounts> getAccountPaginationInSort(int pageNumber, int pageSize, String sortProperty);

}
