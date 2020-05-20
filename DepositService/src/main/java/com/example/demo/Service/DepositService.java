package com.example.demo.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DepositRepository;
import com.example.demo.model.AccountHolder_Deposit;

@Service
public class DepositService {
	
	@Autowired
	DepositRepository depositRepository;
	
	
	public AccountHolder_Deposit depositAmount(AccountHolder_Deposit accdeposit)
	{
		
		double currentbalnace=accdeposit.getAccountBalance();
		double depositingamount=accdeposit.getDepositAmount();
		double newbalance=currentbalnace+depositingamount;
		accdeposit.setDepositTime(LocalDateTime.now());
		
		accdeposit.setPreviousBalance(currentbalnace);
		accdeposit.setAccountBalance(newbalance);
		
		AccountHolder_Deposit accdepositnew=depositRepository.save(accdeposit);
		
		System.out.println(accdepositnew);
		return accdepositnew;
	}

}
