package com.example.demo.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TransferRepository;
import com.example.demo.model.AccountHolder_Transfer;

@Service
public class TransferService {
	
	@Autowired
	TransferRepository repository;
	
	
	public AccountHolder_Transfer accounttransfer(AccountHolder_Transfer accoutrans)
	{
		double currentbalance=accoutrans.getAccountBalance();
		double withdrawamount=accoutrans.getTransferAmount();
		accoutrans.setPreviousBalance(currentbalance);
	    double newbalance=currentbalance-withdrawamount;
	    accoutrans.setAccountBalance(newbalance);
	    accoutrans.setTransferTime(LocalDateTime.now());
		
		AccountHolder_Transfer accountransfer=repository.save(accoutrans);
		
		System.out.println(accountransfer);
		
		return accountransfer;
		
	}

}
