package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AccountHolder_Withdraw;

@Repository
public interface WithdrawRepository extends JpaRepository<AccountHolder_Withdraw, Integer>{

		
		AccountHolder_Withdraw findByAccountNumber(int accountnumber);
	
}
