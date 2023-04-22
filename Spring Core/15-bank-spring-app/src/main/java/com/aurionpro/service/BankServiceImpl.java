package com.aurionpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.aurionpro.entity.Accounts;
import com.aurionpro.entity.Bank;
import com.aurionpro.entity.Customer;
import com.aurionpro.repository.AccountsRepository;
import com.aurionpro.repository.BankRepository;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	private BankRepository bankRepository;
	
	@Autowired
	private AccountsRepository accountRepository;

	@Override
	public ResponseEntity<String> saveBank(Bank bankData) {
		bankRepository.save(bankData);
		return ResponseEntity.ok("Bank data saved");
	}

	@Override
	public Bank getBankById(Long bankId) {
		return bankRepository.findById(bankId).get();
	}

	@Override
	public List<Bank> getBanks() {
		return bankRepository.findAll();
	}

	@Override
	public ResponseEntity<String> updateBankDetails(Bank bankData) {
		bankRepository.save(bankData);
		return ResponseEntity.ok("Bank data updated");
	}

	@Override
	public ResponseEntity<String> addAccount(Bank bankData) {
		Bank bank = bankRepository.findById(bankData.getBankId()).get();
		List<Accounts> accountList = bank.getAccounts();
		Accounts account = accountRepository.findById(bankData.getBankId()).get();
		for(Accounts x: bankData.getAccounts()) {
			x.setBalance(account.getBalance());
		}
		accountList.addAll(bankData.getAccounts());
		bank.setAccounts(accountList);
		bankRepository.save(bank);
		return ResponseEntity.ok("Account added");
	}

}
