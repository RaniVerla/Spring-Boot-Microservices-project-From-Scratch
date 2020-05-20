package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AccountHolder_Transfer;

@Repository
public interface TransferRepository extends JpaRepository<AccountHolder_Transfer, Integer> {
	
	
	AccountHolder_Transfer findByAccountNumber(int accountnumber);

}
