package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TransferRepository;
import com.example.demo.model.AccountHolder_Transfer;
import com.example.demo.service.TransferService;


@RestController
@RequestMapping("transfer-service")
public class TransferController {

	
	@Autowired
    TransferRepository repository;
	
	@Autowired
	TransferService service;
	
	
	//Getting all withdraw transactions
	 @GetMapping("/getallaccounts")
	 public List<AccountHolder_Transfer > getallaccounts()
	 {
		 return repository.findAll();
	 }
	
	//Get with draw basing on account number
	 
	 @GetMapping("/getaccountbynumber/{accoutnumber}")
	 public AccountHolder_Transfer getaccountbyaccountNumber(@PathVariable("accoutnumber") int accoutnumber)
	 {
		 AccountHolder_Transfer  acc_withdrw= repository.findByAccountNumber(accoutnumber);
		return acc_withdrw;
	 }
	
	//insert with draw transaction
	 @PostMapping("/transferamount")
	 public AccountHolder_Transfer withdrawamountFromacc(@RequestBody AccountHolder_Transfer accounttransfer)
	 {
		 
		 AccountHolder_Transfer amounttransfer=service.accounttransfer(accounttransfer);
		 
		 return amounttransfer;
		 
	 }
	
}
