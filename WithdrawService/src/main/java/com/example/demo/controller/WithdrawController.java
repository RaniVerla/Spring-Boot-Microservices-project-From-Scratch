package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.WithdrawRepository;
import com.example.demo.model.AccountHolder_Withdraw;
import com.example.demo.service.WithdrawService;

@RestController
@RequestMapping("/withdraw-service")
public class WithdrawController {
	
	@Autowired
    WithdrawRepository repository;
	
	@Autowired
	WithdrawService service;
	
	
	//Getting all withdraw transactions
	 @GetMapping("/getallaccounts")
	 public List<AccountHolder_Withdraw > getallaccounts()
	 {
		 return repository.findAll();
	 }
	
	//Get with draw basing on account number
	 
	 @GetMapping("/getaccountbynumber/{accoutnumber}")
	 public AccountHolder_Withdraw getaccountbyaccountNumber(@PathVariable("accoutnumber") int accoutnumber)
	 {
		 AccountHolder_Withdraw  acc_withdrw= repository.findByAccountNumber(accoutnumber);
		return acc_withdrw;
	 }
	
	//insert with draw transaction
	 @PostMapping("/withdrawamount")
	 public AccountHolder_Withdraw withdrawamountFromacc(@RequestBody AccountHolder_Withdraw accountwithdraw)
	 {
		 
		 AccountHolder_Withdraw withdraw=service.withdrawAmount(accountwithdraw);
		 
		 return withdraw;
		 
	 }
	
	

}
