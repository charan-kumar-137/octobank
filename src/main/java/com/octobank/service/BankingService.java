package com.octobank.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.octobank.domain.AccountInformation;
import com.octobank.domain.CustomerDetails;
import com.octobank.domain.TransactionDetails;
import com.octobank.domain.TransferDetails;

public interface BankingService {

    public List<CustomerDetails> findAll();

    public ResponseEntity<Object> addCustomer(CustomerDetails customerDetails);

    public CustomerDetails findByCustomerNumber(Long customerNumber);

    public ResponseEntity<Object> updateCustomer(CustomerDetails customerDetails, Long customerNumber);

    public ResponseEntity<Object> deleteCustomer(Long customerNumber) ;

    public ResponseEntity<Object> findByAccountNumber(Long accountNumber);

    public ResponseEntity<Object> addNewAccount(AccountInformation accountInformation, Long customerNumber);

    public ResponseEntity<Object> transferDetails(TransferDetails transferDetails, Long customerNumber);

    public List<TransactionDetails> findTransactionsByAccountNumber(Long accountNumber);

}