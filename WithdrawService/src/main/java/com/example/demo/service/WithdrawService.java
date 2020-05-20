package com.example.demo.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.WithdrawRepository;
import com.example.demo.model.AccountHolder_Withdraw;

@Service
public class WithdrawService {
	
	@Autowired
	WithdrawRepository repository;

	public AccountHolder_Withdraw withdrawAmount(AccountHolder_Withdraw accountwithdraw) {

		double currentbalance=accountwithdraw.getAccountBalance();
		double withdrawamount=accountwithdraw.getWithdrawAmount();
		accountwithdraw.setPreviousBalance(currentbalance);
	    double newbalance=currentbalance-withdrawamount;
	    accountwithdraw.setAccountBalance(newbalance);
	    accountwithdraw.setWithdrawTime(LocalDateTime.now());
	    
	    
	    AccountHolder_Withdraw withdrawamt=repository.save(accountwithdraw);
	    
	    System.out.println(withdrawamt);
		
		return withdrawamt;
	}
	
	
	
	

}
